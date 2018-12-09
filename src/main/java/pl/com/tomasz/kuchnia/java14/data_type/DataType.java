package pl.com.tomasz.kuchnia.java14.data_type;

public class DataType {

    public static void main(String[] args) {
        byte d = 126;
        Byte dByte = 0;
        System.out.println("d:" + d );
        System.out.println("Min byte:" + Byte.MIN_VALUE);
        System.out.println("Max byte:" + Byte.MAX_VALUE);




        short c = 0;
        Short cshort = 0;
        System.out.println("Min short: " + Short.MIN_VALUE);
        System.out.println("Max short:" + Short.MAX_VALUE);

        int a = 5 + 8; // 4 bajty
       Integer aInteger = 5 + 8; // new Integer (5+8)
        System.out.println("Max int:" + Integer.MAX_VALUE);
        System.out.println("Min int:" + Integer.MIN_VALUE);

        long b = 5+8; // 8 bajtów
        Long blong = 5L + 8L;
        System.out.println("min long:" + Long.MIN_VALUE);
        System.out.println("Max long:" + Long.MAX_VALUE);

//        4 bajty
        float f =3.11f;
        Float fFloat = 3.11f;
        System.out.println("Min Float:"+ Float.MIN_VALUE);
        System.out.println("Max Float:"+ Float.MAX_VALUE);

//        8  bajtow

        double db = 3.11;
        System.out.println("Min double:" + Double.MIN_VALUE );
        System.out.println("Max double:"+ Double.MAX_VALUE);

        boolean trueOrFalse = false;
                trueOrFalse = true;
        Boolean bBoolean = true;
        bBoolean = false;
        bBoolean = null;

        char littelChar = '.';
        Character lCharacter = 'd';
        System.out.println("Min char:" + Character.MIN_VALUE);
        System.out.println("Max char:" + Character.MAX_VALUE);

        System.out.println("Min char:" + (int)Character.MIN_VALUE);
        System.out.println("Max char:" + (int)Character.MAX_VALUE);




    }

}
