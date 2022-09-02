class CircularLinkedList {
	Node last;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	void printList() {
		Node first = last.next;

		do {
			System.out.print(first.data + " ");
			first = first.next;

		}while (first != last.next);

	}

	void insertAtEnd(int data) {
		Node n = new Node(data);

		n.next = last.next;
		last.next = n;
		last = n;
	}

	void insertAtBeginning(int data) {
		Node n = new Node(data);

		n.next = last.next; // 8.next = 10
		last.next = n; // 12.next = 8
	}

	void insertAfter(int a, int b){
		Node temp=last.next;

		while(temp.data!=b){
			temp=temp.next;
		}

		Node n=new Node(a);
		n.next=temp.next; // 7.next = 10.next
		temp.next=n;
		if (last == temp) {
			last = n;
		}
	}

	public static void main(String args[]) {
		CircularLinkedList list = new CircularLinkedList();

		Node n1 = new Node(10); // 10|null

		list.last = n1;
		n1.next = list.last;

		list.printList();
		System.out.println();

		list.insertAtEnd(12);
		list.insertAtBeginning(8);

		list.printList();

		list.insertAfter(7, 10); 
	}
}