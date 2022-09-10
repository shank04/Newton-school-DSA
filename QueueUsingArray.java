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
		System.out.println(x + " enqueued");
	}
 
	void dequeue() {
		if (size == 0) {
			System.out.println("Queue is empty");
			return;
		}

		int item = arr[front];
		front = (front + 1) % capacity;
		size--;

		System.out.println(item + " dequeued");
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

	public static void main(String args[]) {
		QueueUsingArray queue = new QueueUsingArray();

		queue.enqueue(10); // arr[0] = 
		queue.enqueue(12); // arr[1] = 12
		queue.enqueue(15); // arr[2] = 15
		queue.enqueue(17); // arr[3] = 17

		queue.dequeue(); // front = 1, rear = 3

		queue.enqueue(20); // arr[0] = 20

		queue.front()

	}
}