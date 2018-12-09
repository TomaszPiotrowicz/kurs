package main.java.pl.com.tomasz.kuchnia.java14.constructor;

public class Pizza extends Dish {

    {
        System.out.println( "Pizza - instant block");

    }

    static {
        System.out.println("Pizza - static block");

    }
    public Pizza(){
        System.out.println("Pizza ()");
    }
    public Pizza(String additions){
        System.out.println("Pizza with additions..");
    }

}
