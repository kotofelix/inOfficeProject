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
}

