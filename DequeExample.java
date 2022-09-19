class DequeExample {

	static void printMaxOfSubarray(int arr[], int k, int n) {
		Deque<Integer> Q = new LinkedList<Integer>();

		// find max of first window
		int i;
		for (i=0; i<k; i++) {

			// remove useless elements from the queue
			while (!Q.isEmpty() && arr[i] >= arr[Q.peekLast()]) {
				Q.removeLast();
			}

			Q.addLast(i);
		}

		for (; i<n; i++) {
			// print first element, it is the max of previous window
			System.out.print(arr[Q.peekFirst()]);

			// remove elements out of this window
			while (!Q.isEmpty() && Q.peek() <= i-k) {
				Q.removeFirst();
			}

			// remove useless elements from the queue
			while (!Q.isEmpty() && arr[i] >= arr[Q.peekLast()]) {
				Q.removeLast();
			}

			// add curr element to Q
			Q.addLast(i);
		}

		// print max of last window
		System.out.print(arr[Q.peekFirst()]);
	}

	public static void main(String args[]) {
		int arr[] = {3, 2, 1, 1, 4, 5, 2, 3, 6};
		int k = 3;
		printMaxOfSubarray(arr, k, arr.length);
	}
}
// i = 8, Q.peek() = 5
// 8-3 > Q.peek()