import java.util.Scanner;

class PrimeCheck {
    public static void main(String[] args) {
        
        System.out.println("Tejus Hans 24csu222");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } 
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number.");
                    return; // End program here
                }
            }
            System.out.println(num + " is a prime number.");
        }
    }
}
