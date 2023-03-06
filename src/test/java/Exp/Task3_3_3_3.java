/*
1 2 3 4 5
10 9 8 7 6
11 12 13 14 15
20 19 18 17 16
21 22 23 24 25
26 27 * * *

 */
package Exp;

public class Task3_3_3_3 {
    public static void printRows(int n, int col) {
        int rows = n / col;
        int remainder = n % col;

        // печать рядов с чередованием нечетных и четных строк
        for (int r = 1; r <= rows; r++) {
            if (r % 2 == 1) {
                // печать нечетной строки слева направо
                for (int i = (r - 1) * col + 1; i <= r * col; i++) {
                    System.out.print(i + " ");
                }
            } else {
                // печать четной строки справа налево
                for (int i = r * col; i >= (r - 1) * col + 1; i--) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        if (remainder != 0) {
            // последний ряд заполняется не полностью
            for (int i = rows * col + 1; i <= n; i++) {
                System.out.print(i + " ");
            }
            int diff = col - remainder;
            for (int i = 0; i < diff; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        printRows(27,5);
    }
}
