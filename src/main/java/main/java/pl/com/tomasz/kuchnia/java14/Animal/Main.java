package main.java.pl.com.tomasz.kuchnia.java14.Animal;

public class Main {

    public static void main(String[] args) {
        Dog szarik = new Dog();
        szarik.wchichAnimal();
        szarik.makeSound();

        Animal maybeDog = new Dog();
        maybeDog.wchichAnimal();
//         maybeDog.makeSound();
        Animal maybeCat = new Cat();
        maybeCat.wchichAnimal();
        Animal maybeMonkey = new Monkey();
//        Object monkey = new Monkey();
        maybeMonkey.wchichAnimal();


    }
}
