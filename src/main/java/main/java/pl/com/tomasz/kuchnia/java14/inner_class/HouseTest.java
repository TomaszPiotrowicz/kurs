package main.java.pl.com.tomasz.kuchnia.java14.inner_class;

public class HouseTest {


    public static void main(String[] args) {
        House myHouse = new House("Nowa rezydencja dla javy w JVC");

        House betterHouse1 = new House();
        betterHouse1.setHouseName("Java home");
        House.Apartment myNewApartment = betterHouse1.new Apartment(80);
        myNewApartment.printNameOfHouse();
        House.Apartment mySecondApartment = betterHouse1.new Apartment(45);
        mySecondApartment.printNameOfHouse();

        House betterHouse2 = new House();
        betterHouse2.setHouseName("c# home");
        House.Apartment friendApartment = betterHouse2.new Apartment(60);
        friendApartment.printNameOfHouse();


    }
}
