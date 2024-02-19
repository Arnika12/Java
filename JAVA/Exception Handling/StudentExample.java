Q.2 Write a class Student with attributes roll no, name, age and course. Initialize values through parameterized constructor. If age of student is not in between 15 and 21 then generate user-defined exception ―Age Not Within The Range. If name contains numbers or special symbols raise exception ―Name not valid
import java.util.Scanner;

// Custom exception for age not in the specified range
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom exception for invalid name
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, InvalidNameException {
        this.rollNo = rollNo;

        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age Not Within The Range");
        } else {
            this.age = age;
        }

        if (!isValidName(name)) {
            throw new InvalidNameException("Name not valid");
        } else {
            this.name = name;
        }

        this.course = course;
    }

    // Method to check if the name is valid
    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z]+");
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class StudentExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Roll Number: ");
            int rollNo = scanner.nextInt();

            scanner.nextLine(); // Consume the newline

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            scanner.nextLine(); // Consume the newline

            System.out.print("Enter Course: ");
            String course = scanner.nextLine();

            Student student = new Student(rollNo, name, age, course);
            student.displayStudentDetails();
     } catch (AgeNotWithinRangeException | InvalidNameException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid details.");
        } finally {
            scanner.close();
        }
    }
}
