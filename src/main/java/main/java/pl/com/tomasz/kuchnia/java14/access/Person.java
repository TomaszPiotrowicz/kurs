package main.java.pl.com.tomasz.kuchnia.java14.access;

public class Person {

    private String name;
    private String surmane;
//    public String surname;
    private int age;
//    public int age;
    String secret;
    protected String secondSecret;

    public Person(){

    }

    public Person(String name, String surmane, int age) {
        this.name = name;
        this.surmane = surmane;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurmane() {
        return surmane;
    }

    public void setSurmane(String surmane) {
        this.surmane = surmane;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (!checkAge(age)) {

            this.age = 0;
            return;
        }
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surmane ='" + surmane + '\'' +
                ", age=" + age +
                '}';
    }


    private boolean checkAge(int age) {
        if (age < 0) {
            return false;
        } else {
            return true;


        }

    }}




