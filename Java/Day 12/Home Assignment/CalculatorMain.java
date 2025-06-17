class Calculator {
    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Add integer and double
    double add(int a, double b) {
        return a + b;
    }
}

class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum (int, int): " + calc.add(5, 10));
        System.out.println("Sum (int, int, int): " + calc.add(1, 2, 3));
        System.out.println("Sum (double, double): " + calc.add(4.5, 5.5));
        System.out.println("Sum (int, double): " + calc.add(10, 2.5));
    }
}
