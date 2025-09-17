import java.util.Scanner;
class Complex {
    double real, imag;


    Complex(double r, double i) {
        real = r;
        imag = i;
    }

    Complex add(Complex c) {
        return new Complex(real + c.real, imag + c.imag);
    }
    Complex subtract(Complex c) {
        return new Complex(real - c.real, imag - c.imag);
    }
    Complex multiply(Complex c) {
        return new Complex(real * c.real - imag * c.imag, real * c.imag + imag * c.real);
    }
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}
public class ComplexNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first number: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first number: ");
        double i1 = sc.nextDouble();

        System.out.print("Enter real part of second number: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second number: ");
        double i2 = sc.nextDouble();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        System.out.print("Sum: "); c1.add(c2).display();
        System.out.print("Difference: "); c1.subtract(c2).display();
        System.out.print("Product: "); c1.multiply(c2).display();
        System.out.print("Tejus Hans 24csu222");
    }
}