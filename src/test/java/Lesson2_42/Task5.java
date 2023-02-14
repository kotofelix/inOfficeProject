/*
Реализуйте класс Calculator со статическими методами:
- int add(int x, int y) - выполнение x + y
- int sub(int x, int y) - выполнение x - y
- int mult(int x, int y) - выполнение x * y
- int divide(int x, int y) - выполнение x / y.
  Имеет проверку y == 0 или нет.
  Если равно, то пишется сообщение, что операция не может быть выполнена,
  и программа завершается, используя System.exit(0);

Используя класс Calculator, напишите программу, которая будет
получать через аргументы командной строки два целых числа,
знак операции и после этого выводить результат операции.
через аргументы командной строки.

Пример ввода аргументов:
 10 + 12
 10 - 12
 10 * 12
 10 / 0

Проверку на наличие аргументов делать не надо.
Для проверки знака операции используйте оператор switch.
Если введена неподдерживаемая операция,
то выводить список поддерживаемых операций и завершать программу.
 */
package Lesson2_42;

public class Task5 {
    static int add(int x, int y) {
        return x + y;
    }
    static int sub(int x, int y) {
        return x - y;
    }
    static int mult(int x, int y) {
        return x * y;
    }
    static int divide(int x, int y) {
        return x / y;
    }

    public static void calculator(int x, int y, String action) {
        switch (action){
            case "+":
            case "-":
            case "*":
            case "/":
                break;
            default:
                System.out.println("Неподдерживаемый оператор");
        }
        if (y == 0 && action.equals("/")) {
            System.out.println("error");
            System.exit(0);
        } else {
            if (action.equals("+")) {
                System.out.println("Результат сложения: " + add(x, y));
            } else if (action.equals("-")) {
                System.out.println("Результат вычитания: " + sub(x, y));
            } else if (action.equals("*")) {
                System.out.println("Результат умножения: " + mult(x, y));
            } else if (action.equals("/")) {
                System.out.println("Результат деления: " + divide(x, y));
            }
        }
    }

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[2]);
        String znak = args[1];

        calculator(x, y, znak);
    }
}
