package Exp;

public class Task_42_3_1 {
    public static void snakePrint(int n, int col) {
        if (n < 0 || col < 0) {
            System.out.println("Введите числа больше 0");
            return;
        }
        int lenStrBeforeRev = 0;
        String str = "";
        boolean revers = false;
        for (int i = 1; i <= n; i++) {
            if ((i - 1) % (col) == 0 && i != 1) {
                revers = !revers;
                System.out.println(str);
                lenStrBeforeRev = str.length();
                str = "";
            }
            str = (revers) ? i + " " + str : str + i + " ";
        }
        if (str.length() > 0) {
            if (revers)
                System.out.println(" ".repeat(lenStrBeforeRev - str.length()) + str);
            else
                System.out.println(str);
        }
    }

    public static void main(String[] args) {
        snakePrint(126, 4);
    }
}