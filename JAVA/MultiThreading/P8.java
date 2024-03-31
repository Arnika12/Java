/*8. Write a program to solve producer consumer problem in which a producer produces a value and 
    consumer consume the value before producer generate the next value. 
    (Hint: use thread synchronization)*/

class Buffer {
    private int value;
    private boolean available = false;

    public synchronized int get() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        available = false;
        notifyAll();
        return value;
    }

    public synchronized void put(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.value = value;
        available = true;
        notifyAll();
    }
}

class ProducerThread extends Thread {
    private Buffer buffer;

    public ProducerThread(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            buffer.put(i);
            System.out.println("Produced: " + i);
            try {
                Thread.sleep(1000); // Simulate some processing time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class ConsumerThread extends Thread {
    private Buffer buffer;

    public ConsumerThread(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            int value = buffer.get();
            System.out.println("Consumed: " + value);
            try {
                Thread.sleep(1500); // Simulate some processing time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class P8 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Thread producerThread = new ProducerThread(buffer);
        Thread consumerThread = new ConsumerThread(buffer);

        producerThread.start();
        consumerThread.start();
    }
}
