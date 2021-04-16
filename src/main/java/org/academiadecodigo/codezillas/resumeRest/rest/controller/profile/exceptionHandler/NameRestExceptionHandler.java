package org.academiadecodigo.codezillas.resumeRest.rest.controller.profile.exceptionHandler;

import org.academiadecodigo.codezillas.resumeRest.rest.controller.profile.errorResponse.NameErrorResponse;
import org.academiadecodigo.codezillas.resumeRest.rest.controller.profile.exeption.NameNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class NameRestExceptionHandler {

    // Add an exception handler for NameNotFoundException
    @ExceptionHandler
    public ResponseEntity<NameErrorResponse> handleException(NameNotFoundException exception) {

        // Create NameErrorResponse object
        NameErrorResponse error = new NameErrorResponse(
                HttpStatus.NOT_FOUND.value(), exception.getMessage(), System.currentTimeMillis());

        // Return ResponseEntity
        // First param is for the response body, second param is for the header
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    // Add another exception handler... to catch any exception (catch all)
    @ExceptionHandler
    public ResponseEntity<NameErrorResponse> handleException(Exception exception) {

        // Create NameErrorResponse object
        NameErrorResponse error = new NameErrorResponse(
                HttpStatus.BAD_REQUEST.value(), exception.getMessage(), System.currentTimeMillis());

        // Return ResponseEntity
        // First param is for the response body, second param is for the header
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
