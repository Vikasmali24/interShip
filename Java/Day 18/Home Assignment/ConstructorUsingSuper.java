package Day18;
class Parent {
    Parent() {
        System.out.println("Parent class constructor called");
    }
}

class Child extends Parent {
    Child() {
        super(); // Call to parent class constructor
        System.out.println("Child class constructor called");
    }
}


public class ConstructorUsingSuper {
    
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
