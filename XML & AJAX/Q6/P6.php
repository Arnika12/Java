 <!--
// $a_name = $_GET['a_name'];
// $db_connection = pg_connect("host=localhost dbname=bca_programs user=your_username password=your_password");
// if (!$db_connection) {
//     die("Error in connection: " . pg_last_error());
// }

// $query = "SELECT movie.m_no, m_name, r_year FROM movie, actor_slip_14 WHERE a_name='$a_name' AND actor_slip_14.m_no=movie.m_no";
// $result = pg_query($db_connection, $query);
// if (!$result) {
//     die("Error in query: " . pg_last_error());
// }

// echo "<table border=1>";
// echo "<tr><th>Movie No</th><th>Movie Name</th><th>Release Year</th></tr>";
// while ($row = pg_fetch_array($result)) {
//     echo "<tr>";
//     echo "<td>" . $row[0] . "</td>";
//     echo "<td>" . $row[1] . "</td>";
//     echo "<td>" . $row[2] . "</td>";
//     echo "</tr>";
// }
// echo "</table>";

// pg_close($db_connection);
// ?>




// $a_name = $_GET['a_name'];

// $db_connection = pg_connect("host=localhost dbname=XML&AJAX user=root password=");

// if (!$db_connection) {
//     die("Error in connection: " . pg_last_error());
// }

// $query = "SELECT movie.m_no, m_name, r_year 
//           FROM movie, actor 
//           WHERE a_name='$a_name' AND actor.m_no=movie.m_no";

// $result = pg_query($db_connection, $query);

// if (!$result) {
//     die("Error in query: " . pg_last_error());
// }

// echo "<table border=1>";
// echo "<tr><th>Movie No</th><th>Movie Name</th><th>Release Year</th></tr>";

// // Loop through the result set and display each row in a table row
// while ($row = pg_fetch_array($result)) {
//     echo "<tr>";
//     echo "<td>" . $row[0] . "</td>";
//     echo "<td>" . $row[1] . "</td>";
//     echo "<td>" . $row[2] . "</td>";
//     echo "</tr>";
// }

// echo "</table>";

// // Close the database connection
// pg_close($db_connection);
// ?>


<?php
// Get the actor's name from the GET request
$a_name = $_GET['a_name'];

// Database connection parameters
$servername = "localhost";
$username = "root";
$password = "";
$database = "XML&AJAX";

// Establish a connection to the MySQL database
$conn = new mysqli($servername, $username, $password, $database);

// Check if the connection was successful
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Define the SQL query to retrieve movie details based on actor's name
$query = "SELECT movie.m_no, mname, release_year 
          FROM movie, actor 
          WHERE aname='$aname' AND actor.mno=movie.mno";

// Execute the query
$result = $conn->query($query);

// Check if the query was executed successfully
if (!$result) {
    die("Error in query: " . $conn->error);
}

// Output the results in a table format
echo "<table border='1'>";
echo "<tr><th>Movie No</th><th>Movie Name</th><th>Release Year</th></tr>";

// Loop through the result set and display each row in a table row
while ($row = $result->fetch_assoc()) {
    echo "<tr>";
    echo "<td>" . $row['mno'] . "</td>";
    echo "<td>" . $row['mname'] . "</td>";
    echo "<td>" . $row['release_year'] . "</td>";
    echo "</tr>";
}

echo "</table>";

// Close the database connection
$conn->close();
?>