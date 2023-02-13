package testG;

public class Test2 {
    public static void snakePrint(int n, int col) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (count % col == 0 && count != 0) {
                System.out.println();
                System.out.print(i + " ");
                count++;
            } else {
                System.out.print(i + " ");
                count++;
            }
        }
    }

    public static void main(String[] args) {
        snakePrint(45, 5);
    }
}
