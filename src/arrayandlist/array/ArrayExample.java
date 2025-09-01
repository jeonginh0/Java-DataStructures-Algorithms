package arrayandlist.array;

public class ArrayExample {
    public static void main(String[] args) {

        int[] arr = {27, 36, 45, 44, 21, 24, 82, 11};

        System.out.println(arr[3]);
        // 44

        arr[5] = 16;

        for (int value : arr) {
            System.out.print(value + " ");
        }
        // 27 36 45 44 21 16 82 11
    }
}
