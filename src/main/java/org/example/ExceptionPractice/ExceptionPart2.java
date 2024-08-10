package org.example.ExceptionPractice;

class AnotherException extends Exception {

    AnotherException(){
        super("Age is below 18");
    }
}



public class ExceptionPart2 {
    public static void main(String[] args) throws AnotherException {

//        try{
           vote(12);
//        }catch(Exception e){
//            System.out.println(e);
//        }
    }

    private static void vote(int i) throws AnotherException {
        if(i>=18){
            System.out.println("Voter Eligible :"+ i);
        }else{
            throw new AnotherException();
        }
    }
}
