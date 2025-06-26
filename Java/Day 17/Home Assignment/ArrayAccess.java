package Day17Home;

import java.util.Scanner;

public class ArrayAccess {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the index to access (0 to 4): ");
        int index = scanner.nextInt();

        try {
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please enter a value between 0 and 4.");
        }
    }
}
