package ykslyasin.h4cktools.business.abstracts;

import java.util.List;

import ykslyasin.h4cktools.core.utilities.results.DataResult;
import ykslyasin.h4cktools.core.utilities.results.Result;
import ykslyasin.h4cktools.entities.concretes.Categories;


public interface CategorieService {

	/*List<Categories> getAll();*/
	
	DataResult<List<Categories>> getAll();
	
	Result add(Categories categories);
}
