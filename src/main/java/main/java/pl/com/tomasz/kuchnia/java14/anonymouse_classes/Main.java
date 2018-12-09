package main.java.pl.com.tomasz.kuchnia.java14.anonymouse_classes;

public class Main {


    public static void main(String[] args) {
        Animal monkey = new Monkey();
        Animal parrot = new Animal() {
            @Override
            public void printAnimalName() {
                System.out.println("Parrot");
            }
        };
        Animal duck = new Animal() {
            @Override
            public void printAnimalName() {
                System.out.println("Duck");
            }

            public void makeSound() {
                System.out.println("kwa kwa");
            }
        };

        Monkey monkey1 = new Monkey() {
            @Override
            public void printAnimalName() {
                System.out.println("Gorilla");
            }
        };
        AnimalProcessor processor = new AnimalProcessor();
        processor.processAnimal(monkey);
        processor.processAnimal(parrot);
        processor.processAnimal(duck);
        processor.processAnimal(new Animal() {
            @Override
            public void printAnimalName() {
                System.out.println("Duck!!!");
            }
        });
        ShowSecret secret = new ShowSecret() {
            @Override
            public void printSecret() {
                System.out.println("Secret");
            }
        };
        SecretProcessor secretProcessor = new SecretProcessor();
        secretProcessor.processSecret(new ShowSecret() {
            @Override
            public void printSecret() {
                System.out.println("sss");
            }
        });
        secretProcessor.aaa();


    }



}


