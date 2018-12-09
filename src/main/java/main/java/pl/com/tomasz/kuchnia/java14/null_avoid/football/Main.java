package main.java.pl.com.tomasz.kuchnia.java14.null_avoid.football;


import java.util.Optional;

//footballclub ->nie jest null. stadion -> chairs ->numbers
public class Main {
    public static void main(String[] args) {
        Chair chair = new Chair(2);
        Stadium withoutChair = new Stadium(null);
        Stadium withChair = new Stadium(chair);
        FootballClub withChairx = new FootballClub(withChair);
        FootballClub withoutChair12 = new FootballClub(null);



        Chair(withChairx);
    }

    public static void Chair(FootballClub footballClub) {

        Optional.ofNullable(footballClub)
                .map(footballClub1 -> footballClub1.getStadium())
                .map(stadium -> stadium.getChair())
                .map(chair -> chair.getNumber())
                .ifPresent(integer -> System.out.println("number: " + integer));





    }

}

