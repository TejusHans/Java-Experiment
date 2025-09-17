class Triangle {
    int a, b, c;

    Triangle() {
        a = 3; b = 4; c = 5;
    }

    double area() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    int perimeter() {
        return a + b + c;
    }
}


public class AreaOfTraingle {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println("Area: " + t.area());
        System.out.println("Perimeter: " + t.perimeter());
         System.out.println("Tejus Hans 24csu222");
    }
}
