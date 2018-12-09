package main.java.pl.com.tomasz.kuchnia.java14.equals_and_hashcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MyCollectionTest {

    public static void main(String[] args) {

        Random random = new Random(100);




        List<Integer> integersForSearch = new ArrayList<>();
        List<Integer> integersForAdding = new LinkedList<>();

        for (int i = 0; i <500; i++  ){
            integersForAdding.add (random.nextInt());
            integersForSearch.add ( random.nextInt());


        }

        for (int i = integersForSearch.size() -1; i>-1; i --){
            System.out.println("integersForAdding["+ i + "]:" + integersForAdding.get(i));
            System.out.println("integersForSearch[" + i + "]"+ integersForSearch.get(i));

        }



    }

}
