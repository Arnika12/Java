//4. Write a Java program to print the factors of a given number. (Use Scanner class).

import java.util.*;
public class FactorsOfNumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int x=s.nextInt();
		System.out.println("Given number is : "+x);
		System.out.println("Factors of given number are : ");
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)
			System.out.println(i);
		}
		
	}
}