package ykslyasin.h4cktools.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ykslyasin.h4cktools.business.abstracts.CategorieService;
import ykslyasin.h4cktools.core.utilities.results.DataResult;
import ykslyasin.h4cktools.core.utilities.results.Result;
import ykslyasin.h4cktools.core.utilities.results.SuccessDataResult;
import ykslyasin.h4cktools.core.utilities.results.SuccessResult;
import ykslyasin.h4cktools.dataAccess.CategorieDao;
import ykslyasin.h4cktools.entities.concretes.Categories;


@Service
public class CategorieManager implements CategorieService{

	private CategorieDao categorieDao;
	
	@Autowired
	public CategorieManager(CategorieDao categorieDao) {
		super();
		this.categorieDao = categorieDao;
	}
	
	/*@Override
	public List<Categories> getAll() {
		
		return this.categorieDao.findAll();
	}*/
	
	@Override
	public DataResult<List<Categories>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Categories>>
		(this.categorieDao.findAll(), "Data listelendi." );
				
	}
	
	@Override
	public Result add(Categories categories) {
		this.categorieDao.save(categories);
		return new SuccessResult("Zil sesi eklendi.");
	}

}
