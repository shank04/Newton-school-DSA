class StackUsingLL {
	StackNode head;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int data) {
			this.data = data;
		}
	}

	void push(int x) { // insert at beginning of LL

		StackNode node = new StackNode(x); // head -> 14|null -> 12|null -> 10|null

		if (head == null) { // this is for first push
			head = node;
		}
		else {
			node.next = head; // 12.next = 10
			head = node;
		}
		System.out.println(x + " pushed into the stack");
	}

	void pop() { // head ->  12|null -> 10|null
		if (head == null) {
			System.out.println("Stack is empty, cannot pop");
		}
		else {
			head = head.next;
		}
	}

	int peek() {
		if (head == null) {
			System.out.println("Stack is empty, cannot peek");
			return -1;
		}
		else {
			return head.data;
		}
	}

	boolean isEmpty() {
		return head == null;
	}

	int size() {
		int count = 0;
		StackNode temp = head;

		while (temp != null) {
			count++;
			temp = temp.next;
		}

		return count;
	}

	public static void main(String args[]) {
		StackUsingLL stack = new StackUsingLL();

		stack.push(10);
		stack.push(12);
		stack.push(14);

		stack.pop();

		System.out.println(stack.peek()); // 12
	}
}