package main.java.pl.com.tomasz.kuchnia.java14.Stringtest;

public class String_test {

//TODO :SHOWE REFERENCWz
    public static void main(String[] args) {
        String name = "Tomasz";
        String theSame = name;
        String secondName = new String ("Tomasz");
        String surname = "Piotrowicz";

        System.out.println("My name: + name");
        System.out.println("My surname : + Piotrowicz");
        System.out.println("name, number of letters:" +  name.length());
        System.out.println( "Surmane, Number of letters : " + surname.length());
//        System.out.println("Chat at index 6:" + name.charAt(6
//       ));
//        System.out.println("Chat at index 7" + name.charAt(7));
        System.out.println( "Chat at index 1" + name.charAt(1
        ));
       System.out.println("My new surname:" + surname.substring(2,5));
       String newTheSame = theSame.replace('a', 'o');
        System.out.println("Replace:" + theSame.replace ( 'a','o' ));
        System.out.println("My surname :" + newTheSame);
        System.out.println("my name : " + name);
        System.out.println("theSame: " + theSame);

        String hello = "hello";
        System.out.println(hello + "java");
        hello = hello + "java";
        System.out.println(hello);

        System.out.println(5+6);
        System.out.println("5 + 6 :" + (5+6)) ;
        System.out.println(5+6+ "-5+6");
        System.out.println("5+6 :" + 5+6);
        System.out.println("J" + 7);
        System.out.println('J' + 7);
//   wywołuje  wartość liczbową j
        System.out.println('J');
        System.out.println((int)'J');


    }

}
