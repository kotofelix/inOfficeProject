package arrays;

public class Arrays_t_1 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        String prefix = "";
        for (int i = 1; i <= a.length; i++) {
            if (i % 2 == 0)
                System.out.print(prefix + a[i]);
            prefix = " ";
        }
        System.out.println();
    }
}
