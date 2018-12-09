package main.java.pl.com.tomasz.kuchnia.java14.Computer;

public class Pc extends Computer {

    @Override
    public void changedisk() {
        System.out.println("changedisk from Pc");
    }

    public void changekabel() {
        System.out.println("change from Computer");
    }

    public  void bla() {
        System.out.println("bla from Pc");
    }
}

