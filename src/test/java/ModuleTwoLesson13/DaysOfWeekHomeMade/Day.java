package ModuleTwoLesson13.DaysOfWeekHomeMade;

import java.time.LocalDate;

public class Day {

    static final LocalDate firstDayOf2Week = LocalDate.of(2022, 1, 3);  // это первый день нашей второй недели 2022 года
    LocalDate firstDayYourEntryWeek; // это получится первый день нашей вводимой недели
    String nameDaysOfWeek;
    int dayOfWeek;
    int dayOfMonth;
    int numDayOfYear;
//    LocalDate dayYourEntryWeek = firstDayOf2Week.plusWeeks(5);


    int numWeek;

    public Day(int numWeek) {
        this.numWeek = numWeek;
        LocalDate dayYourEntryWeek = firstDayOf2Week.plusWeeks(numWeek - 1);
        System.out.println(dayYourEntryWeek);
   }

 //     static void  () {
//
 //      return firstDayOf2Week.plusWeeks(numWeek);
//
 //   }

}





