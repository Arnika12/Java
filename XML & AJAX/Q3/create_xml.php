<?php
// Create XML data
$xml = new DOMDocument('1.0', 'UTF-8');
$xml->formatOutput = true; // Enable pretty printing

$univ = $xml->createElement('Univ');
$xml->appendChild($univ);

// University 1
$uni1 = $xml->createElement('University');
$univ->appendChild($uni1);

$uname1 = $xml->createElement('Uname', 'University A');
$uni1->appendChild($uname1);

$city1 = $xml->createElement('City', 'City A');
$uni1->appendChild($city1);

$rank1 = $xml->createElement('Rank', 'Rank A');
$uni1->appendChild($rank1);

// University 2
$uni2 = $xml->createElement('University');
$univ->appendChild($uni2);

$uname2 = $xml->createElement('Uname', 'University B');
$uni2->appendChild($uname2);

$city2 = $xml->createElement('City', 'City B');
$uni2->appendChild($city2);

$rank2 = $xml->createElement('Rank', 'Rank B');
$uni2->appendChild($rank2);

// University 3
$uni3 = $xml->createElement('University');
$univ->appendChild($uni3);

$uname3 = $xml->createElement('Uname', 'University C');
$uni3->appendChild($uname3);

$city3 = $xml->createElement('City', 'City C');
$uni3->appendChild($city3);

$rank3 = $xml->createElement('Rank', 'Rank C');
$uni3->appendChild($rank3);

// Save XML to file
$xml->save('University.xml');
echo "XML file created successfully!";
?>
