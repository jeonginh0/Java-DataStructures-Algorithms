package arrayandlist.array;

import java.util.Arrays;

public class InsertIntoArray {
    public static void main(String[] args) {
        int[] original = {27, 33, 36, 45, 44, 21, 82, 11};
        int[] result = new int[original.length + 1];

        int insertIndex = 2;
        int insertValue = 10;

        for (int i = 0; i < insertIndex; i++) {
            result[i] = original[i];
        }

        result[insertIndex] = insertValue;

        for (int i = insertIndex; i < original.length; i++) {
            result[i + 1] = original[i];
        }

        System.out.println(Arrays.toString(result));
        // [27, 33, 10, 36, 45, 44, 21, 82, 11]
    }
}
