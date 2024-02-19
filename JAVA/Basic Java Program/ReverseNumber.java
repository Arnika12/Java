//2. Write a Java Program to Reverse a Number. Accept number using command line argument.

public class ReverseNumber
{
	public static void main(String args[])
	{
		int no=Integer.parseInt(args[0]);
		System.out.println("The given number is : "+no);
		
		//reverse logic
		int reverse=0;
		while(no>0)
		{
			int reminder;
			reminder=no%10;
			reverse=reverse*10+reminder;
			no=no/10;
		}

		System.out.println("The reverse of given number is :"+reverse);
	}
}