package arrayandlist.array;

public class ArraySearchTraverse {
    public static void main(String[] args) {
        int[] arr = {27, 36, 45, 44, 21, 16, 82, 11};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 45) {
                System.out.println(i);
                break;
            }
        }
        // 2

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
