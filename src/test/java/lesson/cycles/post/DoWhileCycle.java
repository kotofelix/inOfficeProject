package lesson.cycles.post;

public class DoWhileCycle {
    public static void main(String[] args) {
        int i = 4;

        do {
            System.out.println(" 'i' is " + i);
        } while (i --> 7);
        System.out.println("Loop finished. 'i' is " + i);

        do                      //работает и без фигурных скобок
            System.out.println(" 'i' is " + i);
         while (i --> 7);
        System.out.println("Loop finished. 'i' is " + i);
    }
}
