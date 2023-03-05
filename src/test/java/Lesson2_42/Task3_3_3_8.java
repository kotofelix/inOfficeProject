package Lesson2_42;

public class Task3_3_3_8 {
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
            int lastRowStart = rows * col + 1;
            int lastRowEnd = n;
            int diff = col - remainder;

            if ((rows + 1) % 2 == 1) {
                // печать нечетного последнего ряда слева направо
                for (int i = lastRowStart; i <= lastRowEnd; i++) {
                    if (i == n) {
                        System.out.print("* ");
                    } else {
                        System.out.print(i + " ");
                    }
                }
                for (int i = 0; i < diff; i++) {
                    System.out.print("* ");
                }
            } else {
                // печать четного последнего ряда справа налево

                for (int i = lastRowEnd; i >= lastRowStart; i--) {
                    if (i == n) {
                        System.out.print("* ");
                    } else {
                        System.out.print(i + " ");
                    }
                }
                for (int i = 0; i < diff; i++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printRows(27, 5);
    }
}