// Q5.java
public class Q5 {
    public static void main(String[] args) {
        System.out.println("Tejus, 24csu222");

        A studentA = new A(80, 90, 85);
        B studentB = new B(70, 75, 80, 85);

        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}

// Abstract class Marks
abstract class Marks {
    abstract double getPercentage();
}

// Class A (3 subjects)
class A extends Marks {
    double mark1, mark2, mark3;

    A(double m1, double m2, double m3) {
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3 = m3;
    }

    double getPercentage() {
        return (mark1 + mark2 + mark3) / 3.0;
    }
}

// Class B (4 subjects)
class B extends Marks {
    double mark1, mark2, mark3, mark4;

    B(double m1, double m2, double m3, double m4) {
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3 = m3;
        this.mark4 = m4;
    }

    double getPercentage() {
        return (mark1 + mark2 + mark3 + mark4) / 4.0;
    }
}
