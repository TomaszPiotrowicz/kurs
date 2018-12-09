package main.java.pl.com.tomasz.kuchnia.java14.Vehicle;

public class Vehicle {

    public void increaseSpeed() {
        System.out.println("increaseSpeed() from Vehicle");

    }

    @Override
    public String toString() {
        return "Vehicle";
    }

    public void printName() {
        System.out.println("vehicle");


    }

    public void move() {
        System.out.println(" Move");

    }
}
