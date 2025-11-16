// Q2.java
public class Q2 {
    public static void main(String[] args) {
        System.out.println("Tejus, 24csu222");

        ResizableCircle rc = new ResizableCircle(10);
        System.out.println("Original Radius: 10");
        System.out.println("Original Area: " + rc.getArea());
        System.out.println("Original Perimeter: " + rc.getPerimeter());

        rc.resize(50); // resize to 50% of current radius
        System.out.println("\nAfter resizing to 50%:");
        System.out.println("New Area: " + rc.getArea());
        System.out.println("New Perimeter: " + rc.getPerimeter());
    }
}

// GeometricObject interface
interface GeometricObject {
    double getPerimeter();
    double getArea();
}

// Resizable interface
interface Resizable {
    void resize(int percent);
}

// Circle class implementing GeometricObject
class Circle implements GeometricObject {
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// ResizableCircle class extending Circle and implementing Resizable
class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);  // DOD 3: use super keyword
    }

    public void resize(int percent) {
        radius = radius * percent / 100.0;
    }

    // DOD 4: overriding methods
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
