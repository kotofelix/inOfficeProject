package Lesson2_48;

public class Task_6 {
    public static int toInt(String str) throws NumberFormatException {
        if (str == null || str.isEmpty()) {
            throw new NumberFormatException("Input string is null or empty");
        }

        int sign = 1;
        int startIndex = 0;
        if (str.charAt(0) == '-') {
            sign = -1;
            startIndex = 1;
        } else if (str.charAt(0) == '+') {
            startIndex = 1;
        }

        int result = 0;
        for (int i = startIndex; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                throw new NumberFormatException("Input string is not a valid integer");
            }
            int digit = c - '0';
            result = result * 10 + digit;
        }

        return sign * result;
    }
    public static void main(String[] args) {
        System.out.println(toInt("2147483649"));
    }
}
