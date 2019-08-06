package demo1;

public class DogMainClass {
    public static void main(String[] args) {
        DogThread dt = new DogThread("Misty");
        dt.start();

        DogThread dt2 = new DogThread("gunda");
        dt2.start();
    }
}
