package stackandqueue.queue;

class DNode {
    int data;
    DNode prev, next;
    DNode(int data) { this.data = data; }
}

public class LinkedListDeque {

    private DNode front, rear;

    public void pushFront(int item) {
        DNode newDNode = new DNode(item);
        if (front == null) {
            front = rear = newDNode;
        } else {
            newDNode.next = front;
            front.prev = newDNode;
            front = newDNode;
        }
    }
    public void pushBack(int item) {
        DNode newDNode = new DNode(item);
        if (rear == null) {
            front = rear = newDNode;
        } else {
            newDNode.prev = rear;
            rear.next = newDNode;
            rear = newDNode;
        }
    }

    public Integer popFront() {
        if (front == null) {
            System.out.println("Deque is empty");
            return null;
        }
        int item = front.data;
        front = front.next;
        if (front == null) rear = null;
        else front.prev = null;
        return item;
    }
    public Integer popBack() {
        if (rear == null) {
            System.out.println("Deque is empty");
            return null;
        }
        int item = rear.data;
        rear = rear.prev;
        if (rear == null) front = null;
        else rear.next = null;
        return item;
    }

    public Integer peekFront() {
        return (front != null) ? front.data : null;
    }

    public Integer peekBack() {
        return (rear != null) ? rear.data : null;
    }

    public static void main(String[] args) {

        LinkedListDeque dq = new LinkedListDeque();

        dq.pushFront(10);
        dq.pushBack(20);
        dq.pushFront(5);

        System.out.println(dq.peekFront()); // 5
        System.out.println(dq.peekBack());  // 20

        System.out.println(dq.popBack());   // 20
        System.out.println(dq.popFront());  // 5
        System.out.println(dq.popFront());  // 10
        System.out.println(dq.popFront());
        // Deque is empty
        // null
    }
}
