package com.luv2code.springdemo.exception;

public class CustomerNotFoundException extends RuntimeException{

	public CustomerNotFoundException(String message) {
        super(message);
    }
}
