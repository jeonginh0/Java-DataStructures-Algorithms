package arrayandlist.array;


import java.util.Arrays;

class DynamicArray {
    private int[] data = new int[8];
    private int size = 0;

    public void add(int value) {
        ensureCapacity();
        data[size++] = value;
    }
    public void insert(int index, int value) {
        ensureCapacity();
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        size++;
    }
    private void ensureCapacity() {
        if (size >= data.length) {
            int[] newData = new int[data.length * 2];
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(data, size));
    }
}

public class InsertExample {
    public static void main(String[] args) {

        DynamicArray arr = new DynamicArray();
        int[] initial = {27, 33, 36, 45, 44, 21, 82, 11};
        for (int num : initial) arr.add(num);

        arr.insert(2, 10);

        System.out.println(arr);
        // [27, 33, 10, 36, 45, 44, 21, 82, 11]
    }
}
