/**
 * 
 */
package com.cg.hotel.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

/**
 * @author sarika
 *
 */
@ControllerAdvice
@RestController
public class ExceptionMessages {
	

	@ExceptionHandler(Exceptionhandler.class)
	public ResponseEntity<ErrorResponses> errorHandle(Exceptionhandler ex,WebRequest request){
		
		ErrorResponses details= new ErrorResponses(ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<>(details,HttpStatus.BAD_REQUEST);
		
	}

}


