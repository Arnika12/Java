<!-- 1. Write a PHP script to accept the number from user and Write a PHP function to calculate the 
	factorial of a number (a non-negative integer). The function accepts the number as an argument. -->

<!DOCTYPE html>
<html>
<head>
    <title>Factorial Calculator</title>
</head>
<body style="font-size:20px;">
    	<h2>Factorial Calculator</h2>
   	 <form method="post" action="">
        	Enter a non-negative integer: <input type="text" name="number">
        	<input type="submit" name="submit" value="Calculate Factorial">
    	</form>

    <?php
    if($_POST){
    $number = $_POST['number'];
    
    // Function to calculate factorial
    function factorial($n) {
        if ($n === 0 || $n === 1) {
            return 1;
        } else {
            return $n * factorial($n - 1);
        }
    }

        // Check if input is a non-negative integer
        if (ctype_digit($number) && $number >= 0) {
            $result = factorial($number);
            echo "Factorial of $number is: $result";
        } else {
            echo "Please enter a non-negative integer.";
        }
    }
    ?>
</body>
</html>

