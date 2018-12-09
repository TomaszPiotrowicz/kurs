package main.java.pl.com.tomasz.kuchnia.java14.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Country> countries = Arrays.asList();
        new Country("Poland", 40000000, 312, 5000);
        new Country("Russia", 100000000, 22312, 7000);
        new Country("China ", 1500000000, 11312, 4000);
        new Country("Ukraine", 20000000, 112, 2000);
        new Country("Spain", 50000000, 412, 10000);

genericFilter(countries, country ->country.getAveragePayCheck()>10000);
    }

    private static List<Country> getlistOfRichCountries(List<Country> countries,double minimalPayCheck) {
        List<Country> result = new ArrayList<>();

        for (Country country : countries) {
            if (country.getAveragePayCheck() >= minimalPayCheck) {
                result.add(country);
            }
            private static List<Country> getCountriesWithMinimalNumberOfPeople (List < Country > countries,
            long minimalNumberOfPeople){
                List<Country> result = new ArrayList<>();
                for (Country country : countries) {
                    if (country.getAveragePayCheck() >= 4000) {
                        result.add(country);
                    }
                    return result
                }
            }
            private static  List<Country>filterByMinimalPeopleNumber(List<Country>countries,long minimalPeopleNumber){
                countries.stream()
                        .filter(country1 -> country.getNumberOfPeople())>minimalPeopleNumber
                        .collect (Collectors.toList());

            }
            private static  List<Country>genericFilter(List<Country>countries, Predicate<Country>predicate){
               return countries.stream()
                        .filter(predicate)
                        .collect (Collectors.toList());
        }
    }
}