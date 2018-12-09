package main.java.pl.com.tomasz.kuchnia.java14.anonymouse_classes.my_anonymous.runnable;

import javax.sound.midi.Soundbank;

// punkt 1zwykła klasa implementująca runnable

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("MyRunnable");
    }

}

public class Main {

    public static void main(String[] args) {

//
//        2 klasa anonimowa z zachowaniem referencji

        Runnable myRun = new Runnable() {
            @Override
            public void run() {
                System.out.println("my anonymus class");
            }
        };
        processRunnable(myRun);

//        3 klasa anonimowa przekazana jao parametr

        processRunnable(new Runnable() {
            @Override
            public void run() {
                System.out.println("something different");
            }
        });
//        4 lambda
        processRunnable(() -> {
            System.out.println("My lamba run");
        });
    }

    public static void processRunnable(Runnable runnable) {
        System.out.println();
        System.out.println("inside processRunnable()");
        runnable.run();
        System.out.println();

    }


}
