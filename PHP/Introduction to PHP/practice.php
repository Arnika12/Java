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

<?php
if($_POST){
    $itcode=$_POST['icode'];
    $itname=$_POST['iname'];
    $itunit=$_POST['iunit'];
    $itsold=$_POST['isold'];
    $itrate=$_POST['irate'];

    $icode= explode('',$itcode);
    $iname= explode('',$itname);
    $iunit= explode('',$itunit);
    $isold= explode('',$itsold);
    $irate= explode('',$itrate);

    $z = count($icode);
    $total = 0;
    for($i=0;$i<$z;$i++)
    {
		// $total +=$iunit[$i]*$irate[$i]; 
		$total += $iunit[$i] * $irate[$i];

    }

    echo "<table border=2>";
    echo "<tr><td>Item code </td>
    <td>Item name </td>
    <td>Item unit </td>
    <td>Item sold </td>
    <td>Item rate </td></tr>";

    for($i=0;$i<$z;$i++)
    {
        echo "<tr><td>".$icode[$i]."</td>
        <td>".$iname[$i]."</td>
        <td>".$iunit[$i]."</td>
        <td>".$isold[$i]."</td>
        <td>".$irate[$i]."</td></tr>";
    }

    echo "<tr><td><total amount</td>
    <td>".$total."</td></tr>";
    echo "</table>";
}
?>
