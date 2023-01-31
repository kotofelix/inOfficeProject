package lesson.cycles.parameter;

public class ForCycle {
    public static void main(String[] args) {
        whileCycle();
        System.out.println();
        forCycle();
        
        Object obj;

        int i = 0;
        for(obj = "hello"; i<10; i++){
            System.out.println("object");
        }
    }

    static void whileCycle() {
        int i = 4;
        while (i > 0) {
            System.out.println("'i' is " + i);
            i--;
        }
        System.out.println("Loop finished. 'i' is " + i);
    }

    static void forCycle() {
        for (int i = 4; i > 0; i--) {
            System.out.println("'i' is " + i); //если в теле цикла одна команда, то можно убрать фигурные скобки
        }
        System.out.println("Loop finished");
    }
}
