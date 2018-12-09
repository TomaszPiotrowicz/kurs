package main.java.pl.com.tomasz.kuchnia.java14.enum_exaple;

public enum Month {
    JANUARY(31),
    FEBUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31  ),
    NOVEMBER(30),
    DECEMBRE(31);

    private int  numberOfDays;
    private Month (int numberOfDays){
        this.numberOfDays = numberOfDays;
    }
    public int getNumberOfDays(){
        return numberOfDays;
    }
}
