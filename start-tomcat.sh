#!/bin/bash

TOMCAT_HOME="/opt/tomcat"

echo "Starte Tomcat unter $TOMCAT_HOME..."
sudo "$TOMCAT_HOME/bin/startup.sh"

echo "Tomcat wurde gestartet."
