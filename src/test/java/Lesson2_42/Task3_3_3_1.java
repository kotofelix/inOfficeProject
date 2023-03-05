/*
сломаный

 */
package Lesson2_42;

public class Task3_3_3_1 {
    public static void printRows(int n, int col) {
        int rows = n / col;
        int remainder = n % col;

        // Печать рядов, с изменением направления печати на каждом четном ряду
        for (int i = 1; i <= rows * col; i++) {
            System.out.print(i + " ");
            if (i % col == 0) {
                System.out.println();
                if (i / col % 2 == 0) {
                    // Четный ряд, печать справа налево
                    int end = i;
                    int start = end - col + 1;
                    for (int j = end; j >= start; j--) {
                        System.out.print(j + " ");
                    }
                } else {
                    // Нечетный ряд, печать слева направо
                    int start = i + 1;
                    int end = start + col - 1;
                    for (int j = start; j <= end; j++) {
                        System.out.print(j + " ");
                    }
                }
                System.out.println();
            }
        }

        // Печать последнего ряда, если он не заполняется полностью
        if (remainder != 0) {
            int start = rows * col + 1;
            int end = start + remainder - 1;
            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }
            for (int i = 0; i < col - remainder; i++) {
                System.out.print("* ");
            }
            System.out.println();
        } else {
            // Если последний ряд заполняется полностью, то печатаем его пустым
            for (int i = 0; i < col; i++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        printRows(22, 5);
    }
}
