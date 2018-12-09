package main.java.pl.com.tomasz.kuchnia.java14.generic;

//    generic
//    only Aniamls and extends
//    method enterHome(xx
//    method  Dog  goOutside(xxx
//    xxx =place holder

import main.java.pl.com.tomasz.kuchnia.java14.Animal.Animal;


public class Home <Zwierz extends Animal> {


    private Zwierz someone;



    public void enterHome (Zwierz someone){

      this.someone= someone;
      someone.wchichAnimal();
    }

public Zwierz goOutside(){
        return  someone;
}
// ctrl z r otwiera nam okno do podmiany np zwierz na psa ,lub kota itp  i zapisujesz replace all


    }

