/*5. Define an abstract class Staff with members name and address. 
Define two sub-classes of this class – FullTimeStaff (members - department, salary, hra - 8% of salary, da – 5% of salary) 
and PartTimeStaff (members - number-of-hours, rate-per-hour). Define appropriate constructors. 
Write abstract method as calculateSalary() in Staff class. Implement this method in subclasses. 
Create n objects which could be of either FullTimeStaff or PartTimeStaff class by asking the user ‘s choice. 
Display details of all FullTimeStaff objects and all PartTimeStaff objects along with their salary.*/


import java.util.Scanner;

abstract class Staff {
    protected String name;
    protected String address;

    public Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public abstract double calculateSalary();

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + calculateSalary());
    }
}

class FullTimeStaff extends Staff {
    protected String department;
    protected double salary;
    protected double hra;
    protected double da;

    public FullTimeStaff(String name, String address, String department, double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
        this.hra = salary * 0.08;
        this.da = salary * 0.05;
    }

    @Override
    public double calculateSalary() {
        return salary + hra + da;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}

class PartTimeStaff extends Staff {
    protected int numberOfHours;
    protected double ratePerHour;

    public PartTimeStaff(String name, String address, int numberOfHours, double ratePerHour) {
        super(name, address);
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double calculateSalary() {
        return numberOfHours * ratePerHour;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Number of hours: " + numberOfHours);
        System.out.println("Rate per hour: " + ratePerHour);
    }
}

public class Staff1 {
    public static void main(String[] args) 
   {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of staff members: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        Staff[] staff = new Staff[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the type of staff member (full time or part time): ");
            String type = scanner.nextLine();
            System.out.print("Enter the name: ");
            String name = scanner.nextLine();
            System.out.print("Enter the address: ");
            String address = scanner.nextLine();

            if (type.equals("full time")) 
           {
                System.out.print("Enter the department: ");
                String department = scanner.nextLine();
                System.out.print("Enter the salary: ");
                double salary = scanner.nextDouble();
                staff[i] = new FullTimeStaff(name, address, department, salary);
            } 
             else if (type.equals("part time")) 
            {
                System.out.print("Enter the number of hours: ");
                int numberOfHours = scanner.nextInt();
                System.out.print("Enter the rate per hour: ");
                double ratePerHour = scanner.nextDouble();
                staff[i] = new PartTimeStaff(name, address, numberOfHours, ratePerHour);
            }
            scanner.nextLine();  // Consume the newline character
        }

        System.out.println("\nThe details of all full-time staff members are as follows: ");
        for (Staff staffMember : staff) {
            if (staffMember instanceof FullTimeStaff) {
                staffMember.display();
            }
        }

        System.out.println("\nThe details of all part-time staff members are as follows: ");
        for (Staff staffMember : staff) {
            if (staffMember instanceof PartTimeStaff) {
                staffMember.display();
            }
        }
    }
}

