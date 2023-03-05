package Lesson2_42;

public class Task3_3_3_7 {
    public static void printRows(int n, int col) {
        int rows = n / col;
        int remainder = n % col;
        int rowStart = 1;
        boolean reverse = false;
        boolean isLastRowOdd = rows % 2 == 1 || remainder == 0 && rows % 2 == 0;

        // печать рядов с чередованием нечетных и четных строк
        for (int r = 1; r <= rows; r++) {
            if (reverse) {
                // печать четной строки справа налево
                for (int i = rowStart + col - 1; i >= rowStart; i--) {
                    System.out.print(i + " ");
                }
            } else {
                // печать нечетной строки слева направо
                for (int i = rowStart; i < rowStart + col; i++) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();

            // обновление переменных для следующего ряда
            rowStart += col;
            reverse = !reverse;
        }

        // печать последнего ряда
        if (remainder != 0) {
            if (reverse) {
                // печать четного последнего ряда слева направо
                for (int i = n; i >= n - remainder + 1; i--) {
                    System.out.print(i + " ");
                }
                for (int i = 0; i < col - remainder; i++) {
                    System.out.print("* ");
                }
            } else {
                // печать нечетного последнего ряда слева направо
                for (int i = rowStart; i < rowStart + remainder; i++) {
                    System.out.print(i + " ");
                }
                for (int i = 0; i < col - remainder; i++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        } else if (isLastRowOdd) {
            // печать пустой строки между последним нечетным и четным рядом
            for (int i = 0; i < col; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printRows(27,5);
    }
}
