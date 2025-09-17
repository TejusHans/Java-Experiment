import java.util.Scanner;

class CountEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Tejus Hans 24csu222");

        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        
        int evenCount = 0, oddCount = 0;
        for (int i : arr) {
            if (i % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        
        int[] evenArr = new int[evenCount];
        int[] oddArr = new int[oddCount];

        
        int eIndex = 0, oIndex = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                evenArr[eIndex++] = i;
            } else {
                oddArr[oIndex++] = i;
            }
        }

        
        System.out.println("Array length: " + n);
        System.out.print("Array elements: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("\nEven elements array: ");
        for (int i : evenArr) {
            System.out.print(i + " ");
        }

        System.out.print("\nOdd elements array: ");
        for (int i : oddArr) {
            System.out.print(i + " ");
        }

        System.out.println("\nNumber of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);

        scanner.close();
    }
}