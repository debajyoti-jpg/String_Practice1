package org.example.ExceptionPractice;

import java.util.Scanner;

public class ExceptionPractice{
    public static void main(String[] args){

        System.out.println("Enter A value --");
        //Scanner sc = new Scanner(System.in);
        //int name=sc.nextInt();
    int name =0;
    try{
        if (name==0){
            throw new MyException("Wrong Value");
        }else{
            int div = 12/name;
            System.out.println(div);
        }
    }catch(Exception e){
        System.out.println(e);
    }


    }

}
