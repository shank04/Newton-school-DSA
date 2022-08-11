class HashMapApplication {

	public static void main(String[] args) {
		int arr[] = {2, 4, 2, 3, 9, 3};

		Hashmap<Integer, Integer> frequency = new Hashmap<Integer, Integer>();

		for (int i=0; i<arr.length; i++) {
			if (frequency.containsKey(arr[i])) {

				Integer prevCount = frequency.get(arr[i]);
				frequency.put(arr[i], prevCount++);
			}
			else {

				frequency.put(arr[i], 1);
			}
		}

		// print duplicate elements in array
		for (Map.Entry<Integer, String> e: frequency.entrySet()) {
			if (e.getValue > 1) {
				System.out.println(e.getKey());
			}
		}

		// print distinct elements in array
		for (Map.Entry<Integer, String> e: frequency.entrySet()) {
			if (e.getValue == 1) {
				System.out.println(e.getKey());
			}
		}

	}
}

2 -> 2
4 -> 1
3 -> 2
9 -> 1

"godisgood"

