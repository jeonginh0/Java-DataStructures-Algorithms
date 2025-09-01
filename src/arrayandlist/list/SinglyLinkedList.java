package arrayandlist.list;

class Node {
    int data;
    DNode next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    DNode head;

    public void insertAtHead(int data) {
        DNode newDNode = new DNode(data);
        newDNode.next = head;
        head = newDNode;
    }

    public void insertAtPosition(int data, int position) {
        if (position == 0) {
            insertAtHead(data);
            return;
        }
        DNode newDNode = new DNode(data);
        DNode current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) return;
        newDNode.next = current.next;
        current.next = newDNode;
    }

    public void delete(int key) {
        DNode current = head, prev = null;
        while (current != null) {
            if (current.data == key) {
                if (prev != null) {
                    prev.next = current.next;
                } else {
                    head = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public boolean search(int key) {
        DNode current = head;
        while (current != null) {
            if (current.data == key) return true;
            current = current.next;
        }
        return false;
    }

    public void traverse() {
        DNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        SinglyLinkedList ll = new SinglyLinkedList();

        ll.insertAtHead(17);
        ll.insertAtHead(18);
        ll.insertAtHead(19);
        ll.insertAtHead(76);
        ll.insertAtHead(44);

        ll.insertAtPosition(34, 3);

        ll.delete(18);

        System.out.println(ll.search(19)); // true

        ll.traverse();
        // 44 -> 76 -> 19 -> 34 -> 17 -> null
    }
}
