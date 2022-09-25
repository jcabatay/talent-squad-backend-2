package com.ascii274.talentsquad2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Job Not Found")
public class JobNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public JobNotFoundException(String message){
        super(message);
    }
}
