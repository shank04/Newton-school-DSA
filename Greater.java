import java.util.Scanner;

class Greater {

	// function definition or function declaration
	static int findGreater (int a, int b) {
		// int max;
		// if (a >= b) {
		// 	max = a;
		// }
		// else {
		// 	max = b;
		// }

		// return max;
		return a >=b ? a : b;
	}

	static void findGreater2 (int a, int b) {
		int max = a >=b ? a : b;

		System.out.println(max);

		return;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number:");

		int input1 = sc.nextInt();

		System.out.println("Enter second number:");

		int input2 = sc.nextInt();

		System.out.println("The greater number is: ");

		int max = findGreater(input1, input2);

		System.out.println(max);

		findGreater2(45, 54); 

	}
}







