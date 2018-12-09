package main.java.pl.com.tomasz.kuchnia.java14.null_avoid;

public class Bathroom {
    @Override
    public String toString() {
        return "Bathroom{" +
                "sink=" + sink +
                '}';
    }

    public Sink getSink() {
        return sink;
    }

    public void setSink(Sink sink) {
        this.sink = sink;
    }

    public Bathroom(Sink sink) {
        this.sink = sink;
    }

    private Sink sink;
}
