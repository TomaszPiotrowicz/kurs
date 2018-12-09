package main.java.pl.com.tomasz.kuchnia.java14.list.map;

import main.java.pl.com.tomasz.kuchnia.java14.equals_and_hashcode.Person;

import java.util.*;

public class FindinigPersonExample {

    public static void main(String[] args) {

        Map<String, Person> idsPersons = new HashMap<>();

        idsPersons.put("83", new Person("Tomek", "Piot", 33));
        idsPersons.put("82", new Person("Ewa", "Borys", 28));
        idsPersons.put("81", new Person("adam", "Pio", 88));
        idsPersons.put("80", new Person("Paweł", "Bo", 22));
        idsPersons.put("75", new Person("Zoja", "Ax", 18));
        idsPersons.put("89", new Person("Aga", "Ty", 48));
        idsPersons.put("90", new Person("Lukas", "Rty", 25));
        idsPersons.put("91", new Person("Bolo", "Young", 55));
        idsPersons.put("88", new Person("Zibi", "One", 77));
        idsPersons.put("65", new Person("Jack", "Bu", 23));

        List<Person> youngPersons = new LinkedList<>();

        Person currentPerson;

        for (String id : idsPersons.keySet()) {
            currentPerson = idsPersons.get(id);

            if (currentPerson.getAge() < 25) {
                youngPersons.add(currentPerson);

                }

            }
        for (Person p : youngPersons) {
            System.out.println("Young person: " + p);

        }
    }
}

