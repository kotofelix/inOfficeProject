package Lesson2_48;

public class Task_4_3 {
    public static void main(String[] args) {
        String input = "abc123def456ghi789"; // example input string
        StringBuilder result = new StringBuilder(); // create a new StringBuilder object

        // iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) { // check if the character is a digit
                result.append(ch); // append the digit to the StringBuilder object
            }
        }

        System.out.println(result); // print the final result
    }
}
