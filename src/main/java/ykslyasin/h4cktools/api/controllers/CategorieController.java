package ykslyasin.h4cktools.api.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ykslyasin.h4cktools.business.abstracts.CategorieService;
import ykslyasin.h4cktools.core.utilities.results.DataResult;
import ykslyasin.h4cktools.core.utilities.results.Result;
import ykslyasin.h4cktools.entities.concretes.Categories;
import ykslyasin.h4cktools.entities.concretes.Tools;


@RestController
@RequestMapping("/api/categories")
@CrossOrigin(origins = "http://localhost:3000")
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
	
	@GetMapping("/getById")
	public DataResult<Categories> getByCategoryId(@RequestParam int categoryId){
		
		return this.categorieService.getByCategoryId(categoryId);
	}
	
	@GetMapping("/getByCategoryName")
	public DataResult<Categories> getByCategoryName(@RequestParam String categoryName){
		
		return this.categorieService.getByCategoryName(categoryName);
	}
	
	@GetMapping("/getByCategoryTechnique")
	public DataResult<Categories> getByCategoryTechnique(@RequestParam String categoryTechnique){
		
		return this.categorieService.getByCategoryTechnique(categoryTechnique);
	}
}
