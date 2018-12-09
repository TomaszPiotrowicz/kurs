package main.java.pl.com.tomasz.kuchnia.java14.array;


import main.java.pl.com.tomasz.kuchnia.java14.Animal.Animal;
import main.java.pl.com.tomasz.kuchnia.java14.Animal.Cat;
import main.java.pl.com.tomasz.kuchnia.java14.Animal.Dog;

public class ArrayFirstExample {

    public static void main(String[] args) {
        int[] firstArray = new int[4];
        Object o = firstArray;
        firstArray = new int[5];
        checkEnhancedFor();
        Object[] objects = new Object[2];
        for (int i = 0; i < firstArray.length; i++) {

            firstArray[i] = i + 1;



        }
        Animal[] animals = makeAnimals();
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        for (Animal aaa : animals) {
            System.out.println(aaa);

            Animal[] animals1 = new Animal[2];
            animals1[0] =new Dog();
            animals1[1]= new Cat();
            processAnimalArray(animals);


            Dog[] dogs =new Dog[2];
            dogs[0]= new Dog();
            dogs[1]= new Dog();
            processAnimalArray(dogs);

            Cat[] cats = new Cat[2];
            cats[0]= new Cat();
            cats[1]= new Cat();
            processAnimalArray(cats);
            addCatToArray(dogs);
        }

//        firstArray[0]= 1;
//        firstArray[1]= 2;
//        firstArray[2]= 3;
//        firstArray[3]= 4;
//        firstArray[4]= 5;


    }

    public static Animal[] makeAnimals() {
        Animal[] result = new Animal[2];
        result[0] = new Dog();
        result[1] = new Cat();

        return result;
    }

    public static void checkEnhancedFor() {
        Object[] objects = new Object[10];
        Dog[] dogs = new Dog[11];
        Cat[] cats = new Cat[5];

        for (Object o : objects) {
            System.out.println(o);
        }
        for (Dog dog : dogs) {
            System.out.println(dog);

        }
        for (Cat cat : cats) {
            System.out.println(cat);
        }


    }
    public  static  void processAnimalArray (Animal[] animals){
        for (Animal animal : animals){
            animal.wchichAnimal();
        }

    }
    public static void addCatToArray ( Animal[] cats){
        if (cats instanceof Cat[]){
            cats[0]= new Cat();
        } else {
            System.out.println(" Warning !!! Cannot add cat!!");
        }

    }
}
