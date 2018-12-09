package main.java.pl.com.tomasz.kuchnia.java14.constructor;

public class Main {

    public static void main(String[] args) {
        Dish myLuch;
        myLuch = new Dish();
        Dish secondlunch = new Dish();

        System.out.println();

        Pizza Pizza = new Pizza();

        Cutlet cutlet = Cutlet.giveMeNewNormalCutlet();
        Cutlet onionkind = Cutlet.cutletWhitOnion("onionkind");
    }

}
