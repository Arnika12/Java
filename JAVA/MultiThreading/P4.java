/*4. Write a java program to calculate the sum and average of an array of 1000 integers 
    (generated randomly) using 10 threads. Each thread calculates the sum of 100 integers. 
    Use these values to calculate average. [Use join method ]*/

import java.util.concurrent.ThreadLocalRandom;

class SumThread extends Thread {
    private int[] array;
    private int startIndex, endIndex;
    private int sum;

    public SumThread(int[] array, int startIndex, int endIndex) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public void run() {
        sum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            sum += array[i];
        }
    }

    public int getSum() {
        return sum;
    }
}

public class P4 {
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(100);
        }

        SumThread[] sumThreads = new SumThread[10];
        int startIndex = 0, endIndex = 100;
        for (int i = 0; i < 10; i++) {
            sumThreads[i] = new SumThread(array, startIndex, endIndex);
            sumThreads[i].start();
            startIndex = endIndex;
            endIndex += 100;
        }

        int totalSum = 0;
        for (SumThread thread : sumThreads) {
            thread.join();
            totalSum += thread.getSum();
        }

        double average = (double) totalSum / 1000;
        System.out.println("Sum: " + totalSum);
        System.out.println("Average: " + average);
    }
}
