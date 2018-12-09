package main.java.pl.com.tomasz.kuchnia.java14.enum_exaple;

public class Main {

    public static void main(String[] args) {
        Seasons maybeSummer = Seasons.SUMMER;

        System.out.println(maybeSummer.name());
        maybeSummer =Seasons.WINTER;
        System.out.println(maybeSummer.name());

        System.out.println(maybeSummer.ordinal());

    }

//    for (Subject przedmiot : Subject.values)
}
