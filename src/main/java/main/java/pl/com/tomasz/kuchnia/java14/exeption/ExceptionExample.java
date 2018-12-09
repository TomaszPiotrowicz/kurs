package main.java.pl.com.tomasz.kuchnia.java14.exeption;

public class ExceptionExample  {

    public static void main(String[] args) throws MyException {

        MyExcepionThrower object = new MyExcepionThrower();
//        try{
            object.throwMyException();
            System.out.println("here");
//        } catch (MyException e){
//            e.printStackTrace();
//        }
        System.out.println("here 2");
    }
}
