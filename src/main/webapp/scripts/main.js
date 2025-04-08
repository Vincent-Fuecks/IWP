// Warte, bis der DOM geladen ist, und logge dann eine Nachricht in der Konsole.
document.addEventListener('DOMContentLoaded', function () {
    console.log("Hello from TypeScript!");
    // Optional: Manipuliere das DOM, beispielsweise:
    var heading = document.querySelector('h1');
    if (heading) {
        heading.textContent += " - Served via Tomcat with Java & TypeScript";
    }
});
