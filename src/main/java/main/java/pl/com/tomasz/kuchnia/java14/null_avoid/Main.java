package main.java.pl.com.tomasz.kuchnia.java14.null_avoid;

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

        displaySinkLabelVeryVeryNaive(witthBathroomWithSink);


    }

    private static void displaySinkLabelVeryVeryNaive(House house) {

        String label = house.getBathroom().getSink().getLabel();
        System.out.println(label);
    }

    private static void displaySinkLabelWithNullCheck11(House house) {
        String label = "default";

        if (null != house) {
            Bathroom bathroom = house.getBathroom();

            if (null != bathroom) {
                Sink sink = bathroom.getSink();

                if (null != sink) {
                    label = sink.getLabel();
                }

            }
        }
        System.out.println(label);


    }
    private static void displaySinkLabelWithNullCheck (House house){
        Optional.ofNullable(house)
                .map(house1 -> house1.getBathroom())
                .map(bathroom -> bathroom.getSink())
                .map(sink -> sink.getLabel())
                .ifPresent(s -> System.out.println("label : " + s));
    }


//    String? nameWithNull = null;
}
