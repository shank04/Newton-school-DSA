package pack;

import mypack.A;

public class AccessModifier {

	private int data = 10;
	private void hello() {
		System.out.println("hello");
	}

	public static void main(String args[]) {
		AccessModifier obj = new AccessModifier();

		obj.hello();
		System.out.println(obj.data);
	} 
}

class Test {
	// Compile time error
	public static void main(String args[]) {
		AccessModifier obj = new AccessModifier();

		obj.hello();
		System.out.println(obj.data);
	} 
}