package packTest32;


class Element {
    long id;
    String name = "default";


    Element(long value, String name) {
        id = value;
        name = name;
    }


    void copy(Element obj) {
        this.id   = id;
        this.name = name;
    }


    public String toString() {
        return name + ": " + id;
    }
}
class Main2332 {
    public static void main(String[] args) {
        Element elem1 = new Element(1, "First element");
        Element elem2 = new Element(2, elem1.toString());
        elem1.copy(elem2);
        System.out.println(elem1);
    }
}
