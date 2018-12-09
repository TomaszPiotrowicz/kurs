package main.java.pl.com.tomasz.kuchnia.java14.equals_and_hashcode;

import java.util.*;

public class EqualityTest {


    public static void main(String[] args) {
            Person person []= new Person[4];

        List<Person>peoples = new ArrayList<>();
        peoples.add(new Person("mari", "pas" , 35));
        peoples.add(new Person("mari", "pas" , 35));
        peoples.add(new Person("aga", "now" , 38));
        peoples.add(new Person("adam", "pio" , 7));

        Person personToFind = new Person("mari", "pas", 35);

        System.out.println("contains: " + peoples.contains(personToFind));


        Set<Person>personSet = new HashSet<>();
        personSet.addAll(peoples);

        System.out.println("Set size:  " + personSet.size());

        for (Person pas : personSet){
            System.out.println("Person: " + pas);
        }
//         linkedhas set posiada kolejność  taka jaka została podana
//        hasset losowa kolejność
        Set<Person> anotherSet = new LinkedHashSet<>();

//        linkedlist to lista  dwukierunkowa
        List<Person>personList= new LinkedList<>();
     }

}
