class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next; // next hold the reference of next node in the list

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void printList() {
		Node n = head;
		while(n != null) {

			if (n.next == null) {
				System.out.print(n.data);
			}
			else {
				System.out.print(n.data + " -> "); // 10 -> 7 -> 5
			}

			n = n.next;
		}
	}

	void insertAtBeginning(int d) {
		Node n = new Node(d); // 8|null
		
		n.next = head;
		head = n;
	}

	void insertAtEnd(int d) {
		Node n = new Node(d);
		Node temp = head;

		// loop to reach to the last node
		while(temp.next != null) {
			temp = temp.next;
		}

		// temp is pointing to last node, its next should point to n
		temp.next = n;
	}

	void insertAfter(Node prev, int d) {
		Node n = new Node(d);
		n.next = prev.next;
		prev.next = n;

	}

	public static void main(String args[]) {
		LinkedList list = new LinkedList();

		Node n1 = new Node(10); // 10|null
		Node n2 = new Node(7); // 7|null
		Node n3 = new Node(5); // 5|null

		list.head = n1;
		n1.next = n2;
		n2.next = n3;

		// list.printList();
		list.insertAtBeginning(8);
		// list.printList();
		list.insertAtEnd(11);

		list.insertAfter(n1, 6);
		list.printList();
	}
}


// head -> 10|next  -> 7|next -> 5|null 

// head -> 8|null -> 10|next  -> 7|next -> 5|next ->  11|null

// head -> 8|null -> 10|next -> 6|next -> 7|next -> 5|next ->  11|null




