package main.java.pl.com.tomasz.kuchnia.java14.access;

public class Main {
    public static void main(String[] args) {
        Person me = new Person("Tomasz ", "Piotroiwcz", 50);
        System.out.println(me);
        me.setAge(-50);
        System.out.println(me);
//        me.age = -50;
        System.out.println(me);
//        me.name;
        me.secret = "my secret";
        me.secondSecret = "second secret";

    }


}

