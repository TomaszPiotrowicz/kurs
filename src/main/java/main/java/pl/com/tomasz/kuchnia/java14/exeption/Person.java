package main.java.pl.com.tomasz.kuchnia.java14.exeption;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) throws WrongParametr {

        if (name == null || "".equals(name)) {
            throw new WrongParametr("Wrong  value of name: " + name);
        }
        this.name = name;
        if ( surname ==null || "".equals(surname)){
            throw  new WrongParametr(" Wrong value of surname:" + surname);
        }
        this.surname = surname;
        if (age <=0 ){
            throw  new WrongParametr(" Wrong value of age:" + age);


        } this.age = age;



    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
