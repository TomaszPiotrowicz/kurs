package main.java.pl.com.tomasz.kuchnia.java14.inner_class;


import static main.java.pl.com.tomasz.kuchnia.java14.inner_class.Vehicle.Wheel;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("bicycle",new Wheel(17));
        Vehicle.Wheel wheel = new Vehicle.Wheel(17);
        Wheel wheel2 = new Wheel(17);
        

    }


}
