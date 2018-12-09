package main.java.pl.com.tomasz.kuchnia.java14.exeption;

public class WrongParametr extends  Exception {

    public WrongParametr(){

    }
    public WrongParametr( String message){
        super(message);

    }
    public WrongParametr( String message, Throwable cause){
        super(message, cause);
    }

}
