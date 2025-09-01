package arrayandlist.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(27, 33, 36, 45, 44, 21, 82, 11)
        );

        list.add(2, 10);

        System.out.println(list);
        // Output: [27, 33, 10, 36, 45, 44, 21, 82, 11]
    }
}
