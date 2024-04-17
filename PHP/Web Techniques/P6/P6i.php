<!-- 6. Write a PHP script to change the preference of your web page like font style, font,
size, font color, background color using cookie.
Display selected settings on next page and actual implementation (with new settings)
on third page.-->

<?php
$style=$_COOKIE['set1'];
$color=$_COOKIE['set2'];
$size=$_COOKIE['set4'];
$b_color=$_COOKIE['set3'];
$msg="Welcome to the Webpage!!";
echo "<body bgcolor=$b_color>";
echo "<font color=$color size=$size face=$style>$msg";
echo "</font></body>";
?>
