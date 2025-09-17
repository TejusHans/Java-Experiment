import java.util.Scanner;

 class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("tejus hans 24csu222");

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int digit1 = num / 100;         
        int digit2 = (num / 10) % 10;   
        int digit3 = num % 10;          

        int reverse = (digit3 * 100) + (digit2 * 10) + digit1;

        System.out.println("Reversed number = " + reverse);

        sc.close();
    }
}
