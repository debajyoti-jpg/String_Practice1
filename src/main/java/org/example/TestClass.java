package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TestClass {
    static String name = "Debajyoti";

    public static void main(String[] args) {

    //reverse of a string

        String concat = "";
        for(int i=name.length()-1;i>=0;i--){

            //System.out.println(name.charAt(i));
            concat+=name.charAt(i);
        }
        System.out.println("Traditional Way :"+concat);
       // to find all employee who haven't submit the timesheet

//        Select Employee_Name from Employee_table where id IN (Select empliyee_id from TimeSheet_table where
//
//        timeshee_value IS null);
        StringBuilder st  = new StringBuilder(name);
        st.reverse();
    System.out.println("String Buffer Way :"+st);

    String rev = name.chars().mapToObj(ch -> String.valueOf((char) ch)).
            reduce((acc,ch) -> ch+acc).orElse("");

        System.out.println("Java 8  Way :"+rev);
    }
}
