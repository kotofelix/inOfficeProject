package TestPackage1.Constructors;

public class Test1 {
    int id;
    String name;

    Test1(String name){
        this(111, name);
        System.out.println("adsdas");
    }

    Test1(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Test1 a = new Test1("aahgds");
    }
}
