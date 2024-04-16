<?php
$fp = fopen('contact.dat', 'r');
if (!$fp) {
    echo "Error: Unable to open file.";
} else {
    echo "<table border=1>";
    echo "<tr><th>Sr. No.</th><th>Name</th><th>Residence No.</th><th>Mob. no.</th><th>Relation</th></tr>";

    while ($row = fscanf($fp, "%s %s %s %s %s")) {
        echo "<tr>";
        foreach ($row as $r) {
            echo "<td>$r</td>";
        }
        echo "</tr>";
    }
    echo "</table>";
    fclose($fp);
}
// echo "Script executed.";
?>
