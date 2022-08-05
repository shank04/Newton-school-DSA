import java.util.Scanner;

class AddTwoNumbers {

	public static void main(String args[]) {

		// Scanner is used to take input from users
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first number :");

		// declare the variable
		int number1;

		byte number5;

		// assign value to it
		number1 = input.nextInt();

		System.out.println("Enter second number :");

		int number2;

		number2 = input.nextInt();

		int sum;

		sum = number1 + number2;

		System.out.print(sum);
	}
}