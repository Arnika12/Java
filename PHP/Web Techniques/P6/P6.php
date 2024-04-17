<!-- 6. Write a PHP script to change the preference of your web page like font style, font,
size, font color, background color using cookie.
Display selected settings on next page and actual implementation (with new settings)
on third page.-->

<?php
echo "Style is ".$_GET['s1']."
Color is ".$_GET['c']."
Background color is ".$_GET['b']."
size is ".$_GET['s'];
setcookie("set1",$_GET['s1'],time()+3600);
setcookie("set2",$_GET['c'],time()+3600);
setcookie("set3",$_GET['b'],time()+3600);
setcookie("set4",$_GET['s'],time()+3600);
?><br>
<a href="P6i.php">Show</a>
