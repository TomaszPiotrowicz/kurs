package main.java.pl.com.tomasz.kuchnia.java14.anonymouse_classes.lambda;

@FunctionalInterface

public interface FormulaConverter {

    double fromCelsiusToFarenheit(double celsius);

    default double fromFahreintToCelsius(double farenheit) {
        return 0;

    }
}
