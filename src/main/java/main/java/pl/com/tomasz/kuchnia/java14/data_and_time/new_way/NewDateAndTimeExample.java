package main.java.pl.com.tomasz.kuchnia.java14.data_and_time.new_way;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class NewDateAndTimeExample {


    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1= LocalTime.of(18,05);
        LocalTime fiveMinutesEarlier = localTime1.minusMinutes(5);

        System.out.println("fiveMinutesEarlier:" + fiveMinutesEarlier);

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate:" + localDate);

        LocalDate grunwald = LocalDate.of(1400,8,15);
        System.out.println(grunwald.getMonth());

//      Formatowanie daty !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate,localTime);

        localDate.format(DateTimeFormatter.ofPattern("YY,MM,dd"));
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("YY,MM,dd")));

        localDate.format(DateTimeFormatter.ofPattern("YY_MM_dd"));
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("YY_MM_dd")));

        localDate.format(DateTimeFormatter.ofPattern("YY:MM:dd"));
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("YY:MM:dd")));
//        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        Date maybeNow = new Date();

        long time =maybeNow.getTime();
       Instant instant = Instant.ofEpochMilli(time);
       LocalDateTime maybeNowNewWay = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        System.out.println(maybeNowNewWay);
    }

}
