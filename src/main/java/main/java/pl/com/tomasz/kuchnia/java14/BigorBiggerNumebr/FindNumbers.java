package main.java.pl.com.tomasz.kuchnia.java14.BigorBiggerNumebr;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FindNumbers {
//    List<Integer>
//    1000 elements - 1:100 Random
//    51 - print index of 51
//    use break;

    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt(101);

        List<Integer> PO = new ArrayList<>();


        for (int i = 0; i <= 1000; i++) {

            PO.add(random.nextInt(101));
        }
        int indexOf51 = -1;
            for ( int i=0;  i < PO.size(); i++){
                if (PO.get(i)==51){
                    indexOf51 =i ;
                    break;
                }

}
        System.out.println("index of element:" + indexOf51);


    }
}

