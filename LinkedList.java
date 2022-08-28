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

	void deleteNodeAtPosition(int pos) { // 3
		Node temp = head;

		// delete first node
		if (pos == 0) {
			head = temp.next;
			return;
		}

		for (int i=0; i<pos-1 && temp != null; i++) {
			temp = temp.next;
		}

		temp.next = temp.next.next;

	}

	Node findMiddleNode() {
		Node slow_ptr = head;
		Node fast_ptr = head;

		while(fast_ptr != null && fast_ptr.next != null) { 
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
		}

		return slow_ptr;
	}

	void reverse() {
		Node prev = null;
		Node curr = head;
		Node next = null;

		// lines 92 and 95 are used to move the current node forward
		while (curr != null) {
			next = curr.next; // 5
			curr.next = prev; // this is used to update the ptr of curr node to prev node
			prev = current; // this is used to move the prev node forward
			current = next; // 5
		}
		head = prev;
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
		System.out.println();
		// list.search(6);
		list.deleteNodeAtPosition(3);
		list.printList();
		System.out.println();
		System.out.println("The data at middle node is: " + list.findMiddleNode().data);

		list.reverse();
	}
}

//head -> 8|10 -> 10|6 -> 6|5 -> 5|11 -> 11|null
		   

//8|null <- 10|8 <- 6|10 <- 5|6 <- 11|5 <- head



// Find middle of LL:
// - find size using while or for loop
// - calculate size/2
// - traverse till size/2 position and return that node



// head -> 10|next  -> 7|next -> 5|null 

// head -> 8|null -> 10|next  -> 7|next -> 5|next ->  11|null
									
// head -> 8|null -> 10|next -> -> 7|next -> 5|next ->  11|null -> 9|null

// slow_ptr = head  // 8
// fast_ptr = head // 8

// slow_ptr = slow_ptr.next; // 5
// fast_ptr = fast_ptr.next.next; // null

// when the fast ptr is pointing to last node or the fast_ptr is null, the slow_ptr gives us the middle node

// O(size/2)

// To delete node 6, we have to do following:
// 10.next (Node 6) = 6.next (Node 7)

// head = head.next (Node 10)
// temp.next = temp.next.next

// If I reach nOde 7, i can access node 5 by doing 7.next
// but If i am at node 5, can I access node 7 ?

// 7.next.next = 5.next  = 11





