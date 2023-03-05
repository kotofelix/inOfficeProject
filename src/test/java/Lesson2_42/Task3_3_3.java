/*
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
26 27 * * *

 */
package Lesson2_42;

public class Task3_3_3 {
    public static void printRows(int n, int col) {
        int rows = n / col;
        int remainder = n % col;

        for (int i = 1; i <= rows * col; i++) {
            System.out.print(i + " ");
            if (i % col == 0) {
                System.out.println();
            }
        }

        if (remainder != 0) {
            // последний ряд заполняется не полностью
            for (int i = rows * col + 1; i <= n; i++) {
                System.out.print(i + " ");
            }
            for (int i = 0; i < col - remainder; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        printRows(27, 5);
    }
}
