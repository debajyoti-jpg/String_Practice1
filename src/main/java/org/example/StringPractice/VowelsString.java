package org.example.StringPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class VowelsString {

    public static void main(String[] args) {

        String name ="Debajyoti";

        String vowels = "AEIOU";

        //name.chars().filter(c -> !vowels.contains(c)).
        StringBuffer st =new StringBuffer();
        Arrays.stream(name.split(""))
                .filter(c -> !vowels.contains(c.toUpperCase()))
                .map(st::append).collect(Collectors.toList());

        System.out.println(st);

        long count = name.chars().filter(c -> c=='a' || c==('e') || c==('i') || c==('o') ||c==('u')).count();
        System.out.println(count);

        Map<Character, Integer> charCountMap = new HashMap<>();

//        charCountMap.getOrDefault()
    }

}
