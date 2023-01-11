package date;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
 //       Date now = new Date();
        //    System.out.println(now);
        //    System.out.println();
//
        //    Date customDate = new Date(2022, 12, 22);
        //    System.out.println(customDate);
//
        //    System.out.println(customDate.before(now));

        //    Date date = new Date("Jan 01 12:00:00 2022");
        //    System.out.println(date.parse("Jan 01 12:00:00 2022"));
        //        System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(now));
        Calendar calendar = Calendar.getInstance();
   //     System.out.println(calendar);

   //     Calendar calendar = GregorianCalendar.getInstance();
   //     System.out.println(calendar);

   //     System.out.println(calendar.getTime());

   //     calendar.setLenient(true);
   //     calendar.isLenient();
   //     System.out.println(calendar.isLenient());

      //    MONTH = MARCH, DAY_OF_MONTH = 32;

        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        calendar.set(Calendar.MONTH, 02);
        calendar.add(Calendar.HOUR, 2);
        calendar.roll(Calendar.MINUTE, 12);






    }
}
