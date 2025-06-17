class Student {
    private String name;
    private int age;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Ravi");
        s.setAge(20);
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
