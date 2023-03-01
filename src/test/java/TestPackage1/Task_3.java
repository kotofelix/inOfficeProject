package TestPackage1;

public class Task_3 {

    static int n;
    static int col;

    Task_3(int n, int col) {
        this.n = n;
        this.col = col;
    }

    void snakePrint(int n, int col) {
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

    void printRightOrder(int currentNumber, int numbersInRow) {
        for (int i = currentNumber; i < currentNumber + numbersInRow; i++) {
            if (i <= n && i <= currentNumber + numbersInRow) {
                System.out.print(i + " ");
            } else {
                System.out.println(" ");
            }
        }
    }

    void printReverseOrder(int currentNumber, int numbersInRow) {
        for (int i = currentNumber + numbersInRow - 1; i >= currentNumber; i--) {
            if (i <= n && i <= currentNumber + numbersInRow) {
                System.out.print(i + " ");
            } else {
                System.out.println(" ");
            }
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); //n - максимальное число
        int col = Integer.parseInt(args[1]); // col - количество цифр в одной строке
        Task_3 task_3 = new Task_3(n, col);
        task_3.snakePrint(n, col);
    }
}