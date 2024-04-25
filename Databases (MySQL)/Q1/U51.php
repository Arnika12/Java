<!-- Using above database write a script in PHP to print the Doctor visiting to the hospital in 
tabular format.  Accept hospital name from user[ Use MySQL] -->



<?php
if(isset($_POST['name'])){
	$hname = $_POST['name'];
	
	// Establishing connection to the database
	$db = pg_connect("host=localhost dbname=test user=postgres password=mit@2022");
	
	if($db){
		// Correcting the query
		$query = "SELECT * FROM Doctor WHERE doc_no IN (
				SELECT doc_no FROM Doc_hos WHERE hosp_no IN (
				SELECT hosp_no FROM Hospital WHERE hname='$hname'
			)
		)";
		
		$resultset = pg_query($db, $query);
		if(!$resultset){
			echo "Error in executing query.";
			exit;
		}
		
		echo "<h1>Doctors visiting $hname Hospital</h1>";
		echo "<table style='height:400;width:400;border:3px solid red;'>";
		echo "<tr><th>Doctor No</th>";
		echo "<th>Doctor Name</th>";
		echo "<th>Doctor Address</th>";
		echo "<th>Doctor City</th></tr>";
		
		while($row = pg_fetch_assoc($resultset)){
			echo "<tr><td>".$row['doc_no']."</td>";
			echo "<td>".$row['dname']."</td>";
			echo "<td>".$row['address']."</td>";
			echo "<td>".$row['city']."</td></tr>";
		}
		echo "</table>";
		
		// Free resultset
		pg_free_result($resultset);
		// Close the connection
		pg_close($db);
	} else {
		echo "Failed to connect to the database.";
	}
}
?>

