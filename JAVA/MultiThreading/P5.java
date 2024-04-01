
/*5. Define a thread called “PrintText_Thread” for printing text on command prompt for n number of times. 
    Create three threads and run them. Pass the text and n as parameters to the thread constructor. Example:
    i. First thread prints “I am in FY” 10 times
    ii. Second thread prints “I am in SY” 20 times
    iii. Third thread prints “I am in TY” 30 times*/

class PrintText_Thread extends Thread {
    private String text;
    private int times;

    public PrintText_Thread(String text, int times) {
        this.text = text;
        this.times = times;
    }

    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }
}

public class P5 {
    public static void main(String[] args) {
        PrintText_Thread t1 = new PrintText_Thread("I am in FY", 10);
        PrintText_Thread t2 = new PrintText_Thread("I am in SY", 20);
        PrintText_Thread t3 = new PrintText_Thread("I am in TY", 30);

        t1.start();
        try {
            t1.join(); // Wait for t1 to finish
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted");
        }

        t2.start();
        try {
            t2.join(); // Wait for t2 to finish
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted");
        }

        t3.start();
        try {
            t3.join(); // Wait for t3 to finish
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted");
        }
    }
}
