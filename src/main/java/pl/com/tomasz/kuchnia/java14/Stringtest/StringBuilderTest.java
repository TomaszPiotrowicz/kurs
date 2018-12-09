package pl.com.tomasz.kuchnia.java14.Stringtest;

public class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Tomasz");

        String ala = "ala" + "ma" + "kota";
             StringBuilder ala2 = new StringBuilder();
             ala2.append("ala");
             ala2.append(" ma ");
             ala2.append(" kota ");

//             ala2.append("ala")
//                     .append("ma")
//                     .append("kota");
             String ala2string = ala2.toString();

        System.out.println(ala);
        System.out.println(ala2);
        System.out.println(ala2string)
        ;
    ala2.replace(4,6, "miała");
        System.out.println(ala2);

        ala.substring(1,1);
    }
}
