//3.Write a Java program to print the sum of elements of the array. Also display array elements in ascending order.

import java.util.*;
public class SumOfArray
{
	public static void main(String args[])
	{
		int i,sum=0;
		int arr[]={1,2,3,4,5,6,7,8};
		System.out.println("Given array is : "+Arrays.toString(arr));
		for(i=0;i<arr.length;i++ )
		{
			sum=sum+arr[i];
		}
		System.out.println("Additioin of given array is : "+sum);

		System.out.println("Ascending order array is : ");
		Arrays.sort(arr);
    		for (int j=0; j<arr.length; j++) 
		{
      			System.out.println(arr[j]);
    		}
	}
}