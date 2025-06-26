
class Parent {
    void greet() {
        System.out.println("Hello from Parent class");
    }
}

class Child extends Parent {
    void greet() {
        System.out.println("Hello from Child class");
        super.greet();  // Calling parent class method
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.greet();
    }
}
