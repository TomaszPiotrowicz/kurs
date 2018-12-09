package main.java.pl.com.tomasz.kuchnia.java14.null_avoid.optional;

import java.util.Optional;

public class House {

    public Optional<Bathroom> getBathroom()
    {
        return Optional.ofNullable(bathroom);
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
