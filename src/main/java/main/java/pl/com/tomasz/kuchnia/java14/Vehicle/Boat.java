package main.java.pl.com.tomasz.kuchnia.java14.Vehicle;

public class Boat extends Vehicle {

    public void swim() {
        System.out.println("swim");
    }

    @Override
    public String toString() {
        return "Boat";
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("płyń łódko płyń");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("increaseSpeed() from Boat");
    }
}