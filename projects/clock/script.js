document.addEventListener('DOMContentLoaded', function () {
    // Get references to the clock hands
    var hourHand = document.getElementById('hour');
    var minuteHand = document.getElementById('min');
    var secondHand = document.getElementById('sec');

    function updateClock() {
        // Get the current time
        var now = new Date();
        var hours = now.getHours() % 12; // Ensure 12-hour format
        var minutes = now.getMinutes();
        var seconds = now.getSeconds();

        // Calculate rotation angles for each hand
        var hourRotation = (hours + minutes / 60) * 360 / 12;
        var minuteRotation = (minutes + seconds / 60) * 360 / 60;
        var secondRotation = seconds * 360 / 60;

        // Apply rotations to clock hands
        hourHand.style.transform = 'rotate(' + hourRotation + 'deg)';
        minuteHand.style.transform = 'rotate(' + minuteRotation + 'deg)';
        secondHand.style.transform = 'rotate(' + secondRotation + 'deg)';
    }

    // Update the clock every second
    setInterval(updateClock, 1000);

    // Initial call to set the initial clock state
    updateClock();
});
