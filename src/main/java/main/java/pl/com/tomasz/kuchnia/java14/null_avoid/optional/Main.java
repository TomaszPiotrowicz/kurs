package main.java.pl.com.tomasz.kuchnia.java14.null_avoid.optional;

import java.nio.file.OpenOption;
import java.util.Optional;

public class Main {

    String name = "";

    public static void main(String[] args) {
//        dom bez łazienki
//        dom z łazienką ale bez zlewu
//        dom na bogato e wszystkim
        Sink sink = new Sink("koło");
        Bathroom withoutSink = new Bathroom(null);
        Bathroom withSink = new Bathroom(sink);
        House witthBathroomWithSink = new House(withSink);
        House witthBathroomWithoutSink = new House(withoutSink);
        House withoutBathroom = new House(null);

//never ever!!!!! nie piszemy tak !!!!!!!!!!!!!!!!!!!!!!!!!!
        Optional<String> maybeString;
//        Optional<String> maybeString = Optional.empty();
        Optional<String> stringForSure = Optional.of("Mariusz");
        if (stringForSure.isPresent()) {
            System.out.println(stringForSure.get());
        }


        String maybeNull = null;
        Optional<String> absentString = Optional.ofNullable(maybeNull);
        absentString.ifPresent(x -> System.out.println(x));

   }

    public static void printLabelWithLamda(House house) {
        Optional.ofNullable(house)
                .flatMap(house1 -> house1.getBathroom())
                .flatMap(bathroom -> bathroom.getSink())
                .map(sink -> sink.getLabel())
                .ifPresent(s -> System.out.println("label: "+ s));


    }
    private static void  pirntLabekSlowMode( House house){
        String label = "Empty";
        Optional<House>maybeHouse = Optional.ofNullable(house);

        if (maybeHouse.isPresent()){
            Optional<Bathroom>maybeBathroom = maybeHouse.get().getBathroom();

            if(maybeBathroom.isPresent()){
                Optional<Sink>maybeSink = maybeBathroom.get().getSink();
                if(maybeSink.isPresent()){
                    label = maybeSink.get().getLabel();

                }
            }

        }
        System.out.println(label);
    }
}