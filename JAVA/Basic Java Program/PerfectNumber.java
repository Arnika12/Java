//7.Write java program to check whether number is Perfect or not.

import java.util.*;
public class PerfectNumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int no=s.nextInt();
		System.out.println("Given number is : "+no);
		
		//check perfect or not
		int sum=0;
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
		}
		if(no==sum)
		{
			System.out.println(no+" is a perfect number");
		}
		else
		{
			System.out.println(no+" is not perfect number");
		}
	}
}