<!-- 1. Write a PHP program to define Interface shape which has two method as area() and
volume (). Define a constant PI. Create a class Cylinder implement this interface and
calculate area and Volume. -->

<html>
<head>
    <title>Calculate Area & Volume of Cylinder</title>
</head>
<body style="font-size:20px;">
    <form action="" method="POST">
    <pre>
        Enter radius of cylinder: <input type="number" name="radius"> 
        
        Enter height of cylinder: <input type="number" name="height"> 
        
        <input type="radio" name="choice" value="1"> Calculate Area 
        
        <input type="radio" name="choice" value="2"> Calculate Volume 
        
        <input type="radio" name="choice" value="3"> Calculate Both Area  & Volume 
         
        <input type="submit" value="Calculate">
    </form>
    </pre>

    <?php
    if($_POST){
        $r = $_POST['radius'];
        $h = $_POST['height'];
        $ch = $_POST['choice'];
        define('PI', 3.14);
        
        interface shape{
            public function area($r, $h);
            public function volume($r, $h);
        }
        class Cylinder implements shape {
            public function area($r, $h) {
                $area = 2 * PI * $r * ($r + $h);
                echo "Area of Cylinder: $area <br>";
            }
            public function volume($r, $h) {
                $volume = PI * $r * $r * $h;
                echo "Volume of Cylinder: $volume";
            }
        }
        
        $cy = new Cylinder;
        if ($ch == 1) {
            $cy->area($r, $h);
        } elseif ($ch== 2) {
            $cy->volume($r, $h);
        } else if ($ch == 3){
        	 $cy->area($r, $h);
        	 $cy->volume($r, $h);
        }
    }
    ?>
</body>
</html>

