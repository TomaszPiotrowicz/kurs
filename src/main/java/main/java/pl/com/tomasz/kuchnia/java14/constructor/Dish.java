package main.java.pl.com.tomasz.kuchnia.java14.constructor;

public class Dish {
    private String kind;
    {
        System.out.println("Dish-firts in block");


    }
//overloading- jak jest ta sama nazwa -rozróżniamy je dodając wyróżnik np int itp...
    public Dish() {

        this ("pasta");

        System.out.println("Dish()");
    }
    public Dish(int  mm){


    }
// overloading to ponowne użycie tej samej nazswy z innym wyróznikiem
    public Dish(String kind) {
        System.out.println("Dish ()" + kind);
        this.kind = kind;

    }

    static {
        System.out.println("Dish - static class initialization");
    }

    {
        System.out.println("Dish - second in block");
    }

    {

    }


    static {
        System.out.println("Dish first initialization");
    }
}
