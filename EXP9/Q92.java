import java.io.File;

public class Q92 {
    public static void main(String[] args) {
        System.out.println("Tejus Hans, 24csu222");

        File file = new File("/Users/mokshitaa/Documents");

        if (file.exists()) {
            System.out.println(file.getName() + " file exists.");

        
            file.setReadable(true);
            file.setWritable(false);
            file.setExecutable(false);

            System.out.println("File permissions updated successfully!");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
        } else {
            System.out.println("File does not exist.");
        }
    }
}