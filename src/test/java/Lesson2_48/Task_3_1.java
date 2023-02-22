package Lesson2_48;

public class Task_3_1 {
    public static void main(String[] args) {
        String sb = "01a10vt0101c";
        StringBuilder outputString = new StringBuilder();

        for (int i = 0; i < sb.length(); i++) {
            char currentChar = sb.charAt(i);

            if (currentChar == '0') {
                outputString.append('1');
            } else if (currentChar == '1') {
                outputString.append('0');
            } else {
                outputString.append(currentChar);
            }
        }

  //      System.out.println("Input string: " + sb);
        System.out.println(outputString);
    }
}
