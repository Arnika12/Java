//5. Define a class student having rollno, name and percentage. 
//Define Default and parameterized constructor. 
//Accept the 5 student details and display it. (Use this keyword).

import java.util.*;
public class Student
{
	String s_name;
	int s_rollno;
	double s_percentage;

Student()
{
	s_name="ABC";
	s_rollno=34;
	s_percentage=78.89;
}

Student(String s_name,int s_rollno,double s_percentage)
{
	this.s_name=s_name;
	this.s_rollno=s_rollno;
	this.s_percentage=s_percentage;
}
public void getInput()
{
	Scanner s=new Scanner(System.in);
	System.out.print("Enter Your Name : ");
	s_name=s.next();
	System.out.print("Enter Your Roll Number : ");
	s_rollno=s.nextInt();
	System.out.print("Enter Your Graduation Percentage : ");
	s_percentage=s.nextDouble();
}

public void display()
{
System.out.println("\nStudnet Name = "+s_name);
System.out.println("Student Roll Number = "+s_rollno);
System.out.println("Student Percentage = "+s_percentage+ "%");
}

public static void main(String args[])
{
	Student[] st=new Student[5];
	System.out.println("****  Enter 5 Student Details  *****");
	for(int i=0;i<5;i++)
	{
		st[i]=new Student();
		System.out.println("\n **  Student "+(i+1)+"  **");
		st[i].getInput();
	}
	System.out.println("\n --------- Student Details : ------------- ") ;
	for(int i=0;i<5;i++)
	{
		st[i].display();
	}
}
}
