class SubarrayWithGivenSum {

	static void solve(int arr[], int n, int sum) { // [1, 4, 20, 3, 10, 5], sum = 33
		int start = 0;
		int end = -1;
		int curr_sum = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i=0; i<n; i++) {

			curr_sum += arr[i]; // 38

			if (curr_sum == sum) {
				end = i;
				break;
			}

			if (hm.containsKey(curr_sum - sum)) {
				start = hm.get(curr_sum - sum) + 1;
				end = i;
				break;
			}

			hm.put(curr_sum, i); // {1->0, 5->1, 25->2, 28->3}
		}

		if (end == -1) {
			// No subarray case
			System.out.println("No subarray found");
		}
		else {
			System.out.println("start index=" + start + " end Index=" + end);
		}
	}

	public static void main(String args[]) {

	}
}