/*7. Write a program in which thread sleep for 6 sec in the loop in reverse order from 100 to 1 
    and change the name of thread. */ 

class CountdownThread extends Thread {
    public void run() {
        try {
            for (int i = 100; i > 0; i--) {
                Thread.currentThread().setName("CountdownThread-" + i);
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(6000); // Sleep for 6 seconds
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
    }
}

public class P7 {
    public static void main(String[] args) {
        Thread countdownThread = new CountdownThread();
        countdownThread.start();
    }
}
