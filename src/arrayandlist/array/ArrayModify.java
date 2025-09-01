package arrayandlist.array;

import java.util.Arrays;

public class ArrayModify {
    public static void main(String[] args) {
        Integer[] arr = {27, 36, 45, 44, 21, 16, 82, 11};

        for (int i = 5; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = null;

        System.out.println(Arrays.toString(arr));
        // [27, 36, 45, 44, 21, 82, 11, null]

        for (int i = arr.length - 1; i > 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[1] = 33;

        System.out.println(Arrays.toString(arr));
        // [27, 33, 36, 45, 44, 21, 82, 11]
    }
}
