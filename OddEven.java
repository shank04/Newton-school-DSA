import java.util.Scanner;

class OddEven {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		// System.out.println("Enter a number:");

		int input = sc.nextInt();

		// check if this number is odd or even

		if (input % 2 == 0) {
			System.out.println("0");
		}
		else if (input % 2 == 1) {
			System.out.println("1");
		}

		input % 2 == 0 ? "Even" : "Odd"

	}
}