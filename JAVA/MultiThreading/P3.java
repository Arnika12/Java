/* 3 . Write a program that create 2 threads – each displaying a message (Pass the message as a 
parameter to the constructor). The threads should display the messages continuously till the 
user presses ctrl-c. Also display the thread information as it is running.*/


class MessageThread extends Thread {
    private String message;

    public MessageThread(String message) {
        this.message = message;
    }

    public void run() {
        try 
        {
            while (true) {
                System.out.println(Thread.currentThread().getName() + ": " + message);
                // TimeUnit.SECONDS.sleep(1);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
    }
}

public class P3 {
    public static void main(String[] args) {
        Thread t1 = new MessageThread("Hello from Thread 1!");
        Thread t2 = new MessageThread("Hi from Thread 2!");

        t1.start();
        t2.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
