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
package dateOfBirth;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Instant timeStart = Instant.now(); //начало работы программы

        Instant timeStartGregorianCalendar = Instant.now();
        GregorianCalendar myDayOfBirthGregorianCalendar = new GregorianCalendar(1988, 03, 24, 12, 20, 3); // дата рождения класса GregorianCalendar
        System.out.println("Вывод даты рождения в различных форматах для класса GregorianCalendar:");
        Instant timeEndGregorianCalendar = Instant.now();
        System.out.println("День: " + myDayOfBirthGregorianCalendar.get(GregorianCalendar.DATE) + " Месяц: " + myDayOfBirthGregorianCalendar.get(GregorianCalendar.MONTH) + " Год: " + myDayOfBirthGregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.println("Год: " + myDayOfBirthGregorianCalendar.get(GregorianCalendar.YEAR) + " Месяц: " + myDayOfBirthGregorianCalendar.get(GregorianCalendar.MONTH) + " День: " + myDayOfBirthGregorianCalendar.get(GregorianCalendar.DATE));
        System.out.println(myDayOfBirthGregorianCalendar.get(GregorianCalendar.DATE) + "/" + myDayOfBirthGregorianCalendar.get(GregorianCalendar.MONTH) + "/" + myDayOfBirthGregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.println(myDayOfBirthGregorianCalendar.get(GregorianCalendar.DATE) + "." + myDayOfBirthGregorianCalendar.get(GregorianCalendar.MONTH) + "." + myDayOfBirthGregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.println(myDayOfBirthGregorianCalendar.get(GregorianCalendar.DATE) + "-" + myDayOfBirthGregorianCalendar.get(GregorianCalendar.MONTH) + "-" + myDayOfBirthGregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.println("GregorianCalendar - " + Duration.between(timeStartGregorianCalendar, timeEndGregorianCalendar).toMillis() + " ms"); //вывод на экран времени работы программы для класса LocalDate
        System.out.println();

        Instant timeStartDate = Instant.now();
        Date myDayOfBirthDate = new Date(88, 02, 24, 10, 30, 30); // дата рождения класса Date
        System.out.println("Вывод даты рождения в различных форматах для класса Date:");
        System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(myDayOfBirthDate));
        System.out.println(new SimpleDateFormat("dd.MM.yy").format(myDayOfBirthDate));
        System.out.println(new SimpleDateFormat("MM_dd_yyyy").format(myDayOfBirthDate));
        System.out.println(new SimpleDateFormat("MM_yyyy").format(myDayOfBirthDate));
        System.out.println(new SimpleDateFormat("yyyy").format(myDayOfBirthDate));
        Instant timeEndDate = Instant.now();
        System.out.println("Date - " + Duration.between(timeStartDate, timeEndDate).toMillis() + " ms"); //вывод на экран времени работы программы для класса LocalDate
        System.out.println();

        Instant timeStartLocalDate = Instant.now();
        LocalDate myDayOfBirthLocalDate = LocalDate.of(1988, 03, 24); // дата рождения класса LocalDate
        System.out.println("Вывод даты рождения в различных форматах для класса LocalDate:");
        System.out.println("Full: " + DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(myDayOfBirthLocalDate));
        System.out.println("LONG: " + DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(myDayOfBirthLocalDate));
        System.out.println("SHORT: " + DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(myDayOfBirthLocalDate));
        System.out.println("MEDIUM: " + DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(myDayOfBirthLocalDate));
        System.out.println("CustomWithFormatterShort: " + DateTimeFormatter.ofPattern("dd-MM-yy").format(myDayOfBirthLocalDate));
        Instant timeEndLocalDate = Instant.now();
        System.out.println("LocalDate - " + Duration.between(timeStartLocalDate, timeEndLocalDate).toMillis() + " ms"); //вывод на экран времени работы программы для класса LocalDate
        System.out.println();

        Instant timeStartLocalDateTime = Instant.now();
        LocalDateTime myDayOfBirthLocalDateTime = LocalDateTime.of(1988, 03, 24, 12, 30, 44, 2872); // дата рождения класса LocalDateTime
        System.out.println("Вывод даты рождения в различных форматах для класса LocalDateTime:");
        System.out.println("Мой паттерн: " + DateTimeFormatter.ofPattern("MM-dd-yyyy").format(myDayOfBirthLocalDateTime));
        System.out.println("BASIC_ISO_DATE " + DateTimeFormatter.BASIC_ISO_DATE.format(myDayOfBirthLocalDateTime));
        System.out.println("ISO_DATE " + DateTimeFormatter.ISO_DATE.format(myDayOfBirthLocalDateTime));
        System.out.println("ISO_LOCAL_DATE_TIME " + DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(myDayOfBirthLocalDateTime));
        System.out.println("ISO_WEEK_DATE " + DateTimeFormatter.ISO_WEEK_DATE.format(myDayOfBirthLocalDateTime));
        Instant timeEndLocalDateTime = Instant.now();
        System.out.println("LocalDateTime - " + Duration.between(timeStartLocalDateTime, timeEndLocalDateTime).toMillis() + " ms"); //вывод на экран времени работы программы для класса LocalDateTime
        System.out.println();

        Instant timeStartZonedDateTime = Instant.now();
        ZonedDateTime myDayOfBirthZonedDateTime = ZonedDateTime.of(1988, 03, 24, 12, 3, 45, 50, ZoneId.of("UTC+4")); // дата рождения класса ZonedDateTime
        System.out.println("Вывод даты рождения в различных форматах для класса ZonedDateTime:");
        System.out.println("Мой паттерн: " + DateTimeFormatter.ofPattern("MM-dd-yyyy").format(myDayOfBirthZonedDateTime));
        System.out.println("ISO_ORDINAL_DATE: " + DateTimeFormatter.ISO_ORDINAL_DATE.format(myDayOfBirthZonedDateTime));
        System.out.println("ISO_ZONED_DATE_TIME: " + DateTimeFormatter.ISO_ZONED_DATE_TIME.format(myDayOfBirthZonedDateTime));
        System.out.println("FormatStyle.FULL: " + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(myDayOfBirthZonedDateTime));
        System.out.println("RFC_1123_DATE_TIME: " + DateTimeFormatter.RFC_1123_DATE_TIME.format(myDayOfBirthZonedDateTime));
        Instant timeEndZonedDateTime = Instant.now();
        System.out.println("ZonedDateTime - " + Duration.between(timeStartZonedDateTime, timeEndZonedDateTime).toMillis() + " ms"); //вывод на экран времени работы программы для класса LocalDateTime

        System.out.println();
        Date nowDate = new Date();
        System.out.println("Текущее время Date: " + nowDate);
        long raznicaMilliseconds = nowDate.getTime() - myDayOfBirthDate.getTime();
        int days = (int) (raznicaMilliseconds / (24 * 60 * 60 * 1000));
        System.out.println("Прожито дней с момента рождения (Date): " + days);

        System.out.println();

        LocalDate localDateNow = LocalDate.now();
        System.out.println("Текущее время LocalDate: " + localDateNow);
        LocalDate currentMinusYearOfDob = localDateNow.minusYears(myDayOfBirthLocalDate.getYear());
        LocalDate currentMinusMonthOfDob = currentMinusYearOfDob.minusMonths(myDayOfBirthLocalDate.getMonthValue());
        LocalDate currentMinusDaysOfDob = currentMinusMonthOfDob.minusDays(myDayOfBirthLocalDate.getDayOfMonth());
        System.out.println("Прошло времени с момента рождения(лет-месяцев-дней(LocalDate)):  " + currentMinusDaysOfDob);
        System.out.println();

        LocalDateTime currentLocalDateTime = LocalDateTime.now();
        System.out.println("Текущее время LocalDateTime: " + currentLocalDateTime);
        LocalDateTime proshloVremeni = (currentLocalDateTime.minusYears(myDayOfBirthLocalDateTime.getYear())).minusDays(myDayOfBirthLocalDateTime.getDayOfYear());
        System.out.println("Прошло времени с момента рождения(лет-месяцев-дней(LocalDateTime)) :  " + proshloVremeni);
        System.out.println();

        ZonedDateTime currentZonedDateTime = ZonedDateTime.now();
        System.out.println("Текущее время ZonedDateTime: " + currentZonedDateTime);
        LocalDateTime proshloVremeniZonedTime = (currentZonedDateTime.minusYears(myDayOfBirthZonedDateTime.getYear())).minusDays(myDayOfBirthZonedDateTime.getDayOfYear()).toLocalDateTime();
        System.out.println("Прошло времени с момента рождения(ZonedDateTime)) :  " + proshloVremeniZonedTime);
        System.out.println();

        GregorianCalendar currentGregorianCalendar = (GregorianCalendar) GregorianCalendar.getInstance();
        Date dateGregor = currentGregorianCalendar.getTime();
        System.out.println("Текущее время в GregorianCalendar " + dateGregor);
        System.out.println("Разница во времени в GregorianCalendar между датой рождения и текущей: " + Duration.between(currentGregorianCalendar.toZonedDateTime(), myDayOfBirthGregorianCalendar.toZonedDateTime()));

        System.out.println();
        Instant timeEnd = Instant.now(); //конец работы программы
        System.out.println("Alltime - " + Duration.between(timeStart, timeEnd).toMillis() + " ms"); //вывод на экран времени работы программы
    }
}
