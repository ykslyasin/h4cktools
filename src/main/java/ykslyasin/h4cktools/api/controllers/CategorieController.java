package ykslyasin.h4cktools.api.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ykslyasin.h4cktools.business.abstracts.CategorieService;
import ykslyasin.h4cktools.core.utilities.results.DataResult;
import ykslyasin.h4cktools.core.utilities.results.Result;
import ykslyasin.h4cktools.entities.concretes.Categories;


@RestController
@RequestMapping("/api/categories")
@CrossOrigin
public class CategorieController {

	private CategorieService categorieService;
	
	@Autowired
	public CategorieController(CategorieService categorieService) {
		super();
		this.categorieService = categorieService;
	}
	
	
	/*@GetMapping("/getall")
	public List<Categories> getAll() {
		return this.categorieService.getAll();
	}*/
	
	@GetMapping("/getall")
	public DataResult<List<Categories>> getAll() {
		return this.categorieService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Categories categories) {
		
		return this.categorieService.add(categories);
	}
}
