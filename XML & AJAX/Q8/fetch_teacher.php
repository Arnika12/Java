<?php
$con = mysqli_connect("localhost", "root", "", "xml&ajax");

if (mysqli_connect_errno()) {
    echo "Failed to connect to MySQL: " . mysqli_connect_error();
    exit();
}

echo "<h3>Teacher Information:</h3>";

$query = "SELECT * FROM Teacher";
$result = mysqli_query($con, $query);

if (mysqli_num_rows($result) > 0) {
    echo "<table border='1'>";
    echo "<tr><th>Tno</th><th>Name</th><th>Subject</th><th>Research area</th></tr>";
    while ($row = mysqli_fetch_assoc($result)) {
        echo "<tr>";
        echo "<td>" . $row['Tno'] . "</td>";
        echo "<td>" . $row['Name'] . "</td>";
        echo "<td>" . $row['Subject'] . "</td>";
        echo "<td>" . $row['ResearchArea'] . "</td>";
        echo "</tr>";
    }
    echo "</table>";
} else {
    echo "No records found";
}

mysqli_close($con);
?>
