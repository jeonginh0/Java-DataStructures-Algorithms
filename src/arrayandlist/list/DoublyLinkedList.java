package arrayandlist.list;

class DNode {
    int data;
    DNode prev, next;
    DNode(int data) {
        this.data = data;
    }
}

public class DoublyLinkedList {
    DNode head, tail;

    public void insertAtHead(int data) {
        DNode newDNode = new DNode(data);
        if (head == null) {
            head = tail = newDNode;
        } else {
            newDNode.next = head;
            head.prev = newDNode;
            head = newDNode;
        }
    }

    public void insertAtTail(int data) {
        DNode newDNode = new DNode(data);
        if (tail == null) {
            head = tail = newDNode;
        } else {
            tail.next = newDNode;
            newDNode.prev = tail;
            tail = newDNode;
        }
    }

    public void deleteFromHead() {
        if (head == null) return; // 헤드가 없다는 것은 리스트가 비었다는 의미. 메서드 종료
        if (head == tail) {
            head = tail = null;
        } else { /* 요소가 둘 이상 있다면 헤드의 주소값을 두번째 요소의 주소값으로
        바꾼 다음 새로 헤드가 된 요소의 이전 요소 주소값을 지워주면 된다.*/
            head = head.next;
            head.prev = null; // 기존 헤드는 리스트에서 끊어짐.
        }
    }

    public void deleteFromTail() {
        if (tail == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.prev = null;
        }
    }

    public boolean searchFromHead(int key) {
        DNode current = head;
        while (current != null) {
            if (current.data == key) return true;
            current = current.next;
        }
        return false;
    }

    public boolean searchFromTail(int key) {
        DNode current = tail;
        while (current != null) {
            if (current.data == key) return true;
            current = current.prev;
        }
        return false;
    }

    public void traverseForward() {
        DNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void traverseBackward() {
        DNode current = tail;
        while (current != null) {
            System.out.print(current.data + " <- ");
            current = current.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtHead(10);
        dll.insertAtHead(20);
        dll.insertAtHead(30);
        dll.traverseForward();   // 30 -> 20 -> 10 -> null
        dll.traverseBackward();  // 10 <- 20 <- 30 <- null
        dll.deleteFromTail();
        dll.traverseForward();   // 20 -> 10 -> null
    }
}
