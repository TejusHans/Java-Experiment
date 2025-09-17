class Point {
    private double x, y;


    Point() {
        x = 0;
        y = 0;
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    public void display() {
        System.out.printf("%7.2f %7.2f\n", x, y);
    }
}

public class Distance {
    public static void main(String[] args) {
        Point p1 = new Point(2.5, 3.5);
        Point p2 = new Point(5.0, 7.0);

        p1.display();
        p2.display();

        double d = Point.distance(p1, p2);
        System.out.printf("Distance: %.2f\n", d);
        System.out.println("Tejus Hans 24csu222");
    }
}