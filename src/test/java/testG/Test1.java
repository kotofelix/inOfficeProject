package testG;

public class Test1 {
    public static void snakePrint(int n, int col) {
        int count = 0;
        boolean reverse = false;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            count++;
            if (count == col) {
                System.out.println();
                count = 0;
                reverse = !reverse;
            }
            if (reverse && count == 0) {
                for (int j = i; j > i - col; j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        snakePrint(99, 5);
    }
}
