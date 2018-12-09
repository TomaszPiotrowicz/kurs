package main.java.pl.com.tomasz.kuchnia.java14.Vehicle;

public class Main2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle boat = new Boat();
        Vehicle car = new Car();
        Vehicle plane = new Plane();

        vehicle.move();
        car.move();
        boat.move();
        plane.move();

        vehicle.increaseSpeed();
        car.increaseSpeed();
        boat.increaseSpeed();
        plane.increaseSpeed();

        processVehicle(vehicle);
        processVehicle(car);
        processVehicle(boat);

        increaseSpeed(vehicle);
        increaseSpeed(car);
        increaseSpeed(boat);
        increaseSpeed(plane);


    }

    public static void processVehicle(Vehicle vehicle) {


        System.out.println("info about vehicle:" + vehicle);

    }

    public static void increaseSpeed(Vehicle vehicle) {
        System.out.println("from method increaseSpeed(Vehicle");
        vehicle.increaseSpeed();
        System.out.println();
    }

}
