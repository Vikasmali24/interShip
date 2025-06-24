package Demo;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 4567; 
        int sum = 0;

        do {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        } while (number != 0);

        System.out.println("Sum of digits is: " + sum);


	}

}
