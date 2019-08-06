package demo4;

public class MonkeyThread {
    private Thread movingThread;
    private boolean awake;

    public void move() {
        awake = true;
        movingThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (awake) {
                    System.out.println("walk");
                    System.out.println("jump");
                }
            }
        });
        movingThread.start();
    }

    public static void main(String[] args) {
        new MonkeyThread().move();
    }
}
