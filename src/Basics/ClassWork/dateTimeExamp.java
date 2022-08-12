package Basics.ClassWork;

import java.time.*;

import static java.time.LocalDateTime.*;

public class dateTimeExamp {
    public static void main(String[] args) {

        //Local time
        LocalTime localTime = LocalTime.now().withNano(0);
        System.out.println("now is " + localTime);
        System.out.println("slashes " + localTime.getHour()+"/"+localTime.getMinute()+"/"+localTime.getSecond());
        System.out.printf("slashes and printf: "+"%d/%d/%d \n", localTime.getHour(),localTime.getMinute(),localTime.getSecond());

        //modify time
        LocalTime localTime1 = LocalTime.now().withNano(0).withSecond(0);
        System.out.println(localTime1);
        //increase by 15 minutes
        localTime1 = localTime1.plusMinutes(15);
        System.out.println("Break until: "+localTime1);

        //Local date
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println("Year is: "+localDate.getYear());
        System.out.println("Day of the week: "+localDate.getDayOfWeek());
        System.out.println("Day of the year: "+localDate.getDayOfYear());
        System.out.println("Year is: "+localDate.getEra());

        LocalDate localDate1 = LocalDate.of(2019, Month.DECEMBER,11);
        System.out.println("First COVID case was on: "+localDate1);

        //LocalDateTime
        LocalDateTime localDateTime = now();
        System.out.println("Local date and time is: "+localDateTime);

        LocalDateTime fisrTnternationalCatsDay = localDateTime.of(1997,11,20,19,19,19,00);
        System.out.println("International Cats'day was started on "+fisrTnternationalCatsDay);

        int currentMonth = fisrTnternationalCatsDay.getMonthValue();

        switch (currentMonth){
            case 11:
                System.out.println("Novembris");
                break;
            default:
                System.out.println("November");
                break;
        }
        //Duration
        System.out.println(Duration.ofHours(10).toMinutes());
        System.out.println(Duration.between(now(),localDateTime.now().plusDays(2)).toMinutes());
        System.out.println(Duration.between(fisrTnternationalCatsDay,localDateTime.now()).toMinutes());

        //Period
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(160)).getMonths());









    }
}
