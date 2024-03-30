<! 7. Write a PHP Script to create a super class Vehicle having members Company and price.
Derive 2 different classes LightMotorVehicle (members – mileage) and HeavyMotorVehicle
(members – capacity-in-tons). Define 5 Object of each subclass and display details in table
format . -->

<?php
class vehicle
{
public $company,$price;
public function __construct($a,$b)
{
$this->company=$a;
$this->price=$b;
}
}
class Lightmotorvehicle extends vehicle
{
public $milege;
public function __construct($a,$b,$c)
{
$this->company=$a;
$this->price=$b;
$this->milege=$c;
}
public function display()
{
echo "<table border=1 width=300><tr>
<td>".$this->company."</td>
<td>".$this->price."</td>
<td>".$this->milege."</td></tr></table>";
}
}
class Heavymotorvehicle extends vehicle
{
public $capacity;
public function __construct($a,$b,$c)
{
$this->company=$a;
$this->price=$b;
$this->capacity=$c;
}
public function display()
{
echo "<table border=1 width=300>";
echo "<tr><td>".$this->company."
<td>".$this->price."
<td>".$this->capacity;
echo "</td></tr></table>";
}
}
$ob1=new Lightmotorvehicle("Maruti",200000,25);
$ob1->display();
$ob2=new Lightmotorvehicle("Toyota",500000,20);
$ob2->display();
$ob3=new Lightmotorvehicle("skoda",400000,15);
$ob3->display();
$ob4=new Heavymotorvehicle("Tata Truck",1220000,25);
$ob4->display();
$ob5=new Heavymotorvehicle("Bajaj",200000,25);
$ob5->display();
$ob6=new Heavymotorvehicle("mahindra",900000,25);
$ob6->display();
?>
