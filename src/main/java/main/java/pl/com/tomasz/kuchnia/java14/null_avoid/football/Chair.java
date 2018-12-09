package main.java.pl.com.tomasz.kuchnia.java14.null_avoid.football;

public class Chair {
    @Override
    public String toString() {
        return "Chair{" +
                "number=" + number +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Chair(int number) {
        this.number = number;
    }

    private int number;
}
