import java.util.Scanner;

class MaxElement {

	static int findMax (int arr[]) { // [4, 7, 9, 2, 6]
		int max = arr[0]; // 7

		for (int i=1; i<arr.length; i++) {
			if (arr[i] > max) { // 6 > 9
				max = arr[i]; // 9
			}
		}

		return max;
	}

	static int findSecondMax (int arr[]) { // [9, 7, 4, 2, 6] 
		int max = arr[0]; // 4
		int maxIndex = 0; 
		int secondMax;

		for (int i=1; i<arr.length; i++) {
			if (arr[i] > max) { // 6 > 9
				max = arr[i]; // 9
				maxIndex = i; // 2

			}
		}

		// max = 9,maxIndex = 0
		secondMax = -2147483648; // -1 //  arr[0]

		for (int i=0; i<arr.length; i++) {
			if (i != maxIndex && arr[i] > secondMax) { // 6 > 7
				secondMax = arr[i]; // 7
			}
		}

		return secondMax;
	}

	static int findMin (int arr[]) { 
		int min = arr[0]; 

		for (int i=1; i<arr.length; i++) {
			if (arr[i] < min) { 
				min = arr[i]; 
			}
		}

		return min;
	}

	public static void main (String args[]) {
		
		int arr[] = new int[5];

		// take elements of array as user input
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<5; i++) {
			int input = sc.nextInt();
			arr[i] = input;
		}

		System.out.print("The max element is: ");
		System.out.print(findMax(arr));

		System.out.print("The min element is: ");
		System.out.print(findMin(arr));
	}
}



