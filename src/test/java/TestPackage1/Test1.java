package TestPackage1;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Hi");
        Test1 test1 = new Test1();
        test1.sendMessage();
        
    }
    public void sendMessage(){
        System.out.println("Привет от метода!");
    }

    public static class Timer3 {
        public static void waitSecond() {
            long start = System.currentTimeMillis();
            while (System.currentTimeMillis() - start < 1000) {
                // wait for 1 second
            }
        }
        public static void main(String[] args) throws InterruptedException {
            long time = 7;
            for (int i = (int) time; i >= 0; i--) {
                System.out.println("Осталось: " + ((i > 4)? i + " секунд": (i > 1)? i +
                        " секунды" : (i == 1)? i + " секунда" : "менее секунды"));
                waitSecond();
            }
            System.out.println("Время истекло!");
        }
    }
}

