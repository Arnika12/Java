<!-- 1. Write a PHP script for the following. a) Design a form to accept the details of 5
different items such as Item code, Item Name, unit, sold and Rate. b) Display the bill
in tabular format. Use only 4 textboxes. [ Use explode]-->

<html>
<head>
	<title>Item Info</title>
	<style>
		table 
		{
            border-collapse: collapse;
    		margin: 100px;
       		border: 2px solid blue;
       		padding:50px;
        }
        .container 
		{
			text-align: center;
		}
	</style>
</head>
<body>
	<form method=POST>
	<table>
		<tr>
			<td>Item Code : </td>
			<td> <input type="text" name="icode" placeholder="Enter item code"></td>
		</tr>
		
		<tr>
			<td>Item Name : </td>
			<td> <input type="text" name="iname" placeholder="Enter item name"></td>
		</tr>
		
		<tr>
			<td>Item Unit : </td>
			<td><input type="text" name="iunit" placeholder="Enter item unit"></td>
		</tr>
		
		<tr>
			<td>Item Sold : </td>
			<td><input type="text" name="isold" placeholder="Enter no. of item sold"></td>
		</tr>
		
		<tr>
			<td>Item Rate  per Item: </td>
			<td><input type="text" name="irate" placeholder="Enter per item rate"></td>
		</tr>
		
		<tr>
			<td><input type="submit" value="Calculate" name="submit"> </td>
			<td><input type="reset" value="Clear" name="reset"></td>
		</tr>
	</table>
</body>
</html>

<div class="container">
<?php
if($_POST){
    $itemcode = $_POST['icode'];
    $itemname = $_POST['iname'];
    $unit = $_POST['iunit'];
    $rate = $_POST['irate'];
             
    $icode = explode(',',$itemcode);
    $iname = explode(',',$itemname);
    $iunit = explode(',',$unit);
    $irate = explode(',',$rate);
                             
$z=count($icode);   #counting total number of items added by user

#CALUCLATE TOTAL AMOUNT	
$tamt=0;
for($i=0;$i<$z;$i++)
{
  $tamt +=$iunit[$i]*$irate[$i]; 
}

#displaying output here
echo "<table align=center border =1>";            
echo "<tr>
		<td> <b>Item Code</b> </td>
		<td> <b>Item Name</b> </td>
		<td><b> Units Sold</b> </td>
		<td> <b>Rate </b></td>
	</tr>";

for($i=0;$i<$z;$i++)
{
	echo "<tr>
			<td>".$icode[$i]."</td>
			<td>".$iname[$i]."</td>
			<td>".$iunit[$i]."</td>
			<td>".$irate[$i]."</td>
		</tr>";
}
echo "<tr><th colspan=3>Total amount </th><td>".$tamt."</td></tr>";
echo "</table>";
}
?>
</div>

