package main.java.pl.com.tomasz.kuchnia.java14.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.printName();

        Car ferrari = new Car();
        ferrari.speedUp();
        ferrari.printName();

        Vehicle car = (Vehicle)ferrari ;

        car.printName();
        Car carForSure = (Car) car;

        ((Car)car ).speedUp();

        Boat boat = (Boat) car;


    }
}
