/*2.Define a class Employee having members – id, name, salary. 
Define default constructor. Create a subclass called Manager with private member bonus. 
Define methods accept and display in both the classes. Create “n” objects of the Manager
class and display the details of the worker having the maximum total salary (salary + bonus).*/

import java.util.*;

class Employee 
{
    	protected int id;
    	protected String name;
    	protected double salary;

public Employee() 
{
    	id=12;
	name="Supriya";
	salary=85000;
}

public void accept() 
{
        	Scanner s = new Scanner(System.in);
        	System.out.print("\nEnter the employee ID: ");
        	id = s.nextInt();
        	System.out.print("Enter the employee name: ");
        	name = s.next();
        	System.out.print("Enter the employee salary: ");
        	salary = s.nextDouble();
}

public void display() 
{
        	System.out.println("Employee ID: " + id);
        	System.out.println("Employee name: " + name);
        	System.out.println("Employee salary: " + salary);
}
}

class Manager extends Employee 
{
	private double bonus;

public Manager() 
{
	super();  // Call the default constructor of the Employee class
        	bonus = 0.0;
}

    @Override
public void accept() 
{
        super.accept();   // Call the accept method of the Employee class
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Manager bonus: ");
        bonus = s.nextDouble();
}

    @Override
public void display() 
{
        super.display();  // Call the display method of the Employee class
        System.out.println("Employee bonus: " + bonus);
}

public double getTotalSalary() 
{
        return salary + bonus;
    }
}

public class Employee_2 {
    public static void main(String[] args) 
   {
        	Scanner scanner = new Scanner(System.in);
        	System.out.println("Enter the number of Employees : ");
        	int n = scanner.nextInt();
        	Manager[] managers = new Manager[n];
        	for (int i = 0; i < n; i++) 
	{
		System.out.println("\n**** Employee "+(i+1)+" ****");
            		managers[i] = new Manager();
            		managers[i].accept();
        	}

	if(managers.length>0)
	{
		Manager maxTotalSalary=managers[0];
	for(int i=1;i<managers.length;i++)
	{
		if(managers[i].getTotalSalary()>maxTotalSalary.getTotalSalary())
		{
			maxTotalSalary=managers[i];
		}
	}
       	System.out.println("\n**The Worker with the maximum total salary is: **");
        	maxTotalSalary.display();
	}
    }
}
