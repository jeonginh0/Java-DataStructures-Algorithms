package stackandqueue.queue;

class Node {
    int data;
    DNode next;
    Node(int data) {
        this.data = data;
    }
}

public class LinkedListQueue {

    private DNode front;
    private DNode rear;

    public boolean isEmpty() { return front == null; }

    public void enqueue(int item) {
        DNode newDNode = new DNode(item);
        if (rear == null) {
            front = rear = newDNode;
            return;
        }
        rear.next = newDNode;
        rear = newDNode;
    }

    public Integer dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        }
        int item = front.data;
        front = front.next;
        if (front == null) rear = null;
        return item;
    }

    public void display() {
        DNode current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedListQueue q = new LinkedListQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display(); // 10 20 30

        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20

        q.enqueue(40);
        q.enqueue(50);

        q.display(); // 30 40 50
    }
}