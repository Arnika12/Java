// 1) Write a java program to accept a number from the user, if number is zero then throw user defined exception ―Number is 0, otherwise check whether no is prime or not

import java.util.Scanner;

// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class PrimeNumber {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        int i,count=0;
        for( i=1;i<=number;i++)
        {
	        if(number %i==0)
                {
		        count++;
	        }
         }
        return count==2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            int number = scanner.nextInt();

            if (number == 0) {
                throw new CustomException("Number is 0");
            } else {
                if (isPrime(number)) {
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }
            }
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}
