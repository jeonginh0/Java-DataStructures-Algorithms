package arrayandlist.array;

public class Array2DExample {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12}
        };

        System.out.println(arr[1][2]);  // 7

        arr[1][2] = 99;
        System.out.println(arr[1][2]);  // 99

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[i][j] == 10) {
                    System.out.println("(" + i + ", " + j + ")");
                    // (2, 1)
                }
            }
        }

        for (int j = 0; j < 4; j++) {
            System.out.print(arr[1][j] + " ");
            // 5 6 99 8
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i][2] + " ");
            // 3 99 11
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
                // 1 2 3 4 5 6 99 8 9 10 11 12
            }
        }
    }
}
