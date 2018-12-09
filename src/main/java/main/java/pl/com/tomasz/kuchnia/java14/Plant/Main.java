package main.java.pl.com.tomasz.kuchnia.java14.Plant;

import main.java.pl.com.tomasz.kuchnia.java14.enum_exaple.DayofWeek;

public class Main {

    public static void main(String[] args) {

        Plant[] plants = makePlants();


        Gardener tomasz = new BetterGardener();
        for (DayofWeek weekDay :DayofWeek.values())
//        for (int day = 0; day < 7; day++)
        {
            System.out.println("Day of the week :"+ weekDay);
            for (Plant plant : plants) {
                tomasz.waterPlant(plant);
                tomasz.makePlantGrow(plant);
            }
//dzięki pętli for znajdującej się powyżej możemy skrócić kod
//            tomasz.waterPlant(cactus);
//            tomasz.waterPlant(cactus1);
//            tomasz.waterPlant(opuncja);
//            tomasz.waterPlant(opuncja1);
//            tomasz.waterPlant(rose);
//            tomasz.waterPlant(rose1);
//
//
//            tomasz.makePlantGrow(cactus);
//            tomasz.makePlantGrow(cactus1);
//            tomasz.makePlantGrow(opuncja);
//            tomasz.makePlantGrow(opuncja1);
//            tomasz.makePlantGrow(rose);
//            tomasz.makePlantGrow(rose1);

        }
        for (Plant plant : plants) {
            System.out.println(plant);
        }
//        Dzięki pętli for z tablicą plant możemy zlikwidować linijki poniżej
//        System.out.println(cactus);
//        System.out.println(cactus1);
//        System.out.println(opuncja);
//        System.out.println(opuncja1);
//        System.out.println(rose);
//        System.out.println(rose1);
    }

        public static Plant[] makePlants () {
            Plant[] result = new Plant[6];

            Plant cactus = new Cactus(3, 1, 0);
            result[0] = cactus;
            result[1] = new Cactus(2, 1, 2);

            result[2] = new Opuncja(6, 5, 0);
            result[3] = new Opuncja(7, 6, 1);

            result[4] = new Rose(11, 7, 0);
            result[5] = new Rose(12, 8, 2);
            return result;


        }

}



