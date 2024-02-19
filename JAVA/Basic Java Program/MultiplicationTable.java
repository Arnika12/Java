//1. Write a Java program to accept a number from user and generate multiplication table of a number. 
//Accept number using Buffered Reader class.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationTable
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("Enter a number :");
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader bfr=new BufferedReader(in);

		int num=Integer.parseInt(bfr.readLine());
		System.out.println("You entered : "+num);

		System.out.println("Multiplication table of"+num+" is :");
		for(int i=0;i<=10;i++)
		{
			int multi=num*i;
			System.out.println(num+"*"+i+"="+multi);
		}
		bfr.close();
	}
}