import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.println("tejus hans 24csu222");

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);

        System.out.println("Temperature in Celsius: " + celsius);
    }
}
