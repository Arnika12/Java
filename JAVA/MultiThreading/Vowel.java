//1. Write a multithreading program in java to display all the vowels from a given String.

import java.io.*;
import java.util.*;

public class Vowel extends Thread
{
	Scanner sc=new Scanner(System.in);
	public void run()
	{
		try
		{
			System.out.println("Enter String");
			String s=sc.nextLine();
			int len=s.length();
			System.out.println("Vowels are");
			for(int i=0;i<len;i++)
			{
				if(s.charAt(i)=='A'|| s.charAt(i)=='a'||
					s.charAt(i)=='E'|| s.charAt(i)=='e'||
					s.charAt(i)=='I'|| s.charAt(i)=='i'||
					s.charAt(i)=='O'|| s.charAt(i)=='o'||
					s.charAt(i)=='U'|| s.charAt(i)=='u')
				{
					System.out.println(s.charAt(i));
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}

	}
	
	public static void main(String args[])
	{
		Vowel p=new Vowel();
		p.start();
	}
}

