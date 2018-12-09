package main.java.pl.com.tomasz.kuchnia.java14.exeption;

public class PersonTest {

    public static void main(String[] args) {

        Person me = null;

        try {
             me = new Person("Tom", "Pio", 5);
        } catch (WrongParametr wrongParametr) {
            wrongParametr.printStackTrace();
        }
        System.out.println(me);
        Person2 meAgain = new Person2( "null", "",-3);
    }


}
