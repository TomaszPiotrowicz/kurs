package main.java.pl.com.tomasz.kuchnia.java14.Computer;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {


        Computer computer = new Computer();
        Computer laptotop = new Laptop();
        Computer mianframe = new Mainframe();
        Computer pc = new Pc();
        changedisk(computer);
        changedisk(laptotop);
        changedisk(mianframe);
        changedisk(pc);

        changekabel(computer);
        changekabel(laptotop);
        changekabel(mianframe);
        changekabel(pc);



    }

    public static void changedisk(Computer computer) {

        computer.changedisk();
        computer.bla();

    }

    public static void changekabel(Computer computer) {

        computer.changekabel();
    }
}



