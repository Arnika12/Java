<?php
function Reverse($array)
{
	return(array_reverse($array, true));
}

$array = array("ram", "aakash", "saran", "mohan");

echo "Before:\n";
print_r($array);"


echo "\nAfter:\n";
print_r(Reverse($array));

?>
