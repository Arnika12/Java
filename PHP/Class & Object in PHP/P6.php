
<!-- 6. Write a Calculator class that can accept two values, then add them, subtract them, multiply them
together, or divide them on request.-->

<?php
class Calculate
 {
public $a;
public $b;
function __construct($a,$b)
{
$this->a=$a;
$this->b=$b;
}
public function add()
         {
          $c=$this->a+$this->b;
	  echo"Addition = $c<br>";
         }
public function subtract()
         {
          $c=$this->a-$this->b;
	  echo"Subtract = $c<br>";
         }
public function multiply()
         {
          $c=$this->a*$this->b;
          echo"Multiplication = $c<br>";
         }
public function div()
         {
          $c=$this->a/$this->b;
	 echo"Division = $c";
         }
 }

$calc=new Calculate(4,3);
$calc->add();
$calc->subtract();
$calc->multiply();
$calc->div();
?>
