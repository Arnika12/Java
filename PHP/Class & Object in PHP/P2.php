<HTML>
<BODY>
<?PHP
$a=$_POST['a'];
$b=$_POST['b'];
$c=$_POST['c'];
$d=$_POST['d'];

interface one
{
        function area($c,$d);
}
class rect implements one
{
        function area($c,$d)
        {
                $area=$c*$d;
                echo"Area of rectangle......:".$area;
                echo"<br><BR>";
        }
}
class square extends rect
{
        function area($b,$f)
        {
                $area=$b*$f;
                echo"Area of Square.........:".$area;
                echo"<BR><br>";
        }
}
class circle
{
        function area($a)
        {
                $area=3.14*$a*$a;
                echo"Area of circle.........:".$area;
                echo"<br><BR>";
        }
}
$o=new rect();
$o->area($c,$d);
$s=new square();
$f=$b;
$s->area($b,$f);
$c=new circle();
$c->area($a);
echo "<br>";
?>
<a href="Assign4Prog2.html">come back</a><br>
</BODY>
</html>
