package ykslyasin.h4cktools.business.abstracts;

import java.util.List;
import java.util.Set;
import ykslyasin.h4cktools.core.entities.User;
import ykslyasin.h4cktools.core.utilities.results.DataResult;
import ykslyasin.h4cktools.core.utilities.results.Result;
import ykslyasin.h4cktools.entities.concretes.FavoriteTools;

public interface UserService {

	Result add(User user);
	
	/*Result findByEmail(String email);*/
	
	Result findByUsernameAndPassword(String username, String password);
	
	Result registration(User user);
	
	/*Result checkUserWithMail(String email);*/
	
	DataResult<List<User>> getAll();
	
	DataResult<User> loginAuth(String username, String password);
	
   // Set<FavoriteTools> getFavoriteToolsById(int userId);

	
}
