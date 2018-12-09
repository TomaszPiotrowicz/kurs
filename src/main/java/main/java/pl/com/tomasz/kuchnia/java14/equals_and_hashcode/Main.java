package main.java.pl.com.tomasz.kuchnia.java14.equals_and_hashcode;

public class Main {

    public static void main(String[] args) {
        Person me = new Person("tomasz ", "piotroiwcz", 37);
        Person biały = me;
        System.out.println("me.eguals(biały): "+ me.equals(biały));

        System.out.println("me==biały? :"+ ( me == biały));

        biały = new Person("tomasz", "piotrowicz", 17);
        System.out.println("and now , me == biały?" + (me==biały));

        System.out.println("me.eguals(biały): "+ me.equals(biały));
    }
}
