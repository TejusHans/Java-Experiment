import java.util.Scanner;

public class SimpleArraySum {
    
    static int sumAll(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int sumAlternate(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i = i + 2) { // alternate = 0,2,4...
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Menu:");
        System.out.println("1. Sum of all elements");
        System.out.println("2. Sum of alternate elements");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Sum of all = " + sumAll(arr));
        } else if (choice == 2) {
            System.out.println("Sum of alternate = " + sumAlternate(arr));
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
