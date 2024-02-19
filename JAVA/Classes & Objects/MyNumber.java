/*1. Define a class MyNumber having one private integer data member. Write a default constructor initialize 
it to 0 and another constructor to initialize it to a value. Write methods isNegative, isPositive, isOdd, iseven. 
Use command line argument to pass a value to the object and perform the above operations.*/


public class MyNumber
{
	private int num;

public MyNumber()
{
	int num=0;
}

public MyNumber(int num)
{
	this.num=num;
}

public void isNegative()
{
	if(num<0)
	{
		System.out.println(num+" is Negative Number");
	}
}

public void isPositive()
{
	if(num>0)
	{
		System.out.println(num+" is Positive Number");
	}
}

public void isOdd()
{
	if(num%2!=0)
	{
		System.out.println(num+" is Odd Number");
	}
}

public void isEven()
{
	if(num%2==0)
	{
		System.out.println(num+" is Even Number");
	}
}

public static void main(String args[])
{
if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

int num=Integer.parseInt(args[0]);
MyNumber mynum=new MyNumber(num);
mynum.isPositive();
mynum.isNegative();
mynum.isOdd();
mynum.isEven();
}
}