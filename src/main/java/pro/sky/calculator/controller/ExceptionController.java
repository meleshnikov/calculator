package pro.sky.calculator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import pro.sky.calculator.exceptions.DivisionByZeroException;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(DivisionByZeroException.class)
    public ResponseEntity<Object> divisionByZeroException(DivisionByZeroException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<Object> missingParameterException(MissingServletRequestParameterException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

}
