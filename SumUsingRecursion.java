class SumUsingRecursion {

	static int sumOfNaturalNumbers(int n) { // 5
		int sum;

		// base case
		if (n==1) {
			return 1;
		}

		sum = sumOfNaturalNumbers(n-1) + n;

		return sum; // 15
	}

	public static void main(String args[]) {
		System.out.print(sumOfNaturalNumbers(5));
	}
}

// sum(5)  // 15
// | |
// sum(4) // 10
// | |
// sum(3) // 6
// | |
// sum(2) // 3
// | |
// sum(1) // 1