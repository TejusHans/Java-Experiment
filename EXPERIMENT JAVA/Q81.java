public class Q81 {
    public static void main(String[] args) {
        System.out.println("Tejus Hans, 24csu222");

        try {
            if (args.length < 5) {
                throw new CheckArgumentException("Less than 5 arguments provided!");
            }

            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += Integer.parseInt(args[i]);
            }

            System.out.println("Sum of 5 integers: " + sum);

        } catch (CheckArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: All arguments must be integers.");
        }
    }
}

class CheckArgumentException extends Exception {
    public CheckArgumentException(String msg) {
        super(msg);
    }
}
