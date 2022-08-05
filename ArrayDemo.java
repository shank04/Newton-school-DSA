import java.util.Scanner;

class ArrayDemo {

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		// creating a char array
		char ch[] = new char[size];

		// take elements of array as user input
		// Scanner sc = new Scanner(System.in);
		for (int i=0; i<5; i++) {
			char input = sc.next().charAt(0); // sc.nextInt(); sc.nextChar()
			ch[i] = input;
		}


		// print all the elements of this array
		System.out.println("Elements of array are:");
		for (int i=0; i<5; i++) {
			System.out.println(ch[i]);
		}
	}
}