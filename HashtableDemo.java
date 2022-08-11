import java.util.*;


class HashtableDemo {

	public static void main(String args[]) {
		Hashmap<Integer, String> ht1 = new Hashmap<Integer, String>(5);

		ht1.put(1, "firstValue");
		ht1.put(2, "secondValue");
		ht1.put(3, "thirdValue");


		Hashtable<Integer, Integer> ht2 = new Hashtable<Integer, Integer>(10);

		// add key/value pairs
		ht2.put(1, 5);
		ht2.put(2, 6);
		ht2.put(3, 7);

		System.out.println("Mappings of ht1: " + ht1);
		System.out.println("Mappings of ht2: " + ht2);

		if (ht1.containsKey(3)) {
			// get value at key 3
			String value = ht1.get(3);
			System.out.println("Value for key 3 is: " + value);
		}

		// update the value for key 2
		ht2.put(2, 8);
		System.out.println("Updated ht2: " + ht2);

		// remove key 2 from the table
		ht1.remove(2);
		System.out.println("Updated ht1: " + ht1);

		// traverse the hastable
		for (Map.Entry<Integer, String> e: ht1.entrySet()) {
			System.out.println(e.getKey() + " -> " + e.getValue());
		}

		System.out.println("Size of ht1 is: " + ht1.size());

	}
}
ind all the distinct elements of an array
[2, 4, 2, 3, 9, 3]
output: 4, 9
find all the duplicate elements of an array
input: [2, 4, 2, 3, 9, 3]
output: 2, 3

key -> value
2		2
4		1
3		2
9		1


