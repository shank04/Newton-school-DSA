import java.util.Scanner;

class CountOfVowelsAndConsonants {

	static void vowelsAndConsonants(String str) { // linkedin
		int vowelsCount = 0;
		int consCount = 0;

		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelsCount++;
			}
			else {
				consCount++;
			}
		}

		System.out.println("Count of vowels is: " + vowelsCount);
		System.out.println("Count of consonants is: " + consCount);

	}

	static void countOfCharacters(String input) { // "$TrIng@12^ ArEF%n0"
	int uCount = 0;
	int lCount = 0;
	int nCount = 0;
	int sCount = 0;

	for (int i=0; i<input.length(); i++) {
		char ch = input.charAt(i);

		if (ch >= 65 && ch <= 90) {
			uCount++; // 1
		}
		else if (ch >= 97 && ch <= 122) {
			lCount++; // 1
		}
		else if(ch >= 48 && ch <= 57) {
			nCount++; // 1
		}
		else {
			sCount++; // 1
		}
	}

	System.out.println("Uppercase character count: " + uCount);
	System.out.println("Lowercase character count: " + lCount);
	System.out.println("Numeric character count: " + nCount);
	System.out.println("special character count: " + sCount);

}

	static void countFrequency(String input) { // elephant
		int len = input.length();

		int[] arr = new int[26];

		// fill zeroes in the array
		for (int i=0; i<26; i++) {
			arr[i] = 0;
		}

		// traverse the string to store count of each character in frequency array
		for (int i=0; i<len; i++){
			arr[input.charAt(i) - 'a']++; // arr[4]++ // arr[11]++ // arr[4]++
		}

		// traverse the string to print the count of each character
		for (int i=0; i<len; i++) {
			if ( arr[input.charAt(i)-'a'] != 0 ) {

				System.out.print(input.charAt(i) + ": "); // e: 2 // o: 3 // d: 2
				System.out.println(arr[input.charAt(i) - 'a']); 

				arr[input.charAt(i)-'a'] = 0; 

			}
		}
	}

	static void printCommonCharacters(String string1, String string2) {
		int len1 = string1.length();
		int len2 = string2.length();

		int[] arr1 = new int[26];
		int[] arr2 = new int[26];

		// initialise arr1 to 0
		for (int i=0; i<26; i++) {
			arr1[i] = 0;
		}

		// initialise arr2 to 0
		for (int i=0; i<26; i++) {
			arr2[i] = 0;
		}

		// traverse string1 and store their char count in arr1
		for (int i=0; i<len1; i++) {
			arr1[string1.charAt(i) - 'a']++;
		}

		// traverse string2 and store their char count on arr2
		for (int i=0; i<len2; i++) {
			arr2[string2.charAt(i) - 'a']++;
		}

		for (int i=0; i<26; i++) {
			if (arr1[i] !=0 && arr2[i] != 0) {

				int minCount = Math.min(arr1[i], arr2[i]); // 2

				for (int j=0; j<minCount; j++) {
					System.out.print((char) (i + 'a')); // ehho
				}
			}
		}	
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any string: ");

		String str = sc.nextLine(); 

		// vowelsAndConsonants(str);

		// countOfCharacters(str);

		countFrequency(str);
	}
}