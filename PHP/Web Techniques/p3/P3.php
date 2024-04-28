<!-- Write a PHP script to accept username and password. If in the first three chances, username 
and password entered is correct then 
display second form with ‘welcome message’ otherwise display error message. [ Use Session] -->

<?php
session_start();
$correctUsername = "admin";
$correctPassword = "admin";

if (!isset($_SESSION['login_attempts'])) {
    $_SESSION['login_attempts'] = 0;
}

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $_SESSION['login_attempts']++;
    $enteredUsername = $_POST['username'];
    $enteredPassword = $_POST['password'];
    if ($enteredUsername === $correctUsername && $enteredPassword === $correctPassword) {
        unset($_SESSION['login_attempts']); 
        header("Location: php2.php"); 
        exit();
    } elseif ($_SESSION['login_attempts'] >= 3) {
        unset($_SESSION['login_attempts']); 
        $errorMessage = "Maximum login attempts reached. Please try again later.";
        session_destroy();
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
    <form method="post" action="">
        <label for="username">Username:</label>
        <input type="text" name="username" required><br>
    
        <label for="password">Password:</label>
        <input type="password" name="password" required><br>
    
        <input type="submit" value="Login">
    </form>
    
    <?php if (isset($errorMessage)): ?>
        <p><?php echo $errorMessage; ?></p>
    <?php else: ?>
        <?php if ($_SESSION['login_attempts'] > 0 && $_SESSION['login_attempts'] < 3): ?>
            <p>Remaining login attempts: <?php echo 3 - $_SESSION['login_attempts']; ?></p>
        <?php endif; ?>
    <?php endif; ?>
</body>
</html>
