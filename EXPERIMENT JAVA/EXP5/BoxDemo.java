import java.util.Scanner;

class Box {
    double width;
    double height;
    double depth;

    // Default constructor
    Box() {
        width = 4;
        height = 6;
        depth = 8;
    }

    // Non-parameterized constructor (all values = 0)
    Box(boolean empty) {
        width = 0;
        height = 0;
        depth = 0;
    }

    // Parameterized constructor
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Default constructor
        Box b1 = new Box();
        System.out.println("Volume (default constructor) = " + b1.volume());

        // Non-parameterized constructor (zero values)
        Box b2 = new Box(true);
        System.out.println("Volume (non-parameterized constructor) = " + b2.volume());

        // Parameterized constructor
        Box b3 = new Box(2, 3, 4);
        System.out.println("Volume (parameterized constructor) = " + b3.volume());

        // Using setDim() with user input
        Box b4 = new Box();
        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.print("Enter depth: ");
        double d = sc.nextDouble();

        b4.setDim(w, h, d);
        System.out.println("Volume (setDim method) = " + b4.volume());

        sc.close();
    }
}

