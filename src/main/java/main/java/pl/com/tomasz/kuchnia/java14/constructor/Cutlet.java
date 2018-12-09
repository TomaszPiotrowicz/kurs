package main.java.pl.com.tomasz.kuchnia.java14.constructor;

public class Cutlet {

    private Cutlet(){

        System.out.println("Cutlet");
    }

        private Cutlet (String onionking){
            System.out.println("onion");
    }
    public static Cutlet giveMeNewNormalCutlet (){
        return new Cutlet();

    }
    public  static  Cutlet cutletWhitOnion(String onionkind){
        return  new Cutlet  (onionkind);
    }
}
