// Q4.java
public class Q4 {
    public static void main(String[] args) {
        System.out.println("Tejus, 24csu222");

        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();

        a.getBalance();
        b.getBalance();
        c.getBalance();
    }
}

// Abstract class Bank
abstract class Bank {
    abstract void getBalance();
}

// Subclass BankA
class BankA extends Bank {
    void getBalance() {
        System.out.println("Balance in Bank A: $100");
    }
}

// Subclass BankB
class BankB extends Bank {
    void getBalance() {
        System.out.println("Balance in Bank B: $150");
    }
}

// Subclass BankC
class BankC extends Bank {
    void getBalance() {
        System.out.println("Balance in Bank C: $200");
    }
}
