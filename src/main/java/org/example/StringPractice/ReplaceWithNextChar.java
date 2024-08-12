package org.example.StringPractice;

public class ReplaceWithNextChar {

    public static void main(String[] args) {


        String name = "debajyoti";

        String subs = name.substring(3,6);

        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);
            if (ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u'){
                name=name.replace(ch,++ch);
            }


        }
        System.out.println(subs);
        System.out.println(name);

//        String s = Arrays.stream(name.split("")).
//                filter(j -> j.equals('a') || j.equals('e') || j.equals('i') || j.equals('a') ||j.equals('a'))
//                .map(n -> n.toString().replace(n,(n.toString()+1))).collect(Collectors.toList()).toString();
//
//        System.out.println(s);
    }
}
