// Base exception hierarchy
class LevelOneException extends Exception {
    public LevelOneException(String msg) { super(msg); }
}

class LevelTwoException extends LevelOneException {
    public LevelTwoException(String msg) { super(msg); }
}

class LevelThreeException extends LevelTwoException {
    public LevelThreeException(String msg) { super(msg); }
}

// Base class A
class A {
    void show() throws LevelOneException {
        throw new LevelOneException("Exception from class A (Level 1)");
    }
}

// Derived class B
class B extends A {
    @Override
    void show() throws LevelTwoException {
        throw new LevelTwoException("Exception from class B (Level 2)");
    }
}

// Derived class C
class C extends B {
    @Override
    void show() throws LevelThreeException {
        throw new LevelThreeException("Exception from class C (Level 3)");
    }
}

public class Q83 {
    public static void main(String[] args) {
        System.out.println("j");

        A obj = new C();  // Upcasting
        try {
            obj.show();
        } catch (LevelThreeException e) {
            System.out.println("Caught: " + e.getMessage());
        } catch (LevelTwoException e) {
            System.out.println("Caught: " + e.getMessage());
        } catch (LevelOneException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
