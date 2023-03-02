package TestPackage1;

class Second {
    int x;
    int value;

    Second(int arg1, int arg2) {
        this.x = arg1;
        this.value = arg2;
    }
}

class First {
    int x;
    long y;

    void copy(Second obj) {
        int x  = obj.x;
        y  = obj.value;
    }

    public String toString() {
        return x + " " + y;
    }
}

class Main2 {
    public static void main(String[] args) {
        Second s = new Second(1, 2);
        First f = new First();
        f.copy(s);
        System.out.println(f);
    }
}
