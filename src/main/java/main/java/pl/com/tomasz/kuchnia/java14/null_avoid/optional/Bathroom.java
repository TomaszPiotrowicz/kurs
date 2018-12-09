package main.java.pl.com.tomasz.kuchnia.java14.null_avoid.optional;

import java.util.Optional;

public class Bathroom {
    private Sink sink;
    @Override
    public String toString() {
        return "Bathroom{" +
                "sink=" + sink +
                '}';
    }

    public Optional<Sink> getSink() {
        return Optional.ofNullable(sink);
    }

    public void setSink(Sink sink) {
        this.sink = sink;
    }

    public Bathroom(Sink sink) {
        this.sink = sink;
    }


}
