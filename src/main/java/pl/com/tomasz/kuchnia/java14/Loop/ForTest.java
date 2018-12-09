package pl.com.tomasz.kuchnia.java14.Loop;

public class ForTest {

    public static void main(String[] args) {


//       printNTimes(1, "ala");
//        printNTimes(100, "ala ma kota");
//        printNTimes(1_000_000, "ala ma kota");
        myFun();
    }

    public static void printNTimes(int numberofTimes, String valueToPrint) {
        for (int i = 0; i < numberofTimes; i++) {
            System.out.println(valueToPrint);
        }

    }


    public static void myFun() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Tomasz Piotrowicz");
        }


    }


}
