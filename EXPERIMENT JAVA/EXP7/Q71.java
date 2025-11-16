package exercises.java;

public class Q71 {
    public static void main(String[] args) {
        System.out.println("Tejus Hans, 24csu222");
        PackageDemoDriver.main(args);
    }
}


class PackageDemoDriver {
    public static void main(String[] args) {
        PackageDemo demo = new PackageDemo();
        demo.display();
    }
}
