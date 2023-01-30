/*
Через аргументы командной строки передается число от 1 до 7.
Используя оператор switch, напишите программу, печатающую день недели, соответствующий эту числу (1 - понедельник, 2 - Вторник и тд).
Проверку на наличие аргументов делать не надо.
Надо проверить, что переданное число находится в указанном диапазоне.
В противном случае нужно вывести пользователю сообщение об ошибке, и завершить программу.
 */
package Lesson2_38;

public class example2 {
    public static void main(String[] args) {
        int day = Integer.parseInt(args[0]);

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number. Please enter a number between 1 and 7.");

        }
    }
}
