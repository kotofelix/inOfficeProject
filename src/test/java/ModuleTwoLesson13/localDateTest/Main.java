package ModuleTwoLesson13.localDateTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {

        List<Date> dates = new ArrayList<Date>();

        String str_date ="27/08/2010";
        String end_date ="02/09/2010";

        DateFormat formatter ;

        formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date  startDate = (Date)formatter.parse(str_date);
        Date  endDate = (Date)formatter.parse(end_date);
        long interval = 24*1000 * 60 * 60; // 1 hour in millis
        long endTime =endDate.getTime() ; // create your endtime here, possibly using Calendar or Date
        long curTime = startDate.getTime();
        while (curTime <= endTime) {
            dates.add(new Date(curTime));
            curTime += interval;
        }
        for(int i=0;i<dates.size();i++){
            Date lDate =(Date)dates.get(i);
            String ds = formatter.format(lDate);
            System.out.println(" Date is ..." + ds);
        }


        }

        //    System.out.println(firstDayOf2Week);

        //    System.out.println("вывод: " + firstDayOf2Week.plusWeeks(2));
        //    System.out.println(firstDayOf2Week.getDayOfWeek());


   //     class Week{
   //         LocalDate firstDayOf2Week = LocalDate.of(2022, 1, 3);
   //         void firstDayofYourEntryWeek(){
   //             return
//
   //         }
   //     }


        //   LocalDate date = LocalDate.now(); // получаем текущую дату
        //   int year = date.getYear();
        //   int month = date.getMonthValue();
        //   int dayOfMonth = date.getDayOfMonth();

      //  LocalDate dateNum1 = LocalDate.ofEpochDay(2022-01-03);
      //  Date date111 = new Date("2022-01-01");
      //  System.out.println("дата " + date111);

      //  System.out.println(dateNum1);


     //  LocalDate date2 = LocalDate.now();
     //  date2.plusWeeks(1);
     //  System.out.println("Плюсанули дату: " + date2.plusWeeks(1));

     //  DayOfWeek dayOfWeek = date.getDayOfWeek();
     //  System.out.println(date);
     //  System.out.println(dayOfWeek);
     //  System.out.printf("%d.%d.%d \n", dayOfMonth, month, year);
    }
