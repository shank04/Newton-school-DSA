class Strings {

	public static void main(String args[]) {
		String str = "Newton school";

		// charAt
		System.out.println(str.charAt(3)); // t

		// concat
		String str2 = " is good";
		System.out.println(str.concat(str2)); // Newton school is good
		System.out.println(str2.concat(str)); // is goodNewton school 
		System.out.println(str.concat(str)); // Newton schoolNewton school 

		// length
		System.out.println(str.length()); // 13

		// toUpperCase
		System.out.println(str.toUpperCase()); // NEWTON SCHOOL

		// toLowerCase
		System.out.println(str.toLowerCase()); // newton school

		// equals
		System.out.println(str2.equals(str)); // false
		System.out.println(str.equals(str)); // true

		String str3 = "newton school";
		System.out.println(str.equals(str3)); // false
		System.out.println(str.equalsIgnoreCase(str3)); // true

		// replace
		System.out.println(str.replace('s', 'S')); // "Newton School"

		// substring
		System.out.println(str.substring(3)); // ton school
		System.out.println(str.substring(3, 7)); // ton s

		// contains
		System.out.println(str.contains("sch")) ; // true
		System.out.println(str.contains("schf")); // false

		// indexOf
		System.out.println(str.indexOf('o')); // 4
		System.out.println(str.indexOf('m')); // -1

		System.out.println(str.indexOf('o', 5)); // 10

		// lastIndexOf
		System.out.println(str.lastIndexOf('o')); // 11
		System.out.println(str.lastIndexOf('m')); // -1

		System.out.println(str.lastIndexOf('o', 3)); // -1

		String s1 = "Arun";
		String s2 = "Ram";
		String s3 = "Arun";
		String s4 = "ABC";

		System.out.println(s1.compareTo(s2)); // negative no. (65 - 82 = -17)
		System.out.println(s1.compareTo(s3)); // 0
		System.out.println(s1.compareTo(s4)); // positive no. (114 - 66 = )

	}
}

if (s1 > s2) returns positive no.
if (s1 == s2) return 0
if (s2 > s1) returns negative no.













