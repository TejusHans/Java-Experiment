// 6.3.java
interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

// InterfaceC extends multiple interfaces
interface InterfaceC extends InterfaceA, InterfaceB {
    void methodC();
}

class TestClass implements InterfaceC {
    public void methodA() {
        System.out.println("Method A from InterfaceA implemented.");
    }

    public void methodB() {
        System.out.println("Method B from InterfaceB implemented.");
    }

    public void methodC() {
        System.out.println("Method C from InterfaceC implemented.");
    }
}

public class Q63 {
    public static void main(String[] args) {
        System.out.println("Tejus, 24csu222");
        TestClass obj = new TestClass();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
