package main.java.pl.com.tomasz.kuchnia.java14.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileExample {

    public static void main(String[] args) {

        File maybeFile = new File("C:\\aa\\tekst.txt");
        System.out.println("file exist:" + maybeFile.exists());
        System.out.println("is directory:"+maybeFile.isDirectory());

        File existingOneOrNot = new File("\\flflflfl\\tatata");
        System.out.println("existingOneOrNot" + existingOneOrNot);
        System.out.println();
            try{
            Reader reader = new FileReader("\\");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }



    }

}
