// 2) Write a java program to accept Doctor Name from the user and check whether it is valid or not. (It should not contain digits and special symbol) If it is not valid then throw user defined Exception - Name is Invalid -- otherwise display it

import java.util.Scanner;

// Custom exception class
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

public class DoctorNameValidation {
    // Function to check if the name is valid
    static boolean isValidName(String name) {
        return name.matches("[a-zA-Z]+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Doctor's Name: ");

        try 
{
            	String doctorName = scanner.nextLine();

            
if (!isValidName(doctorName)) 
{
                throw new InvalidNameException("Name is Invalid");
  } else {
                System.out.println("Doctor's Name: " + doctorName);
            }
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("\nThanks for using my code !");
        }
    }
}
