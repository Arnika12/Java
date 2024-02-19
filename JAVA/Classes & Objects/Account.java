/*2. Write a program to create class Account (accno, accname, balance). Create an array of 'n' Account objects. 
Define static method “sortAccount” which sorts the array on the basis of balance. 
Display account details in sorted order.*/

import java.util.*;
public class Account {
    private long accno;
    private String accname;
    private double balance;

public Account(long accno, String accname, double balance) {
        this.accno = accno;
        this.accname = accname;
        this.balance = balance;
    }

    public void display() {
        System.out.println("\n Account Number: " + accno);
        System.out.println("Account Name: " + accname);
        System.out.println("Account Balance: " + balance);
    }

    public static void sortAccount(Account[] accounts) {
        Arrays.sort(accounts, (a1, a2) -> Double.compare(a1.balance, a2.balance));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of Accounts: ");
        int n = s.nextInt();
        System.out.println("****Enter Account Details :****");
        Account[] acc = new Account[n];

        for (int i = 0; i < acc.length; i++) {
            System.out.println("\n**Account " + (i + 1)+" **");
            System.out.print("Account Number: ");
            long accno = s.nextLong();
            System.out.print("Account Name: ");
            String accname = s.next();
            System.out.print("Account Balance: ");
            double balance = s.nextDouble();

            acc[i] = new Account(accno, accname, balance);
        }

        System.out.println("\n****Account Details Before Sorting:****");
        for (int j = 0; j < acc.length; j++) {
            acc[j].display();
        }

       sortAccount(acc);

        System.out.println("\n****Account Details After Sorting: ****");
        for (int j = 0; j < acc.length; j++) {
            acc[j].display();
	
        }

        s.close();
    }
}

