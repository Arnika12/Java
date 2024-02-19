//4. Write a program which define class Employee with data member as id, name and salary Store the information of 'n' employees 
//and display the name of employee having maximum salary (Use array of object).

import java.util.*;

public class Employee {
    int id;
    String name;
    double salary;

public Employee()
{
	id=1;
	name="ABC";
	salary=90000;
}

public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary=salary;
    }

    public void getInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Employee Id : ");
        this.id = s.nextInt();
        System.out.print("Enter Employee Name : ");
        this.name = s.next();
        System.out.print("Enter Employee Salary : ");
        this.salary = s.nextDouble();
    }

    public void display() {
        System.out.println("\nEmployee Id : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + salary);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of Employee: ");
        int n = s.nextInt();
        Employee[] emp= new Employee[n];
        
        for (int i = 0; i < emp.length; i++) {
            System.out.println("****Employee "+(i+1)+" ****");
            emp[i] = new Employee();  //creates a new instance of an Employee object and assigns it to an array of Employees at index i.
            emp[i].getInput();
        }
        
        System.out.println("\n****Employee Details****");
        for (int j = 0; j < emp.length; j++) {
            emp[j].display();
        }

        // Find the product with the maximum salary
	if(emp.length>0)
	{
		Employee HighestPaidEmployee=emp[0];

	for(int i=1;i<emp.length;i++)
	{
		if(emp[i].salary>HighestPaidEmployee.salary)
		{
			HighestPaidEmployee=emp[i];
		}
	}
	System.out.println("\nEmployee with Highest Salary: " + HighestPaidEmployee.name);
	}
    	else 
	{
        	System.out.println("No employees in the array.");
   	 }
    }
}



