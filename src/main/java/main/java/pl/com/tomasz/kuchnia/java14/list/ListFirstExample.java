package main.java.pl.com.tomasz.kuchnia.java14.list;

import main.java.pl.com.tomasz.kuchnia.java14.Plant.Cactus;
import main.java.pl.com.tomasz.kuchnia.java14.Plant.Plant;
import main.java.pl.com.tomasz.kuchnia.java14.Plant.Rose;

import java.util.ArrayList;
import java.util.List;

public class ListFirstExample {

    public static void main(String[] args) {
//        String []
        List<String> strings = new ArrayList<>();
        strings.add("enum");
        strings.add("abstract");

        List<Plant> plants = new ArrayList<>();
        plants.add(new Cactus(3,5,7));
        plants.add(new Cactus(3,5,7));
        plants.add(new Cactus(3,5,7));
        plants.set(1, new Rose(5 ,6,8 ));


//        for ( int i =0; i < strings.size(); i++){
//            System.out.println(strings.get(i));
//        }Pętla poniżej zastępuje petlę powyżej

        for (String s : strings){
            System.out.println(s);
        }

    }
}
