

<!DOCTYPE html>
<html>
<head>
    <title>Display Student Information</title>
</head>
<body>
    <form action="P2.php" method="get">
        Enter Competition Name: <input type="text" name="competition">
        <input type="submit" value="Submit">
    </form>
</body>
</html>

<?php
if(isset($_GET['competition'])) {
    $competition = $_GET['competition'];

    $con = mysqli_connect("localhost", "root", "", "XML&AJAX");
    if (mysqli_connect_errno()) {
        echo "Failed to connect to MySQL: " . mysqli_connect_error();
        exit();
    }

    $query = "SELECT Student.stud_id, Student.name, Student.class
              FROM Student
              INNER JOIN Student_Competition ON Student.stud_id = Student_Competition.stud_id
              INNER JOIN Competition ON Student_Competition.c_no = Competition.c_no
              WHERE Competition.c_name = '$competition' AND Student_Competition.rank = 1";

    $result = mysqli_query($con, $query);

    if (mysqli_num_rows($result) > 0) {
        echo "<h3>Students who secured 1st rank in $competition:</h3>";
        echo "<table border='1'>";
        echo "<tr><th>Student ID</th><th>Name</th><th>Class</th></tr>";
        while ($row = mysqli_fetch_assoc($result)) {
            echo "<tr>";
            echo "<td>" . $row['stud_id'] . "</td>";
            echo "<td>" . $row['name'] . "</td>";
            echo "<td>" . $row['class'] . "</td>";
            echo "</tr>";
        }
        echo "</table>";
    } else {
        echo "No records found for the given competition.";
    }

    mysqli_close($con);
}
?>
