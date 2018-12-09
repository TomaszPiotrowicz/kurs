package main.java.pl.com.tomasz.kuchnia.java14.Plant;

public class Rose extends Plant {


    public Rose(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }

    @Override
    public String toString() {
        return "Rose{" +
                "heightInCm=" + heightInCm +
                ", waterUseInMl=" + waterUseInMl +
                ", currentWaterLevelInMl=" + currentWaterLevelInMl +
                '}';
    }

    @Override
    public void grow() {
        heightInCm = heightInCm + 5;
        currentWaterLevelInMl = currentWaterLevelInMl - waterUseInMl;
    }
    public int getRequiredWaterIncrease(){
        return 4;
    }

}

