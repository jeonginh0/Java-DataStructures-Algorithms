package stackandqueue.stack;

public class ArrayStack {
    private int[] stack;
    private int capacity;
    private int top;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public void push(int item) {
        if (top + 1 == capacity) {
            throw new RuntimeException("Stack is full");
        }
        stack[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(5);

        stack.push(5);
        stack.push(2);
        stack.push(8);
        stack.push(7);
        stack.push(4);

        System.out.println(stack.pop()); // 4
        System.out.println(stack.pop()); // 7

        System.out.println(stack.peek()); // 8

        System.out.println(stack.size()); // 3
        System.out.println(stack.isEmpty()); // false
    }
}