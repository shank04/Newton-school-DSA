class TwoPointers {

	static void isPairSum(int arr[], int X) {
		int N = arr.length;

		int i=0,j=N-1;

		while(i < j) {
			if (arr[i] + arr[j] == X) {
				// pair found
				System.out.print("the pair is: " + arr[i] + ", " + arr[j]);
				break;
			}
			else if (arr[i] + arr[j] > X) {
				j--;
			}
			else {
				i++;
			}
		}
	}

	public static void main(String args[]) {
		int arr[] = {10, 20, 35, 50, 75, 80};
		isPairSum(arr, 70);
	}
}