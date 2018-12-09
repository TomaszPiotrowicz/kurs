package pl.com.tomasz.kuchnia.java14.Conditioinal;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ConditionalTest {

    public static void main(String[] args) {
//        printStringLenght ("ala");
//        String value = "ala ma kota";
//        printStringLenght(value);
//        String value2 = null;
//        printStringLength (value2);
//      testStringLength(null);
//        testStringLenght("");    }

        int age = 15;
        if (age <= 10) {
            System.out.println(" jesteś szczawik!!!");
            jakiWiek(age);
        } else if (age <= 15) {
            System.out.println("bobas");
            jakiWiek(age);
        } else if (age <= 18) {
            System.out.println("młodzież");
            jakiWiek(age);
        } else {
            System.out.println("jesteś dorosły");
            jakiWiek(age);
        }

    }

    private static void jakiWiek(int wiek){
        System.out.println("wiek: " + wiek );
    }

}




