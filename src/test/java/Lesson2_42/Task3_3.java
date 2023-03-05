/*
1 2 3 4 5
10 9 8 7 6
11 12 13 14 15
20 19 18 17 16
21 22 23 24 25
27 26
Заворачивают но не в хвосте + массивы
 */
package Lesson2_42;

import java.util.Arrays;

public class Task3_3 {
    public static void snakePrint(int n, int col) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        for (int i = 0; i < n; i += col) {
            int[] row = Arrays.copyOfRange(nums, i, Math.min(i + col, n));
            if (i / col % 2 == 0) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
            } else {
                for (int j = row.length - 1; j >= 0; j--) {
                    System.out.print(row[j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
snakePrint(27, 5);
    }
}