package main.java.pl.com.tomasz.kuchnia.java14.homework;

import java.io.*;

public class Homework2 {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\aa\\zajecia.txt");
        System.out.println("file exist:" + file.exists());
        System.out.println("is directory:"+ file.isDirectory());
        Reader reader = null;


        try {
            reader = new FileReader("C\\aa\\zajecia.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        String  string  = ("C:\\aa\\zajecia.txt");
        string = "123";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("C:\\aa\\zajecia.txt");
            fileWriter.write(Integer.toString(123));
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }
}

