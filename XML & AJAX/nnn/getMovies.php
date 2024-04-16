<?php
// Database connection parameters
$servername = "localhost";
$username = "root";
$password = "";
$database = "XML&AJAX";

// Create connection
$conn = new mysqli($servername, $username, $password, $database);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Retrieve actor name from the AJAX request
$actorName = $_GET['actorName'];

// SQL query to fetch movies associated with the selected actor
$sql = "SELECT movie.mname, movie.release_year 
        FROM Movie 
        INNER JOIN Actor ON Movie.mno = Actor.mno 
        WHERE Actor.aname = '$actorName'";

$result = $conn->query($sql);

// Check if there are any results
if ($result->num_rows > 0) {
    // Output data of each row
    while($row = $result->fetch_assoc()) {
        echo "<p>" . $row["mname"] . " (" . $row["release_year"] . ")</p>";
    }
} else {
    echo "No movies found for this actor.";
}

// Close connection
$conn->close();
?>
