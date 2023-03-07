package CheckCycleFor;

public class T1  {
    public static void main(String[] args) {
        int[][] arrayOfInts = {
                { 32, 87, 3, 589 },
                { 12, 1076, 2000, 12 },
                { 622, 127, 12, 955 }
        };
        int searchfor = 12;

        int i = 2, j = 0;
        boolean foundIt = false;

        SEARCH:
        for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    break SEARCH;
                }
            }
        }
        System.out.println(i + j);
    }
}
