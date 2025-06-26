package Day18;
class Parent {
    int number = 10;
}

class Child extends Parent {
    int number = 20;

    void display() {
        System.out.println("Child class number: " + number);
        System.out.println("Parent class number using super: " + super.number);
    }
}
    
public class VariableUsingSuperMain {
	public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
