package testG;

public class Test1 {

    public static void snakePrint(int n, int col) {
        int curr = 1;
        boolean isForward = true;
        for (int i = 0; i < (n + col - 1) / col; i++) {
            if (isForward) {
                for (int j = 0; j < col && curr <= n; j++) {
                    System.out.print(curr + " ");
                    curr++;
                }
                isForward = false;
            } else {
                for (int j = col - 1; j >= 0 && curr <= n; j--) {
                    System.out.print(curr + " ");
                    curr++;
                }
                isForward = true;
            }
            System.out.println();
        }
    }

        public static void main(String[] args) {
            snakePrint(20, 4);
    }
}
