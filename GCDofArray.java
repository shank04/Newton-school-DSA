class GCDofArray {

	static int findGCD(int input1, int input2) {
		int result = Math.max(input1, input2);

		while (result > 0) {
			// check if result is common divisor for both
			if (input1 % result == 0 && input2 % result == 0) {
				break;
			}
			result--;
		}

		return result;
	}

	public static void main(String args[]) {

		int arr[] = {2, 4, 6, 5};

		int result = arr[0]; // 2

		for (int i=1; i<4; i++) {
			result = findGCD(result, arr[i]); // findGCD(2, 5)
		}

		System.out.print("The GCD of array is: " + result);
	}
}