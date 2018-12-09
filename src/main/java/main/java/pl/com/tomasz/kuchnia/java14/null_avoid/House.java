package main.java.pl.com.tomasz.kuchnia.java14.null_avoid;

public class House {

    public Bathroom getBathroom() {
        return bathroom;
    }

    public void setBathroom(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    private Bathroom bathroom;

    @Override
    public String toString() {
        return "House{" +
                "bathroom=" + bathroom +
                '}';
    }

    public House (Bathroom bathroom){
        this.bathroom = bathroom;
    }
}
