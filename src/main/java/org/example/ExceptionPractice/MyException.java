package org.example.ExceptionPractice;

public class MyException extends Exception {

    public MyException() {
        super("MyException");
    }

    public MyException(String s) {
        super(s);
    }
}
