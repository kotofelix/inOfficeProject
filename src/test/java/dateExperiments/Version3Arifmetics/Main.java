package dateExperiments.Version3Arifmetics;

import java.time.*;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        //    SimpleDateFormat dateFormatSimpleForDate = new SimpleDateFormat("dd.MM.yyyy");
        Date myDayOfBirthDate = new Date(88, 02, 24, 10, 30, 30); // дата рождения класса Date
        Date nowDate = new Date();
        System.out.println("Текущее время Date: " + nowDate);
        //  System.out.println();
        long raznicaMilliseconds = nowDate.getTime() - myDayOfBirthDate.getTime();
        int days = (int) (raznicaMilliseconds / (24 * 60 * 60 * 1000));
        System.out.println("Прожито дней с момента рождения (Date): " + days);

        System.out.println();
        //    int seconds = (int) (raznicaMilliseconds / (1000));
        //    int minutes = (int) (raznicaMilliseconds / (60 * 1000));
        //    int hours = (int) (raznicaMilliseconds / (60 * 60 * 1000));

        LocalDate myDayOfBirthLocalDate = LocalDate.of(1988, 03, 24); // дата рождения класса LocalDate
        LocalDate localDateNow = LocalDate.now();
        System.out.println("Текущее время LocalDate: " + localDateNow);
        LocalDate currentMinusYearOfDob = localDateNow.minusYears(myDayOfBirthLocalDate.getYear());
        LocalDate currentMinusMonthOfDob = currentMinusYearOfDob.minusMonths(myDayOfBirthLocalDate.getMonthValue());
        LocalDate currentMinusDaysOfDob = currentMinusMonthOfDob.minusDays(myDayOfBirthLocalDate.getDayOfMonth());
        //  LocalDate mezhdu = localDateNow.
        System.out.println("Прошло времени с момента рождения(лет-месяцев-дней(LocalDate)):  " + currentMinusDaysOfDob);
        System.out.println();

        LocalDateTime myDayOfBirthLocalDateTime = LocalDateTime.of(1988, 03, 24, 12, 30, 44, 2872); // дата рождения класса LocalDateTime
        LocalDateTime currentLocalDateTime = LocalDateTime.now();
        System.out.println("Текущее время LocalDateTime: " + currentLocalDateTime);
        //    LocalDateTime currentMinusYearOfDobLocalDateTime = currentLocalDateTime.minusYears(myDayOfBirthLocalDateTime.getYear());
        //    LocalDateTime currentMinusMonthOfDobLocalDateTime = currentMinusYearOfDobLocalDateTime.minusMonths(myDayOfBirthLocalDateTime.getMonthValue());
        //    LocalDateTime currentMinusDaysOfDobLocalDateTime = currentMinusMonthOfDobLocalDateTime.minusDays(myDayOfBirthLocalDateTime.getDayOfMonth());
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
                System.out.println("Разница во времени в GregorianCalendar между датой рождения и текущей: " + Duration.between(currentGregorianCalendar.toZonedDateTime(), myDayOfBirthGregorianCalendar.toZonedDateTime()));
        //     Calendar calendar = new GregorianCalendar();
        //    System.out.println("Текущее время GregorianCalendar: " + calendar.toString());
        //    System.out.println();

    }
}
