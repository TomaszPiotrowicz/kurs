package main.java.pl.com.tomasz.kuchnia.java14.exeption;

public class ThrowLevel2 {


    public void doIt() throws MyException{
        System.out.println("I'm dangerus:)");

        MyExcepionThrower thrower = new MyExcepionThrower();
        thrower.throwMyException();

    }
}
