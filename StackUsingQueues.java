class QueueUsingArray {

	int front, rear, size;
	final int capacity = 4;
	int arr[] = new int[capacity];

	QueueUsingArray() {
		front = 0;
		rear = capacity - 1;
	}

	void enqueue(int x) { 
		if (size == capacity) {
			System.out.println("Queue is full");
			return;
		}

		rear = (rear + 1) % capacity;
		arr[rear] = x;
		size++;
		// System.out.println(x + " enqueued");
	}
 
	void dequeue() {
		if (size == 0) {
			System.out.println("Queue is empty");
			return;
		}

		int item = arr[front];
		front = (front + 1) % capacity;
		size--;

		// System.out.println(item + " dequeued");
	}

	int front() {
		if (size == 0) {
			System.out.println("Queue is empty");
			return -1;
		}

		return arr[front];
	}

	int rear() {
		if (size == 0) {
			System.out.println("Queue is empty");
			return -1;
		}

		return arr[rear];
	}

	int size() {
		return size;
	}

	boolean isEmpty() {
		return size == 0;
	}

	boolean isFull() {
		return size == capacity;
	}
}

public class StackUsingQueues {

	QueueUsingArray q1 = new QueueUsingArray();
	QueueUsingArray q2 = new QueueUsingArray();

	void push(int x) {
		q2.enqueue(x);

		// move all the elemets from q1 to q2
		while (q1.isEmpty() == false) {
			q2.enqueue(q1.front());
			q1.dequeue();
		}
		// After the loop, q1 is empty and q2 has all the elemets in LIFO structure

		// swap q1 and q2
		QueueUsingArray temp = q1;
		q1 = q2;
		q2 = temp;
	}

	void pop() {
		q1.dequeue();
	}

	public static void main(String args[]) {
		StackUsingQueues stack = new StackUsingQueues();

		stack.push(3);
		stack.push(4);

		stack.pop();

		System.out.println(stack.q1.arr[stack.q1.front]); // 3

	}
}