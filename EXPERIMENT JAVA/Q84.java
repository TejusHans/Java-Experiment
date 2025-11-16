class MyCustomException extends Exception {
    private String message;

    public MyCustomException(String msg) {
        this.message = msg;
    }

    public void printMessage() {
        System.out.println("Stored Message: " + message);
    }
}

public class Q84 {
    public static void main(String[] args) {
        System.out.println("Tejus Hans, 24csu222");

        try {
            throw new MyCustomException("This is my own custom exception!");
        } catch (MyCustomException e) {
            e.printMessage();
        }
    }
}
