package main.java.pl.com.tomasz.kuchnia.java14.Plant;

public class Gardener {

    public void waterPlant ( Plant plant){
        plant.increaseWaterLevel( 2);
    }
    public void makePlantGrow ( Plant plant){
        plant.grow();
    }
}
