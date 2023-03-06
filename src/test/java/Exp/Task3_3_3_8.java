package Exp;

public class Task3_3_3_8 {
    public static void snakePrint(int n, int col) {
        int count = 1;
        int maxCount = n * col;
        for (int i = 0; i < col; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    if (count > maxCount) {
                        System.out.println("змейка заполнена");
                        return;
                    } else {
                        count++;
                    }
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    if (count > maxCount) {
                        System.out.println("змейка заполнена");
                        return;
                    } else {
                        count++;
                    }
                }
            }
        }
        int lastRowStart = n - (maxCount % n);
        for (int j = lastRowStart; j < n; j++) {
            System.out.print((maxCount - (n - j - 1)) + " ");
        }
    }
    public static void main(String[] args) {
       snakePrint(20, 5);
    }
}