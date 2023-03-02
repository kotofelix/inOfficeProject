package Lesson2_42;

public class Task3_3_1 {
    public static void snakePrint(int n, int col) {
        int lastRow = n % col == 0 ? n / col - 1 : n / col;
        for (int i = 0; i < n; i++) {
            int row = i / col;
            int colIdx = i % col;
            int num;
            if (row % 2 == 0) {
                num = row * col + colIdx + 1;
            } else {
                colIdx = col - colIdx - 1;
                num = (row + 1) * col - colIdx;
                if (row == lastRow && colIdx >= col - 2) {
                    System.out.print("  ");
                    continue;
                }
            }
            System.out.print(num + " ");
            if (colIdx == col - 1) {
                System.out.println();
            }
        }
        if (n % col != 0) {
            for (int i = 0; i < col - n % col; i++) {
                System.out.print("  ");
            }
            System.out.print(n + 1);
        }
    }


    public static void main(String[] args) {
        snakePrint(27, 5);
    }

}