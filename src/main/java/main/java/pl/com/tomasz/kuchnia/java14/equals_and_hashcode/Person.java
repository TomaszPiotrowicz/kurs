package main.java.pl.com.tomasz.kuchnia.java14.equals_and_hashcode;

public class Person {

    private String name;
    private String surmane;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surmane='" + surmane + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, String surmane, int age) {
        this.name = name;
        this.surmane = surmane;
        this.age = age;
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
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;

        if (name != null){
            if (! name.equals(person.name))
            return false;
        }else{
            if (person.name != null)
                return false;


//            equals służy do porównania obiektów czy są takimi samymi oboektami !!!!


        }
        return surmane != null ? surmane.equals(person.surmane) : person.surmane == null;
    }
// hashcode jest intem obiektu
//    equals powinien być równy z hascodem ale hascode nie musi być równy equals
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surmane != null ? surmane.hashCode() : 0);
        result = 31 * result + age;
        return result;

    }

}

