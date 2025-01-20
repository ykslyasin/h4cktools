package ykslyasin.h4cktools.dataAccess;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import ykslyasin.h4cktools.core.entities.User;
import ykslyasin.h4cktools.entities.concretes.FavoriteTools;


public interface FavoriteToolsDao extends JpaRepository<FavoriteTools, Integer>{

	FavoriteTools getByFavoriteToolsName(String favoriteToolsName);
		
	FavoriteTools getByFavoriteToolsId(int favoriteToolsId);
	
    //Set<FavoriteTools> findByUsers(User User);
}
