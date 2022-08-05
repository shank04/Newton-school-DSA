class MergeSort {

	static void merge(int arr[], int l, int mid, int r) {
		// length of left sub array
		int n1 = mid - l + 1;
		// length of right sub array
		int n2 = r - mid;

		int left[] = new int[n1]; // 
		int right[] = new int[n2];

		// fill values in left sub array
		for(int i=0; i<n1; i++) {
			left[i] = arr[l+i];
		}
		// left = {27, 38, 43}

		// fill values in right sub array
		for (int i=0; i<n2; i++) {
			right[i] = arr[mid + 1 + i];
		}
		// right = {3, 9, 82}

		int i=0, j=0;

		int k = l; // 0

		while (i<n1 && j<n2) {
			if (left[i] <= right[j]) {
				arr[k] = left[i]; // arr[4] = 43
				i++; // 3
			} 
			else {
				arr[k] = right[j]; // arr[1] = 9
				j++; // 2
			}
			k++; // 5
		}

		// copy remaining elements of left and right subarrays 
		while (i<n1) {
			arr[k] = left[i];
			i++;
			k++;
		}

		while(j<n2) {
			arr[k] = right[j];
			j++;
			k++;
		}

	}

	static void sort(int arr[], int l, int r) { // 38, 27, 43, 3, 9, 82, l = 0, r = 6
		if (l < r) {
			int mid = l + (r-1) / 2; // 4 + (4) / 2 = 4

			// call sort for first half
			sort (arr, l, mid); // l=1, mid=1

			// call sort for second half
			sort (arr, mid + 1, r) // mid = 1, r=2

			merge(arr, l, mid, r);
		}
	}

	public static void main(String args[]) {
		sort ({27, 38, 43, 3, 9, 82}, 0, 5);
	}
}

// Time complexity: O(nlogn)
// Space complexity: O(n)

// n + n/2 + n/4 + n/8..... + 1 = log(n)
// n/2^x = 1
// log(n/2^x) = log1
// logn = 2^x











