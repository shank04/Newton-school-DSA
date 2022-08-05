class BubbleSort {

	static void sort(int arr[]) {
		int n = arr.length;

		for (int i=0; i<n-1; i++) { // i=3
			for (int j=0; j<n-i-1; j++) { // j=n-4
				if (arr[j] > arr[j+1]) {
					// swap
					int temp = arr[j];
					arr[j] =  arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

	}

	static void insertionSort(int arr[]) { // 5 4 3 2 1
		int n = arr.length; // 5
		int temp,j;

		for (int i=0; i<n; i++) { // N times
			temp = arr[i]; // 5
			j = i; // 3

			while (j>0 && temp < arr[j-1]) {
				arr[j] = arr[j-1]; // arr[1] = arr[0]
				j--; // 0
			}

			arr[j] = temp; // arr[0] = 5
		}
	}

	static void selectionSort(int arr[]) { // 12 11 6 5 13
		int n = arr.length; // 5

		for (int i=0; i<n; i++ ){ 
			min = i; // 12

			for (int j=i+1; j<n; j++) {
				if (arr[j] < arr[min]) { // 13 < 5
					min = j; // 5
				}
			}
			// swap arr[i] and min
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	static void printArray(int arr[]) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String  args[]) {
		int arr[] = {12,11,13,5,6};
		sort(arr);
		printArray(arr);
	}
}