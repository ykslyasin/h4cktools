package ykslyasin.h4cktools.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import ykslyasin.h4cktools.entities.concretes.Categories;
import ykslyasin.h4cktools.entities.concretes.Tools;

public interface CategorieDao extends JpaRepository<Categories, Integer>{

	//Categories getByCategoryTechnique(String categoryTechnique);
	
	Categories getByCategoryId(int categoryId);
	
	Categories getByCategoryName(String categoryName);
	
	Categories getByCategoryTechnique(String categoryTechnique);



}