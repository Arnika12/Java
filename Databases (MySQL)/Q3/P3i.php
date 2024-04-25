<!DOCTYPE html>
<html>
<head>
    <title>Salary Statement</title>
</head>
<body>
    <form method="post" action="">
        <label for="dept_name">Enter Department Name:</label>
        <input type="text" id="dept_name" name="dept_name">
        <button type="submit" name="submit">Generate Salary Statement</button>
    </form>

    <?php
    if (isset($_POST['submit'])) {
        $dept_name = $_POST['dept_name'];

        // Database connection
        $servername = "localhost";
        $username = "username"; // Your MySQL username
        $password = "password"; // Your MySQL password
        $dbname = "your_database"; // Your MySQL database name

        // Create connection
        $conn = new mysqli($servername, $username, $password, $dbname);

        // Check connection
        if ($conn->connect_error) {
            die("Connection failed: " . $conn->connect_error);
        }

        // Retrieve salary statement
        $sql = "SELECT MAX(salary) AS max_salary, MIN(salary) AS min_salary, SUM(salary) AS total_salary FROM Employee WHERE d_no IN (SELECT d_no FROM Department WHERE dname = ?)";
        $stmt = $conn->prepare($sql);
        $stmt->bind_param("s", $dept_name);
        $stmt->execute();
        $result = $stmt->get_result();

        if ($result->num_rows > 0) {
            $row = $result->fetch_assoc();
            echo "<h2>Salary Statement for Department: $dept_name</h2>";
            echo "<table border='1'>";
            echo "<tr><th>Maximum Salary</th><th>Minimum Salary</th><th>Total Salary</th></tr>";
            echo "<tr><td>" . $row['max_salary'] . "</td><td>" . $row['min_salary'] . "</td><td>" . $row['total_salary'] . "</td></tr>";
            echo "</table>";
        } else {
            echo "No records found for the department.";
        }

        $stmt->close();
        $conn->close();
    }
    ?>
</body>
</html>
