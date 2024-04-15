 
<!-- <?php -->
// $a_name = $_GET['a_name'];
// $con = mysql_connect("localhost","root","");
// $d = mysql_select_db("bca_programs",$con);
// $q = mysql_query("select movie.m_no,m_name,r_year from movie,actor_slip_14 where a_name='$a_name' && actor_slip_14.m_no=movie.m_no"); 
// echo "<table border=1>";
// echo "<tr><th>Movie No</th><th>Movie Name</th><th>Release Year</th></tr>";
// while($row = mysql_fetch_array($q))
// {
// echo "";
// echo "".$row[0]."";
// echo "".$row[1]."";
// echo "".$row[2]."";
// echo "";
// }
// echo "</table>";
// ?> 


<?php
$a_name = $_GET['a_name'];
$db_connection = pg_connect("host=localhost dbname=bca_programs user=your_username password=your_password");
if (!$db_connection) {
    die("Error in connection: " . pg_last_error());
}

$query = "SELECT movie.m_no, m_name, r_year FROM movie, actor_slip_14 WHERE a_name='$a_name' AND actor_slip_14.m_no=movie.m_no";
$result = pg_query($db_connection, $query);
if (!$result) {
    die("Error in query: " . pg_last_error());
}

echo "<table border=1>";
echo "<tr><th>Movie No</th><th>Movie Name</th><th>Release Year</th></tr>";
while ($row = pg_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row[0] . "</td>";
    echo "<td>" . $row[1] . "</td>";
    echo "<td>" . $row[2] . "</td>";
    echo "</tr>";
}
echo "</table>";

pg_close($db_connection);
?>
