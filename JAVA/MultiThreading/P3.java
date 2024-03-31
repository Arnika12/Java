/* 3 . Write a program that create 2 threads – each displaying a message (Pass the message as a 
parameter to the constructor). The threads should display the messages continuously till the 
user presses ctrl-c. Also display the thread information as it is running.*/

import java.util.concurrent.TimeUnit;

class MessageThread extends Thread {
    private String message;

    public MessageThread(String message) {
        this.message = message;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(Thread.currentThread().getName() + ": " + message);
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new MessageThread("Hello from Thread 1!");
        Thread thread2 = new MessageThread("Hi from Thread 2!");

        thread1.start();
        thread2.start();

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
