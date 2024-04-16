<?php
$xml = simplexml_load_file("university.xml") or die("error: cannot create object");
echo "<table border=1 align=center>";
echo "<tr><td>University Name</td><td>City</td><td>Rank</td></tr>";
foreach ($xml->children() as $uni) {
    echo "<tr><td>" . $uni->Uname . "</td>";
    echo "<td>" . $uni->City . "</td>";
    echo "<td>" . $uni->Rank . "</td></tr>";
}
echo "</table>";
?>
