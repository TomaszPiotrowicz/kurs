package main.java.pl.com.tomasz.kuchnia.java14.exeption;

public class MyRuntimeException extends RuntimeException {

    public MyRuntimeException(){

    }
    public MyRuntimeException(String messge){

        super (messge);
    }
    public MyRuntimeException ( String message , Throwable cause){
        super(message, cause);
    }
}
