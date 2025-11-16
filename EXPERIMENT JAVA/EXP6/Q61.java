// 6.1.java
class Base {
    void displayBase() {
        System.out.println("This is the Base class.");
    }
}

interface One {
    void methodOne();
}

interface Two {
    void methodTwo();
}

class Derived extends Base implements One, Two {
    public void methodOne() {
        System.out.println("Method from Interface One implemented.");
    }

    public void methodTwo() {
        System.out.println("Method from Interface Two implemented.");
    }
}

public class Q61 {
    public static void main(String[] args) {
        System.out.println("Tejus, 24csu222");
        Derived obj = new Derived();
        obj.displayBase();
        obj.methodOne();
        obj.methodTwo();
    }
}
