import java.util.Scanner;

public class MinutesConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.println("tejus hans 24csu222");

        System.out.print("Enter number of minutes: ");
        int totalMinutes = scanner.nextInt();

        int minutesInDay = 24 * 60; // 1440
        int minutesInMonth = 30 * minutesInDay; // 43200
        int minutesInYear = 365 * minutesInDay; // 525600

    
        int years = totalMinutes / minutesInYear;
        int remainingMinutes = totalMinutes % minutesInYear;

        int months = remainingMinutes / minutesInMonth;
        remainingMinutes = remainingMinutes % minutesInMonth;

        int days = remainingMinutes / minutesInDay;

        // Output
        System.out.println("Equivalent Time:");
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);

        scanner.close();
    }
}
