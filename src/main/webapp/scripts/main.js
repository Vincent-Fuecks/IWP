document.addEventListener('DOMContentLoaded', () => {
    const loadBtn = document.getElementById('loadBtn');
    const contentDiv = document.getElementById('content');

    loadBtn.addEventListener('click', () => {
        fetch('hello')
            .then(response => {
                if (!response.ok) {
                    throw new Error('Netzwerkantwort war nicht ok');
                }
                return response.text();
            })
            .then(data => {
                contentDiv.innerHTML = data;
            })
            .catch(error => {
                contentDiv.innerHTML = 'Fehler beim Laden der Nachricht: ' + error;
            });
    });
});
