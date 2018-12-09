package main.java.pl.com.tomasz.kuchnia.java14.anonymouse_classes.my_anonymous;

public class Main {

    public static void main(String[] args) {
        Plant tulip = new Plant() {
            @Override
            public void grow() {
                System.out.println("tulip");
            }

            @Override
            public void smell() {
                System.out.println("tulip1");

            }

            @Override
            public void wilt() {
                System.out.println("tulip2");

            }
        };
        Plant grass = new Plant() {
            @Override
            public void grow() {
                System.out.println("cccc");

            }

            @Override
            public void smell() {
                System.out.println("fkgg");

            }

            @Override
            public void wilt() {
                System.out.println("hrjg");
            }
        };

        Gardener franek = new Gardener();
        franek.processPlat(tulip);
        franek.processPlat(grass);
        franek.processPlat(new Plant() {
            @Override
            public void grow() {
                System.out.println("sałata");
            }

            @Override
            public void smell() {
                System.out.println("sałata 1");

            }

            @Override
            public void wilt() {
                System.out.println("sałata2");

            }

        });

    }
}
