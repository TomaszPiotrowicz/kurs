package main.java.pl.com.tomasz.kuchnia.java14.inner_class;

import java.util.ArrayList;
import java.util.List;

public class House {
    List<Apartment> apartments;
    private String houseName;

    public House(String houseName) {
        this.houseName = houseName;

        apartments = new ArrayList<>();
        for (int i = 0; i < 100; i++) {

            apartments.add(new Apartment(30));
        }
    }

    public House() {
        apartments = new ArrayList<>();


    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);


    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public class Apartment {
        int sizeInSquareM;

        public Apartment(int sizeInSquareM) {
            this.sizeInSquareM = sizeInSquareM;

        }

        public void printNameOfHouse() {
            System.out.println("House name: " + House.this.houseName);
        }


    }
}





