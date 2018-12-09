package main.java.pl.com.tomasz.kuchnia.java14.exeption;

public class TestMyRuntimeException {

    public static void main(String[] args) {

        try {
            throw new MyRuntimeException();
        } catch (MyRuntimeException e) {
            e.printStackTrace();
        }

    }
}
