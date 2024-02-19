//6. Write a program create class as MyDate with dd,mm,yy as data members. Write parameterized constructor. 
//Display the date in dd-mm-yy format. (Use this keyword).

import java.util.*;
public class MyDate
{
	private int dd;
	private int mm;
	private int yy;

MyDate()
{
	dd=12;
	mm=9;
	yy=22;
}

private boolean isValidDate(int dd, int mm, int yy) {
        if (dd > 0 && dd <= 31 && mm > 0 && mm <= 12 && yy >= 0 && yy <= 99) {
            return true;
        }
        return false;
    }

MyDate(int dd,int mm,int yy)
{	
             if (isValidDate(dd, mm, yy)) {
            this.dd = dd;
            this.mm = mm;
            this.yy = yy;
             } 
}

public void getInput()
{
	Scanner s=new Scanner(System.in);
	System.out.print("Enter your Birth Day : ");
	int day=s.nextInt();
	System.out.print("Enter your Birth Month : ");
	int month=s.nextInt();
	System.out.print("Enter your Birth Year(in format of yy) :");
	int year=s.nextInt();

	if (isValidDate(day, month, year)) 
	{
            		this.dd = day;
            		this.mm = month;
            		this.yy = year;
        	} 
	else 
	{
            		System.out.println("Invalid date. Using default date (12-09-22).");
        	}
}

public void display()
{
	System.out.println(this.dd+"-"+this.mm+"-"+this.yy);
}


public static void main(String args[])
{
	MyDate date=new MyDate();
	date.getInput();
	System.out.print("Your BirthDate is : ");
	date.display();
}
}

