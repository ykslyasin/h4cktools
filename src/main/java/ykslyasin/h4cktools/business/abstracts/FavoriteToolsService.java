package ykslyasin.h4cktools.business.abstracts;

import java.util.List;
import java.util.Set;

import ykslyasin.h4cktools.core.entities.User;
import ykslyasin.h4cktools.core.utilities.results.DataResult;
import ykslyasin.h4cktools.core.utilities.results.Result;
import ykslyasin.h4cktools.entities.concretes.Categories;
import ykslyasin.h4cktools.entities.concretes.FavoriteTools;
import ykslyasin.h4cktools.entities.concretes.Tools;


public interface FavoriteToolsService {

	DataResult<List<FavoriteTools>> getAll();
	
	Result add(FavoriteTools favoriteTools);
	
	DataResult<FavoriteTools> getByFavoriteToolsName(String favoriteToolsName);
	
	DataResult<FavoriteTools> getByFavoriteToolsId(int favoriteToolsId);
	
	//Set<FavoriteTools> getFavoriteToolsByUser(User user);
	
	
}
