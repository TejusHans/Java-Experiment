import java.util.Scanner;

 class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int evenCount = 0, oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }

        System.out.println("Array length: " + n);
        System.out.print("Array elements: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nEven numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
        System.out.println("tejus hans 24csu222");
    }
}
