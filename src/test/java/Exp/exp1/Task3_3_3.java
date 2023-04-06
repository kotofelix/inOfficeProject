/*
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
26 27 * * *

 */
package Exp.exp1;

public class Task3_3_3 {
    static void snakePrint(int n, int col) {
        if (n < 0 || col < 0) {
            System.out.println("Ошибка! Числа должны быть больше 0");
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
        snakePrint(26, 4);
    }
}
