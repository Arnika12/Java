<?php
session_start();

// Define correct username and password
$correctUsername = "admin";
$correctPassword = "123";

// Check if form is submitted
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Get username and password from the form
    $username = $_POST["username"];
    $password = $_POST["password"];

    // Check if username and password are correct
    if ($username === $correctUsername && $password === $correctPassword) {
        // Set session variables to track login status
        $_SESSION["loggedin"] = true;
        $_SESSION["username"] = $username;

        // Redirect to the welcome page
        header("Location: welcome.php");
        exit;
    } else {
        // Increment the login attempt counter
        if (!isset($_SESSION["login_attempts"])) {
            $_SESSION["login_attempts"] = 1;
        } else {
            $_SESSION["login_attempts"]++;
        }

        // Check if maximum login attempts reached
        if ($_SESSION["login_attempts"] >= 3) {
            echo "<h2>Maximum login attempts reached. Please try again later.</h2>";
            exit;
        }

        // Display error message
        echo "<h2>Incorrect username or password. Please try again.</h2>";
    }
}
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>

<body>
    <h2>Login</h2>
    <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
        <label for="username">Username:</label><br>
        <input type="text" id="username" name="username"><br>
        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password"><br><br>
        <input type="submit" value="Login">
    </form>
</body>

</html>

