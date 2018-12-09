package pl.com.tomasz.kuchnia.java14.ScannerTest;

import java.util.Scanner;
import java.lang.*;


public class ScannerTest {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Podaj wartość 1");
        int a = inputReader.nextInt();
        System.out.println("Jakie działanie");
        String dzialanie = inputReader.next();
        System.out.println("Podaj wartość 2");
        int b = inputReader.nextInt();
        System.out.println("Wynik");


        if (dzialanie.equals("mnożenie")) {
            mnozenie(a, b);
        } else if (dzialanie.equals("dodaj")) {
            dodawanie(a, b);
        } else if (dzialanie.equals("odejmij")) {
            odejmowanie(a, b);


        } else if (dzialanie.equals("podziel")) {
            dzielenie(a, b);
        }
//        System.out.println("brak działania");
    }


////        int iloczyn = (a * b * c);
//        System.out.println("iloczyn liczb " + iloczyn);
//        int intValue = inputReader.nextInt();
//        int secondValue = inputReader.nextInt();
//
//        System.out.println("I've got new value" + intValue + "and" + secondValue);
//        for (; inputReader.hasNext(); ) {
//            if (inputReader.hasNextInt())
//                System.out.println(inputReader.next());


    public static void dodawanie(int a, int b) {
        System.out.println((a + b));

    }

    public static void odejmowanie(int a, int b) {
        System.out.println(a - b);
    }

    public static void mnozenie(int a, int b) {

        System.out.println(a * b);

    }

    public static void dzielenie(int a, int b) {

        System.out.println(a / b);
    }
}
