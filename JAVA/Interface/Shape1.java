/*2. Define an Interface Shape with abstract method area (). 
Write a java program to calculate an area of Circle and Sphere. (Use final keyword).*/

import java.util.Scanner;
interface Shape
{
	double area();
}

final class PI {
	public static final double VALUE = 3.142;
}

class Circle implements Shape {
	private double radius;

public Circle(double radius) {
	this.radius = radius;
}

@Override
public double area() {
	return PI.VALUE * radius * radius;
}
}

class Sphere implements Shape {
	private double radius;

public Sphere(double radius) {
	this.radius = radius;
}

@Override
public double area() {
	return 4 * PI.VALUE * radius * radius;
}
}

public class Shape1 {
public static void main(String[] args) 
{
	Scanner s= new Scanner(System.in);
    System.out.print("Enter the Radius of the Circle : ");
    double cradius = s.nextDouble();
	Circle circle = new Circle(cradius);

	System.out.print("Enter the Radius of the Sphere: ");
    double sradius = s.nextDouble();
    Sphere sphere = new Sphere(sradius);
    
	System.out.println(" Area of circle: " + circle.area());
    System.out.println(" Area of Sphere: " + sphere.area());
}
}
