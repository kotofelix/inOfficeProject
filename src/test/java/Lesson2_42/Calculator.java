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

public class Calculator {

         static int add(int x, int y) {
        return x + y;
    }

         static int sub(int x, int y) {
        return x - y;
    }

         static int mult(int x, int y) {
        return x * y;
    }

         static int divide(int x, int y){
        if (y == 0) {
            System.out.println("Ошибка: деление на 0.");
            System.exit(0);
        }
        return x / y;
    }


    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[2]);
        String action = args[1];

        int result = 0;
        switch (action) {
            case "+":
                result = Calculator.add(x, y);
                break;
            case "-":
                result = Calculator.sub(x, y);
                break;
            case "*":
                result = Calculator.mult(x, y);
                break;
            case "/":
                result = Calculator.divide(x, y);
                break;
            default:
                System.out.println("Ошибка: Неподдерживаемый оператор.");
                System.out.println("Поддерживаемые операторы: +, -, *, /.");
                System.exit(0);
        }
        System.out.println("Результат: " + result);

    }
}
