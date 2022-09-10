class SearchInSortedAndRotatedArray {

	static int pivotedBinarySearch (int arr[], int n, int key) {
		// find pivot
		int pivot = findPivot(arr, 0, n-1); 

		// if the array is not rotated, apply binary seach for complete array
		if (pivot == -1) {
			binarySearchRecursive(arr, 0, n-1, key);
		}

		if (arr[pivot] == key) {
			return pivot;
		}

		if (arr[0] >= key) {
			// apply binary search towards right of pivot
			return binarySearchRecursive(arr, piv+1, n-1, key);
		}
		else if (arr[0] < key) {
			// apply binary search towards left of pivot
			return binarySearchRecursive(arr, 0, piv-1, key);
		}
	}
 
	static int findPivot(int arr[], int low, int high) {
		// base condition
		if (high < low) { // there is not pivot, the array is not rotated
			return -1;
		}
		if (high == low) {
			return low;
		}

		int mid = (low + high) / 2; // 4

		if (arr[mid] > arr[mid + 1]) {
			return  mid;
		}
		else if (arr[mid-1] > arr[mid]) {
			return mid-1;
		}

		if (arr[low] >= arr[mid]) {
			// pivot lies in left half
			return findPivot(arr, 0, mid-1);
		}
		else {
			// pivot lies in right half
			return findPivot(arr, mid + 1, high);
		}

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
		// array is sorted in increasing order
		int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int key = 3;

		pivotedBinarySearch(arr, arr.length, key);
	}
}

// 1 2 3 4 5 6 7 8 9 10
// clockwise
// 5, 6, 7, 8, 9, 10, 1, 2, 3
// arr[0] < arr[mid] -> pivot lies in right half of mid
// anti clockwise
// 8 9 10 1 2 3 4 5 6 7
// arr[0] > arr[mid] -> pivot lies in left half of mid

arr[0] to arr[piv] is in increasing order
arr[piv+1] to arr[n-1] is in inc order

if 



