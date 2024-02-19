/*1. Define a “Point” class having members – x,y(coordinates). 
Define default constructor and parameterized constructors. 
Define two subclasses “ColorPoint” with member as color and subclass “Point3D” with member as z (coordinate). 
Write display method to display the details of different types of Points*/


class Point {
    protected int x;
    protected int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Point: (" + x + "," + y + ")");
    }
}

class ColorPoint extends Point {
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void display() {
        System.out.println("ColorPoint: (" + x + "," + y + "), color: " + color);
    }
}

class Point3D extends Point {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void display() {
        System.out.println("Point3D: (" + x + "," + y + "," + z + ")");
    }
}

public class Point1 {
    public static void main(String args[]) {
        Point pt1 = new Point(2, 3);
        pt1.display();

        ColorPoint cpt1 = new ColorPoint(5, 7, "red");
        cpt1.display();

        Point3D pt3D = new Point3D(1, 1, 10);
        pt3D.display();
    }
}
