// Q3.java
public class Q3 {
    public static void main(String[] args) {
        System.out.println("Tejus, 24csu222");

        Area obj = new Area();
        obj.RectangleArea(5, 10);
        obj.SquareArea(4);
        obj.CircleArea(3);
    }
}

// Abstract class Shape with abstract methods
abstract class Shape {
    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}

// Concrete class Area implementing all abstract methods
class Area extends Shape {

    void RectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }

    void SquareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square = " + area);
    }

    void CircleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}
