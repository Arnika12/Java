/* Write a multithreading program in java to display series of letters/alphabets.*/

import java.util.*;

class Series extends Thread {

    Scanner sc = new Scanner(System.in);

    public void run() {
        try {
            System.out.println("Enter start alphabet");
            char startAlphabet = Character.toUpperCase(sc.nextLine().charAt(0)); // Read the first character of the input line

            for (char i = startAlphabet; i <= 'Z'; i++) { 
                System.out.print(i + " "); 
            }
            System.out.println(); 
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

public class Displayalphabet {
    public static void main(String args[]) {
        Series ser = new Series();
        ser.start();
    }
}

