package Lesson2_48;

public class Task_5 {

    public static boolean isInteger(String str) {

        if (str == null || str.length() == 0) {
            return false;
        }


        for (char c : str.toCharArray()) {

            if (!Character.isDigit(c)) {
                return false;
            }
        }


        return true;
    }
    public static void main(String[] args) {

   //     System.out.println(isInteger("213123131"));
        String str = "213123131.5";
        boolean isInt = isInteger(str);
        System.out.println(str + " " + isInt);
    }

    }

