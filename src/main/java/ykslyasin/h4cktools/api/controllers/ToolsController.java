package ykslyasin.h4cktools.api.controllers;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ykslyasin.h4cktools.business.abstracts.ToolsService;
import ykslyasin.h4cktools.core.utilities.results.DataResult;
import ykslyasin.h4cktools.core.utilities.results.ErrorDataResult;
import ykslyasin.h4cktools.core.utilities.results.Result;
import ykslyasin.h4cktools.entities.concretes.Tools;

@RestController
@RequestMapping("/api/tools")
@CrossOrigin
public class ToolsController {

	private ToolsService toolsService;
	
	@Autowired
	public ToolsController(ToolsService toolsService) {
		super();
		this.toolsService = toolsService;
	}

	@GetMapping("/getall")
	public DataResult<List<Tools>> getAll() {
		return this.toolsService.getAll();
	}
	
	/*@GetMapping("/getall")
	public List<Ringtone> getAll() {
		return this.ringtoneService.getAll();
	}*/
	
	@PostMapping("/add")
	public Result add(@RequestBody Tools tools) {
		
		return this.toolsService.add(tools);
	}
	
	@GetMapping("/getByToolName")
	public DataResult<Tools> getByToolName(@RequestParam String toolName){
		
		return this.toolsService.getByToolName(toolName);
	}
	
	@GetMapping("/getById")
	public DataResult<Tools> getByToolId(@RequestParam int toolId){
		
		return this.toolsService.getByToolId(toolId);
	}
	
	/*@GetMapping("/getByRingtoneCategory")
	public DataResult<Ringtone> getByRingtoneCategory(@RequestParam String ringtoneCategory){
		
		return this.ringtoneService.getByRingtoneCategory(ringtoneCategory);
	}*/
	
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
