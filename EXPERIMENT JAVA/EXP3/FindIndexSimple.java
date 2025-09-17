import java.util.Scanner;

 class FindIndexSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Enter array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Enter number to search
        System.out.print("Enter number to search: ");
        int search = sc.nextInt();

        // Show array elements
        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Find index
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                index = i;
                break;
            }
        }

        // Print result
        System.out.println("Index: " + index);
    }
}

