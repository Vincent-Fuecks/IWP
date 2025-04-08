#!/bin/bash

# Stop if error is encountered
set -e

echo "Starte Maven Build: mvn clean package"
mvn clean package

WAR_FILE="target/iwp.war"

if [ ! -f "$WAR_FILE" ]; then
    echo "Fehler: WAR-Datei $WAR_FILE wurde nicht gefunden."
    exit 1
fi

TOMCAT_WEBAPPS="/opt/tomcat/webapps"
echo "Bereinige bisherige Deployments..."
sudo rm -rf "$TOMCAT_WEBAPPS/iwp" "$TOMCAT_WEBAPPS/iwp.war"

echo "Kopiere $WAR_FILE nach $TOMCAT_WEBAPPS/"
sudo cp "$WAR_FILE" "$TOMCAT_WEBAPPS/"

echo "Deployment abgeschlossen."
