package ykslyasin.h4cktools.core.dataAccess;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import ykslyasin.h4cktools.core.entities.User;
import ykslyasin.h4cktools.entities.concretes.FavoriteTools;

public interface UserDao extends JpaRepository<User, Integer>{

	User findByEmail(String email);
	
	User getByEmail(String email);
	
	List<User>getByuserName(String username);
	
	List<User> getByPassword(String password);
	
	User findByuserNameAndPassword(String userName, String password);
	
   // Set<FavoriteTools> findFavoriteToolsById(int userId);

}

