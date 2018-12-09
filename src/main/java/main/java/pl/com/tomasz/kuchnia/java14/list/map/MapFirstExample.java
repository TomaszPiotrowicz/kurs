package main.java.pl.com.tomasz.kuchnia.java14.list.map;


import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapFirstExample {

    public static void main(String[] args) {
        Map<String, String> idsOverNames = new HashMap<>();

        System.out.println(idsOverNames.put("83", "Tomek"));
        System.out.println(idsOverNames.put("82", "Ewa"));
        System.out.println(idsOverNames.put("81", "Adam"));
        System.out.println(idsOverNames.put("80", "Paweł"));
        System.out.println(idsOverNames.put("75", "Anna"));


        for (String key : idsOverNames.keySet()) {
            System.out.println("Key :" + key + ", value:" + idsOverNames.get(key));





        }
        Map<String, String>secondMap = new LinkedHashMap<>();

    }
}