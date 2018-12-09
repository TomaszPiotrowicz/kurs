//package main.java.pl.com.tomasz.kuchnia.java14.exeption.network;
//
//import java.util.Random;
//
//import static javafx.scene.input.KeyCode.R;
//
//public class StockExchange {
//    private static final
//    Random random = new Random();
//
//    public StockExchange() throws StockExchangeCreationException {
//        if (random.nextInt(100) % 2 == 1) {
//            throw new StockExchangeCreationException("Network connection error");
//        }
//
//    }
//
//    public static void main(String[] args) {
//        StockExchange stockExchange = new StockExchange();
//
//        String readData = null;
//        try {
//            stockExchange.readData();
//            System.out.println("after");
//        }catch (ReadDataException exc){
//            readData = "";
//        }finally (ReadDataException exc)
//
//        }
//    }
//
//    public String readData() throws ReadDataException {
//        if (random.nextInt(100) % 2 == 1) {
//            throw new ReadDataException("coś ");
//        }
//
//        return "data";
//    }
//
//
//}
