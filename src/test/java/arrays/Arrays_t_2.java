package arrays;

public class Arrays_t_2 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        method(a);
        a[3] = 1;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 1) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }

    static void method(int[] b) {
        for (int i = 0; i < b.length; i++) {
            b[i] = b.length - i;
        }
    }
}