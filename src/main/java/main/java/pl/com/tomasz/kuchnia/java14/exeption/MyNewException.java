package main.java.pl.com.tomasz.kuchnia.java14.exeption;

public class MyNewException extends Exception{

    public MyNewException( ){

    }

    public MyNewException( String message){
        super(message);


    }


    public MyNewException (String message, Throwable cause){
        super(message, cause);
    }
}


