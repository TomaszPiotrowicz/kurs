package main.java.pl.com.tomasz.kuchnia.java14.generic;

import main.java.pl.com.tomasz.kuchnia.java14.Animal.Cat;
import main.java.pl.com.tomasz.kuchnia.java14.Vehicle.Car;
import main.java.pl.com.tomasz.kuchnia.java14.Vehicle.Plane;
import main.java.pl.com.tomasz.kuchnia.java14.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class GenericVechicleTest {


    public static void main(String[] args) {

        List<Vehicle>vehicleList= new ArrayList<>();

        vehicleList.add( new Car());
        vehicleList.add( new Plane());

        List<Car>cars= new ArrayList<>();
        cars.add(new Car());

        List<Plane>planes = new ArrayList<>();
        planes.add(new Plane());

        takeListOfVehicle(vehicleList);




    }
    public static void takeListOfVehicle(List <? extends Vehicle> vehicles){
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }
    }


}
