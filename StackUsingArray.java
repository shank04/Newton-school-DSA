class StackUsingArray {
	static final int SIZE = 100;
	int top; // index of array
	int a[] = new int[SIZE];

	StackUsingArray() {
		top = -1;
	}

	void push(int x) {
		if (top >= (SIZE - 1)) {
			System.out.println("Stack is full, we cannot push");
			return;
		}

		top++;
		a[top] = x; // a[0]=10,
		System.out.println(x + " pushed into the stack");
	}

	void pop() {
		if (top < 0) {
			System.out.println("Stack is empty, we cannot pop");
			return;
		}

		int x = a[top];
		top--;
		System.out.println(x + " popped from the stack");
	}

	void print() {
		for (int i=top; i>-1; i--) {
			System.out.print(a[i] + " ");
		}
	}

	int peek() {
		if (top < 0) {
			System.out.println("Stack is empty, we cannot peek");
			return -1;
		}
		else {
			int x = a[top];
			return x;
		}
	}

	int size() {
		return top+1;
	}

	boolean isEmpty() {
		// if (top < 0) {
		// 	return true;
		// }
		// else {
		// 	return false;
		// }

		return (top < 0); 
	}

	boolean areBracketsBalanced(String expr) { // [({})] 

		StackUsingArray st = new StackUsingArray();

		for (int i=0; i<expr.length(); i++) {
			char x = expr.charAt(i); // ]

			if (x == '(' || x == '{' || x == '[') { // stack : 
				st.push(x);
				continue;
			}

			// if the char is of closing type then stack cannot be empty Ex: ()[])
			if (st.isEmpty()) {
				return false;
			}

			char check = st.pop(); // [

			switch (x) {
				case ')':
					if (check == '{' || check == '[') {
						return false;
					}
					break;

				case '}':
					if (check == '(' || check == '[') {
						return false;
					}
					break;

				case ']':
					if (check == '{' || check == '(') {
						return false;
					}
					break;
			}

		}

		return st.isEmpty();
	}

	public static void main(String args[]) {
		StackUsingArray stack = new StackUsingArray();

		stack.push(10);
		stack.push(6);
		stack.push(9);

		stack.print();

		stack.pop();
		stack.pop();

		stack.print();

		stack.push(11);

		System.out.println(stack.peek()); // 11

		System.out.println(stack.top); // 1

	}
}

// in push(), top will be incremented, in pop(), top will be decremented.

// top++ vs top+1

// top++ is same as top = top + 1

// top++ changes the value of top but top + 1 does not change the value of top

