package com.chiaradia.shoppingcart.handler;

import com.chiaradia.shoppingcart.dto.exception.DefaultErrorDTO;
import com.chiaradia.shoppingcart.exception.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<DefaultErrorDTO> handleEntityNotFoundException(EntityNotFoundException e, HttpServletRequest request)
    {
        DefaultErrorDTO dto = new DefaultErrorDTO(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(),
            "Not found", e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(dto);
    }
}
