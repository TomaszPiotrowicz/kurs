package main.java.pl.com.tomasz.kuchnia.java14.anonymouse_classes.lambda;


public class Main {


    public static void main(String[] args) {

        Flyable bird = new Bird();


        Flyable plane = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Plane fly ");
            }
        };
        Flyable bullet = () -> System.out.println("bullet can fly with lambda");

        Moveable moveable = () -> System.out.println("movable");

        Swimable swimable = (distance, speed) -> {
            System.out.println("My distance is :" + distance);
            System.out.println("My speed is :" + distance);
        };
        swimable.swim(10, 25);

// zwykły int
        System.out.println("here:" + (9 / 5));


        FormulaConverter anonymousConverter = new FormulaConverter() {
            @Override
            public double fromCelsiusToFarenheit(double celsius) {
                return (celsius * 9.0 / 5.0) + 32;
            }
        };

        FormulaConverter converter = celsius -> (celsius * 9.0 / 5.0) + 32;
        System.out.println("podaj dane");

        MyLamda myLamda = new MyLamda() {
            @Override
            public String test(int n) {
                String result = "";
                for (; n > 0; n--) {
                    result = result + "SDA";
                }

                return result;
            }
        };
        FlyableCleaner cleaner = new FlyableCleaner();
        cleaner.clean(new Flyable() {
            @Override
            public void fly() {

            }
        });

        cleaner.clean(() -> {
        });
        SwimableCleaner anotherCleaner = new SwimableCleaner();
        anotherCleaner.cleanSwimable((distance, speed) -> {
//            String a = "test";
//            System.out.println(this.a);
        });
    }


}

