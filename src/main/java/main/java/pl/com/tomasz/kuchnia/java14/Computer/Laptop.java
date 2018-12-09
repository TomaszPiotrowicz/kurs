package main.java.pl.com.tomasz.kuchnia.java14.Computer;

public class Laptop extends Computer {

    @Override
    public void changedisk() {

        System.out.println("changedisk from Laptop");

    }

    public void changekabel() {
        System.out.println("change from Laptop");

    }

    public  void bla() {
        System.out.println("bla from Laptop");
    }
}