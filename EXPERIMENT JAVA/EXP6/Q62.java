// 6.2.java
interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class Demo implements ChildInterface {
    public void parentMethod() {
        System.out.println("Parent interface method implemented.");
    }

    public void childMethod() {
        System.out.println("Child interface method implemented.");
    }
}

public class Q62 {
    public static void main(String[] args) {
        System.out.println("Tejus, 24csu222");
        Demo obj = new Demo();
        obj.parentMethod();
        obj.childMethod();
    }
}
