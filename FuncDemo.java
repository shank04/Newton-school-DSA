class FuncDemo {

	static void fun1 (int a) {
		System.out.println(a);
	}

	static void fun2 (int a) {
		System.out.println(a);
	}
	
	public static void main(String args[]) {

		int a = 10;

		System.out.println(a);

		fun2(a * 10);

		// System.out.println(a); // 10

		fun1(++a); // a = a + 1

		System.out.println(a);
	}
}

class A {
	
}

// 10
// 100
// 11
// 11