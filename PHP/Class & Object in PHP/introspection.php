<!--Q.20) Write PHP script to demonstrate the concept of introspection for examining object.-->

<?php
class Car{
	public $brand;
	public function method1(){
		echo "this is property 1";
	}
	private function method2(){
		echo "this is property 2";
	}
}

if(class_exists("Car")){
	$c = new Car();
	echo "classes Car is exist";
	
	if(property_exists($c,'brand')){
		echo "property brand exist";
	}
	else
	{
			echo "property brand does not exist";
	}
	
	if(method_exists($c,'method1')){
		echo "method 1 exist";
	}
	else
	{
		echo "method 1 not exist";
	}
}
else
{
	echo "class not exist";
}
?>
