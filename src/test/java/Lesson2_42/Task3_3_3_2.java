/*
1 2 3 4 5
11 12 13 14 15
10 9 8 7 6
20 19 18 17 16
21 22 * * *

 */

package Lesson2_42;

import java.util.ArrayList;
import java.util.Collections;

public class Task3_3_3_2 {
    public static void printRows(int n, int col) {
        int rows = n / col;
        int remainder = n % col;

        // печать нечетных строк
        for (int i = 1; i <= rows; i += 2) {
            for (int j = (i - 1) * col + 1; j <= i * col; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // печать четных строк
        for (int i = 2; i <= rows; i += 2) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int j = (i - 1) * col + 1; j <= i * col; j++) {
                row.add(j);
            }
            Collections.reverse(row);
            for (int j : row) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        if (remainder != 0) {
            // последний ряд заполняется не полностью
            ArrayList<Integer> lastRow = new ArrayList<Integer>();
            for (int i = rows * col + 1; i <= n; i++) {
                lastRow.add(i);
            }
            int diff = col - remainder;
            for (int i = 0; i < diff; i++) {
                lastRow.add(-1);
            }
            // печать последнего ряда
            for (int i = 0; i < col; i++) {
                if (lastRow.get(i) == -1) {
                    System.out.print("* ");
                } else {
                    System.out.print(lastRow.get(i) + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printRows(22,5);
    }
}
