package main.java.pl.com.tomasz.kuchnia.java14.exeption;

public class MyExcepionThrower {

    public void throwMyException() throws MyException {
        System.out.println("throwMyException()");
        throw new MyException("hahaha");

    }
}
