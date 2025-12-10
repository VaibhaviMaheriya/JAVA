package com.sy.CustomExceptionAndValidation.Exception;

public class UserNotfoundException extends  RuntimeException{

    public UserNotfoundException(String message){
        super(message);
    }

}
