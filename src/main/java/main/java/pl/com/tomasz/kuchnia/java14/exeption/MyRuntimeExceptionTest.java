package main.java.pl.com.tomasz.kuchnia.java14.exeption;

public class MyRuntimeExceptionTest {




    public static void main(String[] args) {
        try{
            level1();
        }catch (MyRuntimeException exc){
            exc.printStackTrace();
        }


    }

    public static void level1  () {
        level2();

    }

    public static void  level2() {
        level3();

    }

    public static void level3()throws MyRuntimeException {
       throw  new MyRuntimeException();
    }
}
