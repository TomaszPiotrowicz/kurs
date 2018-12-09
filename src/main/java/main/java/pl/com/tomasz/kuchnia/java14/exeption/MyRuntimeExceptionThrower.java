package main.java.pl.com.tomasz.kuchnia.java14.exeption;

public class MyRuntimeExceptionThrower {

    public void throwMyRuntimeException(){

        System.out.println("throwMyException()");
        throw new MyRuntimeException("ihihihihi");
    }
}
