//5. Write a Java program to accept a number from user and print all prime numbers up to that number (Use Buffered 
//Reader class).

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PrimeNumber
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("Enter a number : ");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader bfr=new BufferedReader(isr);

		int num=Integer.parseInt(bfr.readLine());
		System.out.println("Given number is : "+num);	
		System.out.println("The prime numbers up to " + num + " are: ");
		
		for(int i=1;i<=num;i++)
      		{
			int count=0;
            			for(int j=1;j<=i;j++)
            			{
                				if(i%j==0)
                   	 		count++;
            			}
            		if(count==2)
                    		System.out.println(i);
		}
       		
	}


}
