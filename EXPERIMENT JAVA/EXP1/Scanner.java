import java.util.Scanner;

class Operators {
    public static void main(String args[]) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter two numbers
        System.out.print("Enter the first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter the second number (b): ");
        int b = sc.nextInt();

        // Perform and print arithmetic operations
        System.out.println("The sum is " + (a + b));
        System.out.println("The difference is " + (b - a));
        System.out.println("The product is " + (a * b));
        System.out.println("The difference is" +(a/b));
        System.out.print("The modulus is" +(a%b));

        // Close the scanner
        sc.close();
    }
}
