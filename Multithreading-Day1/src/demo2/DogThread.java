package demo2;

public class DogThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            walk();
            wag();
        }
    }

    private void wag() {
        System.out.println(Thread.currentThread().getName() + " walk");
    }

    private void walk() {
        System.out.println(Thread.currentThread().getName() + " wag");
    }
}
