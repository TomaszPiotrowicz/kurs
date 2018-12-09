package main.java.pl.com.tomasz.kuchnia.java14.BigorBiggerNumebr;

import java.util.Scanner;

public class BigorBiggerNumer {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Podaj liczę 1");
        int a = inputReader.nextInt();
        System.out.println("Podaj liczbę 2");
        int b = inputReader.nextInt();
        System.out.println(("Podaj liczbę 3"));
        int c = inputReader.nextInt();
        int min = findMin(a, b, c);
        System.out.println("Found min:" + min);

//        int max = findMax(a, b, c);

//        System.out.println("Found max:" + max);

    }

    public static int findMin(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}

//    public static int findMax(int d, int e, int f) {
//        int max = d;
//        if (e > max) {
//            max = e;
//
//        }
//        if (f > max) {
//            max = f;
//
//        }
//        return max;
//
//
//    }


//}
