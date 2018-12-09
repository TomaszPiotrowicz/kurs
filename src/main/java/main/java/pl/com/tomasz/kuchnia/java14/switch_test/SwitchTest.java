package main.java.pl.com.tomasz.kuchnia.java14.switch_test;

import main.java.pl.com.tomasz.kuchnia.java14.enum_exaple.Month;


public class SwitchTest {

    public static void main(String[] args) {
        final int a = 5;
        changeInt(a);
        System.out.println(" a after method call:" + a);
        final StringBuilder builder = new StringBuilder();
        builder.append(1);
        builder.append(2);
        builder.reverse();

        printNumbersOfDays (Month.FEBUARY );


    }

    public static void changeInt(int a) {

        a = 6;
        System.out.println("a inside method" + a);
    }

    public static void checkMarkWitchSwitch(int mark) {
        switch (mark) {
            case 6:
            case 5:
                System.out.println("genialnie");
                break;
            case 4:
            case 3:
                System.out.println("może być lepiej");
                break;
            default:
                System.out.println("Do roboty !!!!!!!!");


        }

    }

    public static void checkMark(int mark) {

        if (mark == 6 || mark == 5) {
            System.out.println("genialnie");

        } else if (mark == 4 || mark == 3) {
            System.out.println("może być lepiej");

        } else {

            System.out.println("Do roboty !!!!!!!!");

        }


    }

    public static void printNumbersOfDays(Month currentMonth) {
        switch (currentMonth) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case DECEMBRE:
            case SEPTEMBER:
                System.out.println("31");
                break;
            case FEBUARY:
                System.out.println("28");
                break;

            case APRIL:
            case JUNE:
            case OCTOBER:
            case NOVEMBER:

                System.out.println("30");
                break;
        }


    }
}