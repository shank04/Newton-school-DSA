// Find the maximum sum of K consecutive elements.
// [100, 200, 300, 400], k=2
class SlidingWindow {

	// basic approach, TC: O(n^2)
	static int findSum(int arr[], int k, int n) {
		int max_sum = Integer.MIN_VALUE;

		for (int i=0; i<n-k+1; i++) {
			int sum = 0;
			for (int j=0; j<k; j++) {
				sum += arr[i + j]; // 700
			}
			max_sum = Math.max(max_sum, sum); // 700
		}

		return max_sum;
	}

	static int findSumUsingSlidingWindow(int arr[], int k, int n) {
		int window_sum = 0;
		int max_sum = Integer.MIN_VALUE;

		// find the sum of first k elements or the first window
		for (int i=0; i<k; i++) {
			window_sum += arr[i]; 
		}

		int max_sum = window_sum;
		for (int i=k; i<n; i++) {
			window_sum += (arr[i] - arr[i-k]); // win_sum+=(arr[3] - arr[1])
			max_sum = Math.max(max_sum, window_sum);
		}

		return max_sum;
	}

	public static void main(String args[]) {
		int arr[] = {100, 200, 300, 400};
		int k = 2;
		findSum(arr, k, arr.length);
		findSumUsingSlidingWindow(arr, k, arr.length);

	} 
}

// sum of second window = 300 - 100 + 300 = 500
// sum of third window = 500 - 200 + 400 = 700







