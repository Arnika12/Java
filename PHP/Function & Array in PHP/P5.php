<!-- 5. Write a PHP script for the following: Design a form to accept two strings. Compare the
two strings using both methods (= = operator & strcmp function). Append second
string to the first string. Accept the position from the user; from where the characters
from the first string are reversed. (Use radio buttons)-->

<html>
<head>
	<title>  String Comparison </title>
</head>
<body style="font-size:20px;">
<form action="" method="post" aign="center">
<pre>
                                                                                                                             
        Enter first string ::<input type="text" name="str1">
                                                                                                                  
        Enter second string::<input type="text" name="str2">
                                                                                                                             
        Enter position::<input type='text' name="pos">
                                                                                                                             
        
                        <input type="radio" name="ch" value=1> Compare given 2 Strings
                                                                                                                             
                        <input type="radio" name="ch" value=2> Compare given 2 Strings with datatype
                                                                                                                             
                        <input type="radio" name="ch" value=3> Append given 2 Strings
                                                                                                                             
                        <input type="radio" name="ch" value=4> Position from which characters from the first string are reversed
                                                                                                                             
                        <input type="submit" value="check">     <input type="reset" value="cancel">
</pre>
</form>

<?php
  if($_POST){
        $str1=$_POST['str1'];
        $str2=$_POST['str2'];
        $pos=$_POST['pos'];
        $ch=$_POST['ch'];
        echo"First string  :: $str1.<br><br>";                                                                                                                         
        echo "Second string::$str2.<br><br>";                                                                                                                           						echo"-----------------------------------.<br><br>";  
                                                                                                                                                                                                                                              
        switch($ch)
        {
        case 1:
                if($str1==$str2)
                        echo"Both string $str1 & $str2 are equal.<br>";
                else
                        echo"Both string  $str1 & $str2 are not equal.<br>";
        break;
        case 2:
                if($str1===$str2)
                        echo"Both  $str1 & $str2 are exact equal.<BR>";
                else
                        echo"Both  $str1 & $str2 are not equal.<BR>";
        break;
        case 3:
                echo"After appending  $str1 & $str2 ::";
                echo "$str1"."$str2";
                echo"<br>";
        break;
        case 4:
        	echo"position for reverse :: $pos<br><br>";    
        	$len=strlen($str1)-$pos;
                $s=substr($str1,$pos,$len);
                $str4=strrev($s);
                echo "After reversing $str1 :: $str4.<br>";
        break;
        }
  }
?>

</body>
</html>
