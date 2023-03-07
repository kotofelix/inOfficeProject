package arrays;

public class JaggedArrays {

    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[5];
        jaggedArray[1] = new int[3];
        jaggedArray[2] = new int[7];

        int[][] jaggedArrays = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        int element = jaggedArrays[1][1];
        System.out.println(element);

    }
}
