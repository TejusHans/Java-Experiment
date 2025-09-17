import java.util.Scanner;

public class vehicle {
    public static void main(String[] args) {
        System.out.println("Tejus Hans, 24csu222");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vehicle v;
        switch (n) {
            case 2:
                v = new Bike();
                break;
            case 4:
                v = new Car();
                break;
            default:
                v = new Vehicle();
        }
        v.display();
        sc.close();
    }
}

class Vehicle {
    void display() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("This is a Car");
    }
}

class Bike extends Vehicle {
    void display() {
        System.out.println("This is a Bike");
    }
}
