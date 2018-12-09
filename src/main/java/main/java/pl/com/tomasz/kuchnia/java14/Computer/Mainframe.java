package main.java.pl.com.tomasz.kuchnia.java14.Computer;

public class Mainframe extends Computer {
    @Override
    public void changedisk() {
        System.out.println("changedisk from Mainframe");

    }

    public void changekabel() {
        System.out.println("change from Mainframe");
    }

    public  void bla() {
        System.out.println("bla from Mainframe");
    }
}
