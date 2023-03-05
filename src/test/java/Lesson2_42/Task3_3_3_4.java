package Lesson2_42;

public class Task3_3_3_4 {
    public static void printRows(int n, int col) {
        int rows = n / col;
        int remainder = n % col;

        boolean isLeftToRight = true; // флаг направления печати

        for (int i = 1; i <= n; i++) {
            // проверяем флаг направления печати
            if (isLeftToRight) {
                System.out.print(i + " ");
            } else {
                System.out.print((rows * col + 1 - i) + " ");
            }

            // если достигнут конец строки, меняем направление печати и переходим на новую строку
            if (i % col == 0) {
                isLeftToRight = !isLeftToRight;
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
printRows(27,5);
    }
}
