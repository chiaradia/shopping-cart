package com.chiaradia.shoppingcart.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class EntityNotFoundException extends RuntimeException
{
    public EntityNotFoundException (String message){
        super(message);
    }

    public EntityNotFoundException (String message, Throwable cause){
        super(message, cause);
    }
}
