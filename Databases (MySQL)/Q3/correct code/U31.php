<?php
$dname=$_POST['name'];
$db= pg_connect("host=localhost dbname=test user=postgres password=mit@2022");

$query="INSERT INTO Dept VALUES(3,'CS','PUNE'),(4,'Ca','DHULE'),(5,'MECHANICAL','PUNE')";

$result1=pg_query($db,$query);
if(!$result1){
	echo " problem in query execution";
}
else{
	echo " Dept vslues insertd";
}

$query1="INSERT INTO Emp VALUES(3,'sahil','PUNE',8978976789,78000,3),
(4,'sanchit','PUNE',8978976789,70000,4),
(6,'sahil','PUNE',8978976789,78000,5)";

$result2=pg_query($db,$query1);
if(!$result2){
	echo "problem in query execution";
}
else{
	echo " Emp vslues insertd";
}


?>
