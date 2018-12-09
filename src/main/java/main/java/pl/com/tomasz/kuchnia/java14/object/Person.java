package main.java.pl.com.tomasz.kuchnia.java14.object;


public class Person {
    public static int numberOfPersons = 0;
    private String name;
    private String surname;
    private int age;


    //        empty
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        numberOfPersons++;

    }

    public Person(String name) {
        this.name = name;
        numberOfPersons++;


    }

    public Person(){

    }

    public void introducePerson() {
        System.out.println("Hi ,I'm :" + name + " " + surname + " " + " I'm " + age);
    }

    public static void somethiingAboutPerson() {
        System.out.println("All people like match");
    }

    public static void newStatic() {
//        System.out.println();
    }

    public static void printNumberOfPerson() {
        System.out.println("Number of Persons:" + numberOfPersons);
    }

}


