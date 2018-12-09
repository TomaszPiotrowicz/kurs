package main.java.pl.com.tomasz.kuchnia.java14.Plant;

public class BetterGardener extends Gardener{

    public void waterPlant (Plant plant){
        plant.increaseWaterLevel(plant.getRequiredWaterIncrease());
    }



}
