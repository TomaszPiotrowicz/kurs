package main.java.pl.com.tomasz.kuchnia.java14.data_and_time.old_way;


import java.util.Calendar;
import java.util.Date;

public class OldDateTimeExample {

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("now:" + now);


        System.out.println(now.getTime());
        Date nowAgain = new Date(now.getTime());

        Date tomorrow = new Date(new Date().getTime()+(24*60*60*1000));

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println(calendar.getTime());

        calendar.setTime(new Date());
        calendar.add(Calendar.MONTH, -1);
        calendar.add(Calendar.YEAR,-1);

        System.out.println("date in pass:"+ calendar.getTime());
        System.out.println("calendar:" + calendar);
        System.out.println(calendar.getTime());



        }

    }


