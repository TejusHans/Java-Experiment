import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

       
        System.out.println("Reversed array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
