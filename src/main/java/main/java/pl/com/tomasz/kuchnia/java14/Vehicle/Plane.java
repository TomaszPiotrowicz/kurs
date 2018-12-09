package main.java.pl.com.tomasz.kuchnia.java14.Vehicle;

public class Plane extends Vehicle {
    public void fly() {
        System.out.println("Fly");


    }

    @Override
    public String toString() {
        return "Plane";
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Fly");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("increaseSpeed() from Plane");
    }
}