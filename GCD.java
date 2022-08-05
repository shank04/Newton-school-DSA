import java.util.Scanner;

class GCD {

	static int findGCD(int input1, int input2) { // 8 12
		int result = Math.max(input1, input2); // 12

		while (result > 0) {
			// check if result is common divisor for both
			if (input1 % result == 0 && input2 % result == 0) {
				break;
			}
			result--; // 4
		}

		return result;
	}

	static boolean isPrime(int n) { // 9
		for (int i=2; i<=n/2; i++) { // 7
			if (n % i == 0) {
				return false;
			}
			// else {
			// 	return true;
			// }
		}

		return true;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int input1 = sc.nextInt();

		int input2 = sc.nextInt();

		int gcd = findGCD(input1, input2);

		System.out.println("The GCD of two numbers is: " + gcd);

		int lcm = (input1 * input2) / gcd;

		System.out.print("The LCM of two numbers is: " + lcm);

	}
}


