package ykslyasin.h4cktools.business.abstracts;

import java.util.List;
import ykslyasin.h4cktools.core.utilities.results.DataResult;
import ykslyasin.h4cktools.core.utilities.results.Result;
import ykslyasin.h4cktools.entities.concretes.Categories;
import ykslyasin.h4cktools.entities.concretes.Tools;


public interface CategorieService {

	/*List<Categories> getAll();*/
	
	DataResult<List<Categories>> getAll();
	
	//DataResult<Categories> getByCategoryTechnique(String categoryTechnique);
	
	Result add(Categories categories);
	
	DataResult<Categories> getByCategoryId(int categoryId);
	
	DataResult<Categories> getByCategoryName(String categoryName);

	DataResult<Categories> getByCategoryTechnique(String categoryTechnique);

}
