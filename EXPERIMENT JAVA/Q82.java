public class Q82 {
    public static void main(String[] args) {
        System.out.println("Tejus Hans, 24csu222");

        try {
            throw new Exception("This is a custom exception message!");
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed — proof that it always runs.");
        }
    }
}
