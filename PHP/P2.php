

<html>
	<head>
		<title>String Program</title>
	</head>
	<body>
		<form method="POST">
			Enter a String <input type="text" name = "str"><br>
			<input type = "submit" value="submit">
		</form>
	</body>
</html>
 
 
 <?php
 if($_POST)
 {
 	function NoOfVowels()
	{
		$str=$_POST['str'];
		$vow=0;
		for($i=0;$i<strlen($str);$i++){
			switch($str[$i]){
				case 'a': 
				case 'e': 
				case 'i': 
				case 'o': 
				case 'u': 
		$vow++; 
		} 
	     } 
		echo"The number of vowels is : " .$vow; 
	} 
     NoOfVowels(); 
 }
 ?>
