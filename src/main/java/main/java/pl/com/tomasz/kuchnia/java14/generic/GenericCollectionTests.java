package main.java.pl.com.tomasz.kuchnia.java14.generic;

import main.java.pl.com.tomasz.kuchnia.java14.Animal.Animal;
import main.java.pl.com.tomasz.kuchnia.java14.Animal.Cat;
import main.java.pl.com.tomasz.kuchnia.java14.Animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class GenericCollectionTests {

    //    metoda listy zwierząt
//    raz lista psów raz kotów
    public static void main(String[] args) {

        List<Dog> dogsList = new ArrayList<>();
        dogsList.add(new Dog());
        dogsList.add(new Dog());
        proccesAnimls(dogsList);
        addDog(dogsList);
        List<Cat> cats = new ArrayList<>();


    }
    public static void addDog (List<Dog>animals){
        animals.add(new Dog());
    }
    public static void processAnimls(Animal[] animals){

        for (Animal animal: animals){
            System.out.println(animal);
        }

    }

    public static void proccesAnimls(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }

    }


}
