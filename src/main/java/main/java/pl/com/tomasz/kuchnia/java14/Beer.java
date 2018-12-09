package main.java.pl.com.tomasz.kuchnia.java14;

public class Beer {

    public static void main(String[] args) {
        int ilośćbutelek = 99;
        String slowo = "botless";
        while (ilośćbutelek > 0) {
            if (ilośćbutelek == 1) {
                slowo = "botlle";
            }
            System.out.println(ilośćbutelek + slowo + " of beer on the wall");

            System.out.println(ilośćbutelek + slowo + " of beer ");

            System.out.println("take one down");

            System.out.println("Pass it around");

            ilośćbutelek = ilośćbutelek - 1;
            if (ilośćbutelek > 0) {
//                System.out.println(ilośćbutelek + slowo + " of beer on the wall ");

            } else {
                System.out.println("No more bottles of beer on the wall");
            }


        }
    }
}
