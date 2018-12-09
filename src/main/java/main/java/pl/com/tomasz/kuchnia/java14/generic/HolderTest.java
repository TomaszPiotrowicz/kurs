package main.java.pl.com.tomasz.kuchnia.java14.generic;

import main.java.pl.com.tomasz.kuchnia.java14.Animal.Cat;
import main.java.pl.com.tomasz.kuchnia.java14.Animal.Dog;
import main.java.pl.com.tomasz.kuchnia.java14.equals_and_hashcode.Person;
import org.omg.CORBA.ObjectHolder;

public class HolderTest {
    public static void main(String[] args) {


        GenericHolder<String> stringHolder = new GenericHolder<>();
        stringHolder.setSecret("sekret");
        System.out.println(stringHolder.getSecret());

        GenericHolder<Person> personHoldeer = new GenericHolder<>();
        personHoldeer.setSecret(new Person("a", "b", 12));
        System.out.println(personHoldeer.getSecret());

        Home<Dog> dogHome;
        Home<Cat> catHome;
    }

}
