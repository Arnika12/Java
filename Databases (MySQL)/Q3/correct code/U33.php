<html>
<head>
<title>Doctor Visiting Hospital</title>
</head>
<body>
<form method="post" action="">
	Enter Department Name : <input type="text" name="name"><br>
	<input type="submit" name="Get Details">
</form>
</body>
</html>

<?php
if($_POST){
	$dname=$_POST['name'];
	
$db= pg_connect("host=localhost dbname=test user=postgres password=mit@2022");

if($db)
{
$query="SELECT MAX(salary) as max_sal , MIN(salary) as min_sal , SUM(salary) as total_sal from Emp 
INNER JOIN Dept ON Emp.d_no = Dept.d_no 
where Dept.dname='$dname' ";

$resultset=pg_query($db,$query);
if(!$resultset)
{
	echo "execute query problem";
}
else
{
echo "<table border=2>";
echo "<tr><td> MAX SALARY </td>";
echo "<td> MIN SALARY </td>";
echo "<td> TOTAL SALARY </td></tr>";

if($row = pg_fetch_assoc($resultset))
{
echo "<tr><td>".$row['max_sal'].  "</td>";
echo "<td> ".$row['min_sal'].  " </td>";
echo "<td> ".$row['total_sal'].  " </td></tr>";
}
echo "</table>";
}}
else
{
	echo " datbase connection error ";
}}
?>
