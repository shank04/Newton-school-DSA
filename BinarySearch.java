class BinarySearch {

	static int binarySearchIterative(int arr[], int l, int r, int x) {
		while (l <= r) {
			int mid = (l + r) / 2;

			if (arr[mid] == x) {
				return mid;
			}

			// if x is greater than arr[mid], search in right half
			if (arr[mid] < x) {
				l = mid + 1;
			}

			// if x is smaller than arr[mid, search in left half
			else if (arr[mid] > x) {
				r = mid - 1;
			}
		}

		// if we reach here, it means element is not present, so return -1
		return -1;
	}

	static int binarySearchRecursive(int arr[], int l, int r, int x) {
		if (l <= r) {
			int mid = (l + r) / 2;

			if (arr[mid] == x) {
				return mid;
			}

			// if x is greater than arr[mid], search in right half
			if (arr[mid] < x) {
				return binarySearchRecursive(arr, mid + 1, r, x);
			}

			// if x is smaller than arr[mid, search in left half
			else if (arr[mid] > x) {
				return binarySearchRecursive(arr, l, mid - 1, x);
			}
		}

		// if we reach here, it means element is not present, so return -1
		return -1;
	}

	public static void main(String args[]) {

		int arr[] = {10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
		int x = 140;

		int res = binarySearchRecursive(arr, 0, arr.length - 1, x);

		if (res == -1) {
			System.out.print("Element not found");
		}
		else {
			System.out.print("Element found at index " + res);
		}

	}
}








