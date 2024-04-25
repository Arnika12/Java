<?php
$cname=$_POST['name'];

$db = pg_connect("host=localhost dbname=test user=postgres password=mit@2022");

if ($db)
{
	$query= "select * from Student 
		inner join Stud_comp ON Student.stud_id=Stud_comp.stud_id
		inner join Competition ON Stud_comp.c_no = Competition.c_no
		where Competition.c_name = '$cname' AND Stud_comp.rank=1";
		
              			
$resultset=pg_query($db,$query);
if(!$resultset){
	echo " error in executing query";
	exit;
}
else
{
	echo "<table border=2>";
	echo "<tr><td> Student id </td>";
	echo "<td> Student class </td>";
	echo "<td> Student  name </td></tr>";
	
	while ($row= pg_fetch_assoc($resultset))
	{
		echo "<tr><td>".$row['stud_id']."</td>";
		echo "<td>".$row['class']."</td>";
		echo "<td>".$row['name']."</td></tr>";
	}
	ECHO "</table>";
}
}
else{
	echo "error in query";
	}


?>
