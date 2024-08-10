package org.example.ExceptionPractice;

class MyRunException extends RuntimeException {

    MyRunException(){
        super("Age is below 18");
    }
}



public class RunTimeException1 {
    public static void main(String[] args){

        try{
           vote(12);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    private static void vote(int i) throws MyRunException {
        if(i>=18){
            System.out.println("Voter Eligible :"+ i);
        }else{
            throw new MyRunException();
        }
    }
}
