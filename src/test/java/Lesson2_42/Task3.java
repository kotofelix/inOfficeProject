package Lesson2_42;

import java.util.ArrayList;

public class Task3 {
    public static void printRows(int n, int col) {
        int rows = n / col;
        int remainder = n % col;

        // печать рядов с чередованием нечетных и четных строк
        for (int r = 1; r <= rows; r++) {
            if (r % 2 == 1) {
                // печать нечетной строки слева направо
                for (int i = (r - 1) * col + 1; i <= r * col; i++) {
                    if (i == n && remainder != 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print(i + " ");
                    }
                }
            } else {
                // печать четной строки справа налево
                for (int i = r * col; i >= (r - 1) * col + 1; i--) {
                    if (i == n && remainder != 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print(i + " ");
                    }
                }
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
            if ((rows + 1) % 2 == 1) {
                // печать нечетного последнего ряда слева направо
                for (int i : lastRow) {
                    if (i == -1) {
                        System.out.print("* ");
                    } else {
                        System.out.print(i + " ");
                    }
                }
            } else {
                // печать четного последнего ряда справа налево
                for (int i = lastRow.size() - 1; i >= 0; i--) {
                    if (lastRow.get(i) == -1) {
                        System.out.print("* ");
                    } else {
                        System.out.print(lastRow.get(i) + " ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printRows(27, 5);
    }
}
