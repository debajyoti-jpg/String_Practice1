package org.example.org.example.StringPractice;

import java.util.Scanner;

public class StringPractice {
    public static void main(java.lang.String[] args) {

        System.out.println("Enter You Name ----");
        Scanner sc = new Scanner(System.in);
        java.lang.String name = sc.nextLine();
        java.lang.String newString="";
        for (int i=name.length()-1;i>=0;i--){
            newString += name.charAt(i);
        }

        System.out.println(newString);


    }
}
