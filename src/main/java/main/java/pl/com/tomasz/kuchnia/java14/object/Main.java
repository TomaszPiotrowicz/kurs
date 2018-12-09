package main.java.pl.com.tomasz.kuchnia.java14.object;


public class Main {

    public static void main(String[] args) {

        Person Tomek = new Person("Tomek", "Piotrowicz", 69);
        Tomek.introducePerson();
        Person Dawid = new Person("Dawid", "Kowalski", 23);
        Dawid.introducePerson();
        Person Zosia =new Person("Zosia","Zych", 34);
                Zosia.introducePerson();

        Person.somethiingAboutPerson();
        Person me = new Person();
        me.introducePerson();
        Person fullMe = new Person("Tomasz", "Piotrowicz", 37);
        fullMe.introducePerson();


    }
}
