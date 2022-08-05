import java.util.Scanner;

class FrequencyInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt(); // c

		int arr[] = new int[size]; // c*size

		for (int i=0; i<size; i++) {
			int input = sc.nextInt();

			arr[i] = input;
		}

		int frequency[] = new int[101]; // 101*c
		
		for (int i=0; i<size; i++) {
			frequency[arr[i]]++;
		}

		for (int i=0; i<size; i++) {
			if (frequency[arr[i]] > 0) {
				System.out.println(arr[i] + ": " + frequency[arr[i]]);
			}
			frequency[arr[i]] = 0;
		}


	}
}