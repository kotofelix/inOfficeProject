package TestPackage1;

class Test9 {
    long id;
    String name = "default";


    Test9(long value, String name) {
        id = value;
        name = name;
    }


    void copy(Test9 obj) {
        this.id   = id;
        this.name = name;
    }


    public String toString() {
        return name + ": " + id;
    }
}


class Main {
    public static void main(String[] args) {
        Test9 elem1 = new Test9(1, "First element");
        Test9 elem2 = new Test9(2, elem1.toString());
        elem1.copy(elem2);
        System.out.println(elem1);
    }
}
