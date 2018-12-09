package main.java.pl.com.tomasz.kuchnia.java14.anonymouse_classes.my_anonymous.runnable;

public class FabricExample {

    String name= "blblblbla";

    public static void main(String[] args) {
        MyRunn one = new MyRunn();
        one.run();
        MyRunn two = new MyRunn();
        two.run();
        makeNewRunnable();
        makeNewRunnable();


    }

    public static Runnable makeNewRunnable() {
        return new Runnable() {
            private String name = "Tomasz";

            @Override
            public void run() {
                String name = "Piotr";
                System.out.println("my name: " + this.name);
            }
        };

    }

    public static  Runnable makeRunnableWitchLamda() {
        return () -> {
            String name ="tomasz";
            System.out.println("my name: " + name);
        };
    }
}

class MyRunn implements Runnable {
    private String name = "Tomasz1";

    @Override
    public void run() {
        System.out.println("My name: " + this.name);
    }
}