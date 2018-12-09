package main.java.pl.com.tomasz.kuchnia.java14.Vehicle;

public class Car extends Vehicle {

    public void speedUp() {
        System.out.println("speed up");
    }

    @Override
    public String toString() {
        return "Car";
    }

    @Override
    public void move() {
//        super.move( );
        System.out.println("bruummmm");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("increaseSpeed() from Car");
    }
}
