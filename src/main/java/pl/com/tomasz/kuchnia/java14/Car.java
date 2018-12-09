package pl.com.tomasz.kuchnia.java14;

public class Car {

    private String brand;
    private String model;
    private String color;
    private int yearOfProduction;


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }// constructor
    public Car(String brand, String model, String color, int yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    public static void main(String[] args) {
        // porshe911 to jest referencja
        Car porshe22 = new Car("Porshe", "Carrera", "Black", 2015);

        Car porshe911 = new Car("wawa", "sport", "grey", 2000);
        Car autoMarcina = porshe911;
        ;

        System.out.println("porshe" + porshe22.toString());
        System.out.println("porshe911" + porshe911.toString());
        System.out.println("Auto Marka" + autoMarcina);

    }
}
