<?php

	$c=$_POST['op'];

	

	$a=array('pen'=>15,'pencil'=>5,'rubber'=>3,'book'=>30);

	$a1=array('pen'=>15,'ritika'=>57,'ram'=>3,'revati'=>30);

	$a2=array(15,48,10,155,2,78);

	function isodd($v)

	{

		if($v%2!=0)

		return $v;

	}

	switch($c)

	{

		case 1:

			print_r($a);

			sort($a);

			echo"<br>Array in ascending order<br>";

			print_r($a);

			rsort($a);

			echo"<br>Array in desecending order";

			echo "<br>";

			print_r($a);break;



		case 2:

			print_r($a);

			asort($a);

			echo"<br>Array in ascending order<br>";

			print_r($a);

			arsort($a);

			echo"<br>Array in desecending order<br>";

			print_r($a);break;

		case 3:

			print_r($a);

			echo "<br>";

			echo"<br>Filter the odd elements from an array.<br>";

		        print_r(array_filter($a,isodd));

			break;

			

		case 4:

			print_r($a);echo "<br>";

			print_r($a1);echo "<br>";

			print_r($a2);echo "<br>";

			array_multisort($a,$a1,$a2);

			print_r($a);echo "<br>";

			print_r($a1);echo "<br>";

			print_r($a2);echo "<br>";

			break;

			

		case 5:

			print_r($a);

			echo "<br>";

			print_r($a1);

			echo "<br>Array Merge<br>";

			print_r(array_merge($a,$a1));

			break;

		case 6:

			print_r($a);

			echo "<br>";

			print_r($a1);

			echo "<br>Array Intersection<br>";

			print_r(array_intersect($a,$a1));

			break;

		case 7:

			print_r($a);

			echo "<br>";

			print_r($a1);

			echo "<br>Array Union<br>";

			$union=array_merge($a,$a1);

			print_r(array_unique($union));

			break;

		case 8:

			print_r($a);

			echo "<br>";

			print_r($a1);

			echo "<br>Array Differnce<br>";

			print_r(array_diff($a,$a1));

			break;



	}

?>