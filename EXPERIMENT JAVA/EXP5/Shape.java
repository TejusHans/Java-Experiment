public class shape {
    public static void main(String[] args) {
        System.out.println("Tejus Hans, 24csu222");
        Square s = new Square();
        s.printShape();
        s.printRectangle();
    }
}

class Shape {
    void printShape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    void printCircle() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    void printSquare() {
        System.out.println("Square is a rectangle");
    }
}
