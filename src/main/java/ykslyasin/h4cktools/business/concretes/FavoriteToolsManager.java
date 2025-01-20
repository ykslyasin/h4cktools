package ykslyasin.h4cktools.business.concretes;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ykslyasin.h4cktools.business.abstracts.FavoriteToolsService;
import ykslyasin.h4cktools.core.entities.User;
import ykslyasin.h4cktools.core.utilities.results.DataResult;
import ykslyasin.h4cktools.core.utilities.results.Result;
import ykslyasin.h4cktools.core.utilities.results.SuccessDataResult;
import ykslyasin.h4cktools.core.utilities.results.SuccessResult;
import ykslyasin.h4cktools.dataAccess.FavoriteToolsDao;
import ykslyasin.h4cktools.dataAccess.ToolsDao;
import ykslyasin.h4cktools.entities.concretes.Categories;
import ykslyasin.h4cktools.entities.concretes.FavoriteTools;
import ykslyasin.h4cktools.entities.concretes.Tools;

@Service
public class FavoriteToolsManager implements FavoriteToolsService{

	private FavoriteToolsDao favoriteToolsDao;
	
	@Autowired
	public FavoriteToolsManager(FavoriteToolsDao favoriteToolsDao) {
		super();
		this.favoriteToolsDao = favoriteToolsDao;
	}
	
	@Override
	public DataResult<List<FavoriteTools>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<FavoriteTools>>
		(this.favoriteToolsDao.findAll(), "Data listelendi." );
	}

	@Override
	public Result add(FavoriteTools favoriteTools) {
		this.favoriteToolsDao.save(favoriteTools);
		return new SuccessResult("Tool eklendi.");
	}

	@Override
	public DataResult<FavoriteTools> getByFavoriteToolsName(String favoriteToolsName) {
		return new SuccessDataResult<FavoriteTools>
		(this.favoriteToolsDao.getByFavoriteToolsName(favoriteToolsName), "Data getirildi.");
	}

	@Override
	public DataResult<FavoriteTools> getByFavoriteToolsId(int favoriteToolsId) {
		return new SuccessDataResult<FavoriteTools>
		(this.favoriteToolsDao.getByFavoriteToolsId(favoriteToolsId), "Data getirildi.");
	}

	/*@Override
	public Set<FavoriteTools> getFavoriteToolsByUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }

        // Repository'deki metodu çağır ve sonucu döndür
        return favoriteToolsDao.findByUsers(user);
	}*/

}
