class QuickSort {

	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// 
	static int partition(int arr[], int start, int end) { // 2 1 3
		// we are taking first element as pivot

		int piv = arr[start]; // 3

		// rearranging logic such that elements on the left of piv is smaller than it and elements on the right 
		// are greater than it 

		int i = start + 1; // 1

		for (int j=start+1; j<end; j++) {
			if (arr[j] < piv) {
				swap(arr, i, j); // swap(5, 2)
				i++; // 3
			}
		}
		swap(arr, i-1, start);

		return i-1;
	}

	static void sort(int arr[], int start, int end) { // {3,2}
		if (start < end) {
			int piv = partition(arr, start, end); // piv is index of pivot element

			sort(arr, start, piv-1);

			sort(arr, piv+1, end);
		}
	}

	public static void main(String args[]) {
		int arr[] = {3, 1, 2};
		sort(arr, 0, 2);
		for (int i=0;i<3; i++) {
			System.out.println(arr[i]);
		}
	}
}