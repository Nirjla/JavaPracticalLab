import java.util.Scanner;
abstract class FMachine {
    public abstract void getData();
    public abstract void putData();
}

class Airplane extends FMachine {
    private int code;
    private String name;
    private int capacity;

    public void getData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter airplane code: ");
        code = scanner.nextInt();

        System.out.print("Enter airplane name: ");
        name = scanner.next();

        System.out.print("Enter airplane capacity: ");
        capacity = scanner.nextInt();
    }

    public void putData() {
        System.out.println("Airplane code: " + code);
        System.out.println("Airplane name: " + name);
        System.out.println("Airplane capacity: " + capacity);
    }
}

public class AirplaneDemo {
    public static void main(String[] args) {
        Airplane a1 = new Airplane();
        a1.getData();
        a1.putData();

        Airplane a2 = new Airplane();
        a2.getData();
        a2.putData();
    }
}
