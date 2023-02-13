package testG;

public class Test2Pavlin {

    static void printRightOrder(int n, int col) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            count++;
            if (count == col) {
                System.out.println();
                count = 0;
            }
        }
    }

    static void printReverseOrder(int n, int col) {
        for (int j = n; j > n - col; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void snakePrint( int n, int col){
        if (n > 1 && col > 0) {
            for (int currentNumber = 1, currentRow = 1; currentNumber <= n; currentNumber += col, currentRow++) {
                if (currentRow % 2 == 1) {
                    printRightOrder(currentNumber, col);
                } else {
                    printReverseOrder(currentNumber, col);
                }
                System.out.println();
            }
        } else {
            System.out.println("ERROR");
        }
    }

    public static void main(String[] args) {
        int n = 55; //n - максимальное число
        int col = 5; // col - количество цифр в одной строке

         snakePrint(n, col);

    }
}
