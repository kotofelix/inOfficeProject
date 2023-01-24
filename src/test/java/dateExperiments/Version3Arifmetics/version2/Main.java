package dateExperiments.Version3Arifmetics.version2;

/*
1) Создайте объект даты вашего рождения
и выведите на экран 5ю различными форматами вывода.
Повторите, используя каждый класс для работы с датой:
Date, LocalDate, LocalDateTime, ZonedDateTime, GregorianCalendar



2) Для каждого класса из задания 1 создайте объект текущего времени
и сравните с датой вашего рождения соответствующего типа.
Выведите разницу на экран.



3) Посчитайте общее количество времени,
за которое выполняется программа из 1го задания
и выведите результат на экран.
Используйте класс по желанию.
Пример вывода:
Alltime - ms



4) Аналогично 3му заданию, время выполнения в миллисекундах
(создание объекта + вывод на экран),
но для каждого класса из первого задания по отдельности.
Пример вывода:
Date - ms
LocalDate - ms
LocalDateTime - ms
...
(для 5 классов из 1го задания)
 */

import java.time.*;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Date myDayOfBirthDate = new Date(88, 02, 24, 10, 30, 30); // дата рождения класса Date
        System.out.println();
        Date nowDate = new Date();
        System.out.println("Текущее время Date: " + nowDate);
        long raznicaMilliseconds = nowDate.getTime() - myDayOfBirthDate.getTime();
        int days = (int) (raznicaMilliseconds / (24 * 60 * 60 * 1000));
        System.out.println("Прожито дней с момента рождения (Date): " + days);

        System.out.println();

        LocalDate myDayOfBirthLocalDate = LocalDate.of(1988, 03, 24); // дата рождения класса LocalDate
        LocalDate localDateNow = LocalDate.now();
        System.out.println("Текущее время LocalDate: " + localDateNow);
        LocalDate currentMinusYearOfDob = localDateNow.minusYears(myDayOfBirthLocalDate.getYear());
        LocalDate currentMinusMonthOfDob = currentMinusYearOfDob.minusMonths(myDayOfBirthLocalDate.getMonthValue());
        LocalDate currentMinusDaysOfDob = currentMinusMonthOfDob.minusDays(myDayOfBirthLocalDate.getDayOfMonth());
        System.out.println("Прошло времени с момента рождения(лет-месяцев-дней(LocalDate)):  " + currentMinusDaysOfDob);
        System.out.println();

        LocalDateTime myDayOfBirthLocalDateTime = LocalDateTime.of(1988, 03, 24, 12, 30, 44, 2872); // дата рождения класса LocalDateTime
        LocalDateTime currentLocalDateTime = LocalDateTime.now();
        System.out.println("Текущее время LocalDateTime: " + currentLocalDateTime);
        LocalDateTime proshloVremeni = (currentLocalDateTime.minusYears(myDayOfBirthLocalDateTime.getYear())).minusDays(myDayOfBirthLocalDateTime.getDayOfYear());
        System.out.println("Прошло времени с момента рождения(лет-месяцев-дней(LocalDateTime)) :  " + proshloVremeni);
        System.out.println();

        ZonedDateTime myDayOfBirthZonedDateTime = ZonedDateTime.of(1988, 03, 24, 12, 3, 45, 50, ZoneId.of("UTC+4")); // дата рождения класса ZonedDateTime
        ZonedDateTime currentZonedDateTime = ZonedDateTime.now();
        System.out.println("Текущее время ZonedDateTime: " + currentZonedDateTime);
        LocalDateTime proshloVremeniZonedTime = (currentZonedDateTime.minusYears(myDayOfBirthZonedDateTime.getYear())).minusDays(myDayOfBirthZonedDateTime.getDayOfYear()).toLocalDateTime();
        System.out.println("Прошло времени с момента рождения(ZonedDateTime)) :  " + proshloVremeniZonedTime);
        System.out.println();

        GregorianCalendar myDayOfBirthGregorianCalendar = new GregorianCalendar(1988, 03, 24, 12, 20, 3); // дата рождения класса GregorianCalendar
        GregorianCalendar currentGregorianCalendar = (GregorianCalendar) GregorianCalendar.getInstance();
        Date dateGregor = currentGregorianCalendar.getTime();
        System.out.println("Текущее время в GregorianCalendar " + dateGregor);
        Period periodZ = Period.between(myDayOfBirthGregorianCalendar.toZonedDateTime().toLocalDate(), currentGregorianCalendar.toZonedDateTime().toLocalDate());
        int pYear = periodZ.getYears();
        int pMonth = periodZ.getMonths();
        int pdays = periodZ.getDays();
        System.out.println("Year " + pYear + " Month " + pMonth + " Day " + pdays);
    }
}
