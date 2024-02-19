//7. Define a class Student with attributes rollno and name. Define default and parameterized constructor. 
//Keep the count of Objects created. Create objects using parameterized constructor and 
//display the object count after each object is created.

import java.util.*;
public class Student_1 {
    int s_rollno;
    String s_name;
    private static int objectCount = 0;

    Student_1() {
        s_rollno = 34;
        s_name = "ABC";
        objectCount++;
    }

    Student_1(String s_name, int s_rollno) {
        this.s_rollno = s_rollno;
        this.s_name = s_name;
        objectCount++;
    }

    public static int getObjectCount() {
        return objectCount;
    }

    public static void main(String args[]) {
        // Create Student_1 objects using the parameterized constructor
        Student_1 student1 = new Student_1("Priyansh", 1);
        System.out.println("Object count: " + Student_1.getObjectCount());

        Student_1 student2 = new Student_1("Priya", 2);
        System.out.println("Object count: " + Student_1.getObjectCount());

        // Create a Student_1 object using the default constructor
        Student_1 student3 = new Student_1();
        System.out.println("Object count: " + Student_1.getObjectCount());
    }
}


