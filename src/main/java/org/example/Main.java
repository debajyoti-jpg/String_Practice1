package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    String name= "Debajyoti";

    String st = name.toLowerCase();

//    List<String>   ssList= Arrays.stream(st).map((s) -> new StringBuilder(s).reverse().toString()).
//            collect(Collectors.toList());
//
//    System.out.println(ssList.toString());

        String vowels= "AEIOUaeiou";
        String[] v = st.split("");

        //Arrays.stream(v).forEach(System.out::println);
//        Arrays.stream(name).map((s) -> new StringBuilder(s).reverse().toString()).
//                collect(Collectors.toList());
        StringBuffer st1 = new StringBuffer();

        Arrays.stream(v).filter(i -> !vowels.contains(i)).map(st1::append).collect(Collectors.toList());


      System.out.println(st1);




    }
}