package arrays;

public class Arrays_t_6 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int[] b = a.clone();
        a[3] = 1;
        String prefix = "";
        for (int i = 0; i < b.length; i++) {
            if (i % 2 == 1) {
                System.out.print(prefix + b[i]);
                prefix = " ";
            }
        }
        System.out.println();
    }
}
