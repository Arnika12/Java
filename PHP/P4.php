<!-- 4. Write a PHP Script to accept customer Name from user and do the following a)
Transform Customer Name all Upper case latter. b) Make First character to Upper
Case.-->

<html>
	<head>
		<title> UpperLower Transform </title>
		<style>
			form{
				text-align : center;
				padding:50px;
			}
			.container 
			{
				text-align: center;
			}
		</style>
	</head>
	<body>
		<form method="POST">
			Enter Customer Name:<input type="text" name="name"><br><br>
			<input type="radio" name="option" value="1">Tranform all to uppercase<br><br>
			<input type="radio" name="option" value="2">Make First Character to uppercase<br><br>
			<input type="submit" name="Submit">
		</form>
	</body>
</html>

<div class="container">
<?php  
	if($_POST)
	{
		$name=$_POST['name'];
  		$choice=$_POST['option']; 
  	
  	switch($choice)
    	{ 
        	case 1: 
        		echo "<h2>After Tranforming $name to uppercase</h2><br>";
                	echo "<b>".strtoupper($name)."</b>";
                	break;
        	case 2: 
        		echo "<h2>After Making $name first character to upper</h2><br>";
                	echo "<b>".ucfirst($name)."</b>";
                	break;
        	default : 
        		echo "Please choose one operation";
    	}
  	}
?> 
</div>
