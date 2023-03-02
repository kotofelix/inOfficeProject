package Lesson2_52;

public class LongestWords2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No words provided.");
            return;
        }

        String longestWord = args[0];
        int maxLength = longestWord.length();

        for (int i = 1; i < args.length; i++) {
            String arg = args[i];
            if (!arg.matches("^[a-zA-Z0-9]+$")) {
                System.out.println("Invalid word: " + arg);
                return;
            }

            int length = arg.length();
            if (length > maxLength) {
                maxLength = length;
                longestWord = arg;
            } else if (length == maxLength) {
                longestWord += ", " + arg;
            }
        }

        if (longestWord.indexOf(',') == -1) {
            System.out.println("Longest word: " + longestWord);
        } else {
            System.out.println("Longest words: " + longestWord);
        }
    }
}
