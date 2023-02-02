/*
Товар стоит a руб. b коп. За него заплатили c руб. d коп.

Напишите программу, расчитывающую сдачу.
Целые числа a, b, c, d передаются через аргументы командной строки.

Проверку на наличие аргументов делать не надо.
Нужно добавить проверку, что числа больше или равны нулю.
В противном случае нужно вывести пользователю сообщение об ошибке,
и завершить программу.
Так же нужно проверить, что уплаченной суммы хватает для оплаты товара.
В противном случае нужно вывести соответствующее сообщение и завершить программу.

Формат вывода:
Сдача составит e рублей и f копеек.
 */
package Lesson2_38;

public class Task5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]); // рубли (товар)
        int b = Integer.parseInt(args[1]); // копейки (товар)
        int c = Integer.parseInt(args[2]); // рубли (наличка)
        int d = Integer.parseInt(args[3]); // копейки (наличка)

        if (a >= 0 && b >= 0 && c >= 0 && d >= 0) {
            if (c > a || c == a && d >= b) {
                int z = (a * 100) + b; //стоимость товара переведена в копейки
                int y = (c * 100) + d; // наличка переведена в копейки
                System.out.println("Сдача составит: " + ((y - z) / 100) + " руб " + ((y - z) % 100) + " копеек");
            } else {
                System.out.println("Недостаточно средств");
            }
        } else {
            System.out.println("некорректное число");
        }
    }
}
