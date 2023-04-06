package Exp.exp1;

public class Task_2_48_6_1 {
    public static int toInt(String str) {
        if (str == null) {
            return 0;
        }

        int result = 0;
        int startIndex = 0;
        boolean negative = false;

        // Check if number is negative
        if (str.length() > 0 && str.charAt(0) == '-') {
            negative = true;
            startIndex = 1;
        }

        for (int i = startIndex; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return 0;
            }
            result = result * 10 + (c - '0');
        }

        return negative ? -result : result;
    }

    public static void main(String[] args) {
        System.out.println(toInt("1047483641"));
    }
}
