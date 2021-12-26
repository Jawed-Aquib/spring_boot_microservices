package com.in28minutes.microservices.currencyexchangeservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CurrencyExchangeExceptionHandler {

    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity handleException()
    {
       return new ResponseEntity("Conversion keys not found", HttpStatus.valueOf(404));
    }
}
