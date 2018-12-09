package main.java.pl.com.tomasz.kuchnia.java14.Plant;

public class Opuncja extends  Plant {


    public Opuncja(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }

    @Override
    public void grow() {
        heightInCm = heightInCm + 3;
        currentWaterLevelInMl = currentWaterLevelInMl - waterUseInMl;
    }

    @Override
    public String toString() {
        return "Opuncja{" +
                "heightInCm=" + heightInCm +
                ", waterUseInMl=" + waterUseInMl +
                ", currentWaterLevelInMl=" + currentWaterLevelInMl +
                '}';
    }
    public int getRequiredWaterIncrease(){
        return 5;
    }

}
