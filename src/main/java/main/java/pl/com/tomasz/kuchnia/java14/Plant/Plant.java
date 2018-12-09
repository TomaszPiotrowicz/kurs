package main.java.pl.com.tomasz.kuchnia.java14.Plant;

public class Plant {


    protected int heightInCm;
    protected int waterUseInMl;

    @Override
    public String toString() {
        return "Plant{" +
                "heightInCm=" + heightInCm +
                ", waterUseInMl=" + waterUseInMl +
                ", currentWaterLevelInMl=" + currentWaterLevelInMl +
                '}';
    }

    protected int currentWaterLevelInMl;

    public Plant(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        this.heightInCm = heightInCm;
        this.waterUseInMl = waterUseInMl;
        this.currentWaterLevelInMl = currentWaterLevelInMl;
    }

    public void grow() {

//        empty
    }

    public void increaseWaterLevel(int waterInMl) {
        currentWaterLevelInMl += waterInMl;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public int getWaterUseInMl() {
        return waterUseInMl;
    }
    public int getRequiredWaterIncrease(){
        return 2;
    }


}
