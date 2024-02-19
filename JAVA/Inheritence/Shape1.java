/*6. Create an abstract class Shape with methods area & volume. 
Derive a class Cylinder (radius, height). Calculate area and volume.*/

import java.util.Scanner;

abstract class Shape {
    public abstract double area();
    public abstract double volume();
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class Shape1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = s.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = s.nextDouble();
        Cylinder cylinder = new Cylinder(radius, height);
        double area = cylinder.area();
        double volume = cylinder.volume();
        System.out.println("\n Area of cylinder: " + area);
        System.out.println("Volume of cylinder: " + volume);
    }
}
