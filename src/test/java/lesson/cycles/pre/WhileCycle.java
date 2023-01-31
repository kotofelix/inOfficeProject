package lesson.cycles.pre;

public class WhileCycle {
    public static void main(String[] args) {
        int i = 4;
        while (i > 0) {
            i--;
            System.out.println(" `i` is " + i);
        }
        System.out.println("Value of 'i' after the loop is 'i' is " + i);

        int z = 4;
        while (z-- > 0)

            System.out.println(" `z` is " + z);

        System.out.println("Value of 'z' after the loop is 'z' is " + z);
    }
}
