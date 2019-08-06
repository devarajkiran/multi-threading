package demo2;

public class DogMainClass {
    public static void main(String[] args) {
        Thread dt = new Thread(new DogThread());
        dt.start();
    }
}
