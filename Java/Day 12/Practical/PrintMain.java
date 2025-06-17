interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing document...");
    }
}

class Photo implements Printable {
    public void print() {
        System.out.println("Printing photo...");
    }
}

public class PrintMain {
    public static void main(String[] args) {
        Printable p1 = new Document();
        Printable p2 = new Photo();
        p1.print();
        p2.print();
    }
}
