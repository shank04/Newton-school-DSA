class KadanesAlgo {

	static int solve(int arr[]) { // [-2, -3, 4, -1, -2, 1, 5, -3]

		int max_so_far = Integer.MIN_VALUE; 
		int max_ending_here = 0;

		for (int i=0; i<arr.length; i++) { 
			max_ending_here += arr[i]; // -2

			if (max_ending_here > max_so_far) { // -2 > 0
				max_so_far = max_ending_here; // 7
			}

			if (max_ending_here < 0) {
				max_ending_here = 0;
			}
		}

		return max_so_far; // 7
	}

	public static void main(String args[]) {
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println("Largest sum of contiguous subarray is: " + solve(arr));
	}
}