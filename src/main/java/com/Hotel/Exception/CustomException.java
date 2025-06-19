package com.Hotel.Exception;

public class CustomException extends RuntimeException{
    public CustomException() {
        super();
    }
    public CustomException(String msg) {
        super(msg);
    }
}
