package main.java.pl.com.tomasz.kuchnia.java14.null_avoid.football;

public class Stadium {
    @Override
    public String toString() {
        return "Stadium{" +
                "chair=" + chair +
                '}';
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public Stadium(Chair chair) {
        this.chair = chair;
    }

    private Chair chair;
}
