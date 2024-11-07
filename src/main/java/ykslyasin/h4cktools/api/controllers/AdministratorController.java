package ykslyasin.h4cktools.api.controllers;

import java.util.HashMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ykslyasin.h4cktools.business.abstracts.AdministratorService;
import ykslyasin.h4cktools.core.entities.Administrator;
import ykslyasin.h4cktools.core.entities.User;
import ykslyasin.h4cktools.core.utilities.results.ErrorDataResult;
import ykslyasin.h4cktools.core.utilities.results.Result;
import ykslyasin.h4cktools.entities.concretes.Tools;

@RestController
@RequestMapping("/api/administrators")
@CrossOrigin
public class AdministratorController {

	private AdministratorService administratorService;
	
	@Autowired
	public AdministratorController(AdministratorService administratorService) {
		super();
		this.administratorService = administratorService;
	}
	
	@PostMapping("/addAdmin")
	public Result add(@RequestBody Administrator administrator) {
		
		return this.administratorService.add(administrator);
	}
	
	@PostMapping("/addTool")
	public Result add(@RequestBody Tools tools) {
		
		return this.administratorService.add(tools);
	}
	
	@PostMapping("/addUser")
	public Result add(@RequestBody User user) {
		
		return this.administratorService.add(user);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException
	(MethodArgumentNotValidException exceptions){
		
		Map<String,String> validationErrors = new HashMap<String,String>();
		
		for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
			
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());	
		}
		
		ErrorDataResult<Object> errors 
		= new ErrorDataResult<Object>(validationErrors, "Doğrulama hataları");
		return errors;
	}
	
	
}
