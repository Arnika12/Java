<?php
$cname=$_GET['cname'];
#$db = pg_connect("host=localhost dbname=stud user=postgres password=" "");
$db = pg_connect("dbname=stud user=postgres");
if($db)
{
echo "database connected";
$query = "SELECT name FROM student WHERE stud_id IN 
              (SELECT stud_id FROM stud_comp WHERE rank IN 
                   (SELECT rank FROM stud_comp WHERE c_no IN 
                        (SELECT c_no FROM Competition WHERE c_name = '$cname')))";

$result = pg_query($db, $query);

#$query="select name from student where stud_id in(select stud_id from stud_comp where rank in(select rank from stud_comp where c_no in(select c_no from Competition='cname')))"; 

while ($row = pg_fetch_assoc($result)) {
    echo  "<br>".$row['name'] . "<br>";
}

} 
else{
 die("Error in connecting to database: " . pg_last_error());
}
?>
