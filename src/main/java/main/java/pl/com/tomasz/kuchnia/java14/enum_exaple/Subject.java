package main.java.pl.com.tomasz.kuchnia.java14.enum_exaple;

public enum Subject {
    HISTORY (4),
    BIOLOGY (5),
    ENGLISH (15),
    MATH (20);
    float hours;
    private Subject (float hours){
        this.hours = hours;
    }

    public float getHours(){
        return hours;
    }

}
