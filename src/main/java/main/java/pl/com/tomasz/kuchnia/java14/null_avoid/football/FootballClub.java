package main.java.pl.com.tomasz.kuchnia.java14.null_avoid.football;

public class FootballClub {
    @Override
    public String toString() {
        return "FootballClub{" +
                "stadium=" + stadium +
                '}';
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public FootballClub(Stadium stadium) {
        this.stadium = stadium;
    }

    private  Stadium stadium;
}
