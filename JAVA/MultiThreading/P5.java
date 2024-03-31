
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

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new PrintText_Thread("I am in FY", 10);
        Thread thread2 = new PrintText_Thread("I am in SY", 20);
        Thread thread3 = new PrintText_Thread("I am in TY", 30);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
