package main.java.pl.com.tomasz.kuchnia.java14.Plant;

public class Cactus extends Plant {


    public Cactus(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }

    @Override
    public String toString() {
        return "Cactus{" +
                "heightInCm=" + heightInCm +
                ", waterUseInMl=" + waterUseInMl +
                ", currentWaterLevelInMl=" + currentWaterLevelInMl +
                '}';
    }

    @Override
    public void grow() {
        heightInCm = heightInCm + 1;
        currentWaterLevelInMl = currentWaterLevelInMl - waterUseInMl;
    }
    public int getRequiredWaterIncrease(){
        return 1;
    }

}
