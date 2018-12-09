package main.java.pl.com.tomasz.kuchnia.java14.enum_exaple;


public enum Seasons {
//    jedyne obiekty tego typu ZAWSZE zapisujemy DUŻE LITERY
    WINTER (-10),
    SUMMER (25),
    SPRING(10),
    AUTUMN (8);

    private float averageTempInC;
    private Seasons(float averageTempInC){
        this.averageTempInC = averageTempInC;

    }

    public float getAverageTempInC() {
        return averageTempInC;
    }
}
