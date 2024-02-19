//6. Write a Java Program to Display Armstrong Numbers Between range. Accept range from user.

import java.util.*;
public class ArmstrongNumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Start range : ");
		int x=s.nextInt();
		System.out.println("Enter End range : ");
		int y=s.nextInt();
		
		System.out.println("The armstrong numbers between "+x+" and "+y+" are : ");

     		for (int i = x; i<y; i++)
		{
         			int check, rem, sum = 0;
         			check = i;
           		 	rem = check % 10;
            			sum = sum + (rem * rem * rem);
            			check = check / 10;

         		if(sum == i)
		{
            			System.out.println(i);
         		}
      		}
  	 }
}