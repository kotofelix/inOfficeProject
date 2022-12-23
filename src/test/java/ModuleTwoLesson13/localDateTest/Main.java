package ModuleTwoLesson13.localDateTest;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws ParseException {



        LocalDate start = LocalDate.of(2017, 2, 1);
        LocalDate end = LocalDate.of(2017, 2, 28);

        Stream<LocalDate> dates = start.datesUntil(end.plusDays(1));
        List<LocalDate> list = dates.collect(Collectors.toList());
        System.out.println(list);


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
