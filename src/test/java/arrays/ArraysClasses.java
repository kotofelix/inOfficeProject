package arrays;

public class ArraysClasses {
    public static void main(String[] args) {
        int[] intsArray = new int[10];
        boolean[] booleanArray = new boolean[3];
        String[] stringsArray = new String[5];
        long[][] longsMatrix = new  long[5][7];

        System.out.println("-- intsArray class --");
        System.out.println(intsArray.getClass().getName());

        System.out.println("-- booleanArray class --");
        System.out.println(booleanArray.getClass().getName());

        System.out.println("-- stringsArray class --");
        System.out.println(stringsArray.getClass().getName());

        System.out.println("-- longsMatrix class --");
        System.out.println(longsMatrix.getClass().getName());

    }
}
