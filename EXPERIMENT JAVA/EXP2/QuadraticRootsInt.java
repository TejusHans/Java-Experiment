import java.util.Scanner;

class QuadraticRootsInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("tejus hans 24csu222");

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int d = b * b - 4 * a * c; 

        if (d >= 0) { 
            int sqrtD = (int) Math.sqrt(d); 
            int root1 = (-b + sqrtD) / (2 * a);
            int root2 = (-b - sqrtD) / (2 * a);
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else {
            System.out.println("No real roots.");
        }

        sc.close();
    }
}
