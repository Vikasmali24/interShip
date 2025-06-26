package Day18Home;

class Parent {
    Parent(String message) {
        System.out.println("Parent constructor: " + message);
    }
}

class Child extends Parent {
    Child(String message) {
        super(message); // Call to parameterized constructor of Parent
        System.out.println("Child constructor: " + message);
    }
}

public class ParentMain {
	 public static void main(String[] args) {
	        Child obj = new Child("Welcome to Java Inheritance");
	    }

}
