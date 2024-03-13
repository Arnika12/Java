<!-- Write a PHP script to test whether a number is greater than 30, 20 or 10 using ternary operator.-->

<html>
	<head>
		<title> ternary operator  Program</title>
	</head>
	<body>
		<center>
			<form method="POST">
				Enter a Number <input type="number" name = "num"><br>
				<input type = "submit" value="submit">
			</form>
		</center>
	</body>
</html>

<?php
if($_POST){
	$n =$_POST['num'];

	function ternary_Test($n)
	{
    		$r = $n > 30
        		? "greater than 30 <br>"
       		 	: ($n > 20
            		? "greater than 20<br>"
            			: ($n > 10
                	? "greater than 10<br>"
               	 	: "Input a number at least greater than 10!")); 
    			echo $n . " : " . $r . "\n";
	}
	ternary_Test($n);
}
?>


