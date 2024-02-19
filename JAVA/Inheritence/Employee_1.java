/*3. Write a Java program to create a super class Employee (members – name, salary). 
Derive a sub-class as Developer (member – projectname). 
Derive a sub-class Programmer (member – proglanguage) from Developer. 
Create object of Programmer and display the details of it. Implement this multilevel inheritance with appropriate constructor and methods.*/

class Employee {
 protected String name;
 protected double salary;
 
public Employee(String name, double salary) 
{
 this.name = name;
 this.salary = salary;
 }

 public void display() {
 System.out.println("Employee name: " + name);
 System.out.println("Employee salary: " + salary);
 }
}

class Developer extends Employee {
 protected String projectname;
 
public Developer(String name, double salary, String projectname) {
 super(name, salary);
 this.projectname = projectname;
 }
 @Override
 public void display() {
 super.display();
 System.out.println("Project name: " + projectname);
 }
}
class Programmer extends Developer {
 protected String proglanguage;

 public Programmer(String name, double salary, String projectname, String proglanguage) {
 super(name, salary, projectname);
 this.proglanguage = proglanguage;
 }
 @Override
 public void display() {
 super.display();
 System.out.println("Programming language: " + proglanguage);
 }
}


public class Employee_1{
 public static void main(String[] args) {
 Programmer programmer = new Programmer("RADHA", 10000.0, "Project ", "JAVA");
 programmer.display();
 }
}
