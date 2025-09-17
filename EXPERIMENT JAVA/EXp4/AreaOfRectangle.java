import java.util.Scanner;

class Area {
    int length, breadth;

    Area(int l, int b) {
        length = l;
        breadth = b;
    }

    int returnArea() {
        return length * breadth;
    }
}

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = scanner.nextInt();
        System.out.print("Enter breadth: ");
        int b = scanner.nextInt();

        Area rect = new Area(l, b);
        System.out.println("Area of Rectangle: " + rect.returnArea());
        System.out.println("Tejus Hans 24csu222");
    }
}
