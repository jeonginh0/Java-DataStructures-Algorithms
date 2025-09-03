package stackandqueue.queue;

public class CircularQueue {
    private int[] queue; // 내부에서 요소를 담는 데 사용할 배열
    private int capacity; // 큐의 최대 크기
    private int front;
    private int rear;
    private int size;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear] = item;
        rear = (rear + 1) % capacity;
        size++;
    }

    public Integer dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        int item = queue[front];
        queue[front] = 0;
        front = (front + 1) % capacity;
        size--;

        return item;
    }

    public void display() {
        int index = front;
        for (int i = 0; i < size; i++) {
            System.out.print(queue[index] + " ");
            index = (index + 1) % capacity;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);

        cq.display(); // 10 20 30 40 50

        System.out.println(cq.dequeue()); // 10
        System.out.println(cq.dequeue()); // 20
        System.out.println(cq.dequeue()); // 30

        cq.enqueue(60);
        cq.enqueue(70);

        cq.display(); // 40 50 60 70

    }
}