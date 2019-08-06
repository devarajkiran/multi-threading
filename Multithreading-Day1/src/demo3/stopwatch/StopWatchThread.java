package demo3.stopwatch;

import java.util.Date;
import java.util.Scanner;

public class StopWatchThread implements Runnable {
    long start;

    @Override
    public void run() {
        if (start <= 0L) {
            this.start = new Date().getTime();
        } else {
            System.out.println(new Date().getTime() - this.start);
        }
    }

    public static void main(String[] args) {
        StopWatchThread swt = new StopWatchThread();
        Thread t1 = new Thread(swt);
        Thread t2 = new Thread(swt);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int start = scanner.nextInt();
            if (start == 1) {
                t1.start();
            }
            if (start == 0) {
                t2.start();
            }
        }

    }
}
