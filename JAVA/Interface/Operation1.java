/*1. Define an interface “Operation” which has methods area (), volume (). 
Define a constant PI having a value 3.142. 
Create a class circle (member – radius), cylinder (members – radius, height) which 
implements this interface. Calculate and display the area and volume.*/


import java.util.Scanner;

interface Operation 
{
	double area();
	double volume();
}

final class PI {
	public static final double VALUE = 3.142;
}

class Circle implements Operation {
	private double radius;

public Circle(double radius) {
	this.radius = radius;
}

@Override
public double area() {
	return PI.VALUE * radius * radius;
}

@Override
public double volume() {
	return 0; // Circles don't have volume
}
}

class Cylinder implements Operation {
	private double radius;
	private double height;

public Cylinder(double radius, double height) {
	this.radius = radius;
	this.height = height;
}

@Override
public double area() {
	return 2 * PI.VALUE * radius * (radius + height);
}

@Override
public double volume() {
	return PI.VALUE * radius * radius * height;
}
}

public class Operation1 {
public static void main(String[] args) 
{
	Scanner s= new Scanner(System.in);
    System.out.print("Enter the Radius of the Cylinder: ");
    double cyradius = s.nextDouble();
    System.out.print("Enter the Height of the Cylinder: ");
    double cyheight = s.nextDouble();
    Cylinder cylinder = new Cylinder(cyradius, cyheight);

	System.out.print("Enter the Radius of the Circle: ");
    double cradius = s.nextDouble();
    Circle circle = new Circle(cradius);
    
	System.out.println("\n Cylinder : ");
	System.out.println("Area of cylinder: " + cylinder.area());
    System.out.println("Volume of cylinder: " + cylinder.volume());

	System.out.println("\n Circle : ");
    System.out.println(" Area of circle: " + circle.area());
    System.out.println("Volume of circle: " + circle.volume());
    
}
}