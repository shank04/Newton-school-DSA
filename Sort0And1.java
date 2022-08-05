class Sort0And1 {

	static void sortArray(int[] arr) { // [0, 0, 0, 0, 0, 1, 1, 1, 1, 1] 
		// arr[left] = 0 and arr[right] = 0
		// arr[left] = 0 and arr[right] = 1
		// arr[left] = 1 and arr[right] = 0
		// arr[left] = 1 and arr[right] = 1

		int left = 0; // 4
		int right = arr.length-1; // 4

		while (left < right) {
			if (arr[left] == 0 && arr[right] == 0) {
				left++;
			}
			else if (arr[left] == 0 && arr[right] == 1) {
				left++;
				right--;
			}
			else if (arr[left] == 1 && arr[right] == 0) {
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
			else if (arr[left] == 1 && arr[right] == 1) {
				right--;
			}
		}

		for (int i=0;i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public static void main(String args[]) {
		int arr[] = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		sortArray(arr);
	}
}