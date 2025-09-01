package arrayandlist.list;

class CNode {
    int data;
    CNode prev, next;
    CNode(int data) {
        this.data = data;
    }
}

public class DoublyCircularLinkedList {
    CNode head; // 원형 연결 리스트에서는 헤드가 테일의 주소값도 가지고 있음.
    CNode current; // 현재 가리키는 요소를 저장하기 위한 변수

    public void insertAtHead(int data) {
        CNode newCNode = new CNode(data);
        if (head == null) {
            head = newCNode;
            head.next = head.prev = head;
            current = head;
        } else {
            CNode tail = head.prev;
            newCNode.next = head;
            newCNode.prev = tail;
            head.prev = tail.next = newCNode;
            head = newCNode;
        }
    }

    public void insertAtTail(int data) {
        CNode newCNode = new CNode(data);
        if (head == null) {
            head = newCNode;
            head.next = head.prev = head;
            current = head;
        } else {
            CNode tail = head.prev;
            newCNode.prev = tail;
            newCNode.next = head;
            tail.next = head.prev = newCNode;
        }
    }


    public void deleteFromHead() {
        if (head == null) return;
        if (head.next == head) {
            head = current = null;
            return;
        }
        CNode tail = head.prev;
        if (current == head) current = head.next;
        head = head.next;
        head.prev = tail;
        tail.next = head;
    }

    public void deleteFromTail() {
        if (head == null) return;
        if (head.next == head) {
            head = current = null;
            return;
        }
        CNode tail = head.prev;
        if (current == tail) current = head;
        CNode newTail = tail.prev;
        newTail.next = head;
        head.prev = newTail;
    }

    public void moveNext() {
        if (current != null)
            current = current.next;
    }

    public void movePrev() {
        if (current != null)
            current = current.prev;
    }

    public void printCurrent() {
        if (current != null)
            System.out.println("Current: " + current.data);
        else
            System.out.println("Current: null");
    }

    public void traverseForward() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        CNode temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }

    public void traverseBackward() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        CNode temp = head.prev;
        do {
            System.out.print(temp.data + " <- ");
            temp = temp.prev;
        } while (temp != head.prev);
        System.out.println("(tail)");
    }

    public static void main(String[] args) {
        DoublyCircularLinkedList dll
                = new DoublyCircularLinkedList();

        dll.insertAtTail(34);
        dll.insertAtTail(59);
        dll.insertAtTail(21);
        dll.insertAtTail(53);
        dll.insertAtTail(42);

        dll.insertAtHead(64);
        dll.deleteFromTail();

        dll.traverseForward();
        // 64 -> 34 -> 59 -> 21 -> 53 -> (head)

        dll.current = dll.head;
        dll.printCurrent(); // 64


        for (int i = 0; i < 8; i++) {
            dll.movePrev();
        }
        dll.printCurrent(); // 59
    }
}
