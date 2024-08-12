package org.example.SortPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DataSort {
    public static void main(String[] args) {
        System.out.println("Hello world!");


//        String name = "debajyoti";
//
//        //String newname = "";
//        char ch;
//
//        for (int i = 0; i < name.length(); i++) {
//
//            ch = name.charAt(i);
//            if (ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u'){
//                name=name.replace(ch,++ch);
//            }
//
//
//        }
//
//        System.out.println(name);

        List<Data> datalist = Arrays.asList(
                new Data(1, 27, "Deba","Male"),
                new Data(3, 20, "Arpi","Female"),
                new Data(2, 23, "Saya","Male")

        );

        Comparator<Data> comp = new Comparator<Data>() {

            @Override
            public int compare(Data o1, Data o2) {
                if(o1.getAge()<o2.getAge())
                    return 1;
                else if (o1.getAge()>o2.getAge())
                    return -1;
                else
                    return 0;

            }
        };


        Collections.sort(datalist,comp);

        System.out.println("1st Sort"+datalist);

        List<Data> sortedlist =  datalist.stream().sorted((o1,o2)-> {
            if(o1.getAge()<o2.getAge())
                return 1;
            else if (o1.getAge()>o2.getAge())
                return -1;
            else
                return 0;
        }).collect(Collectors.toList());

        System.out.println("2nd Sort"+sortedlist);
    }
}