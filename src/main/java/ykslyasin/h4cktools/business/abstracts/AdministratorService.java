package ykslyasin.h4cktools.business.abstracts;

import ykslyasin.h4cktools.core.entities.Administrator;
import ykslyasin.h4cktools.core.entities.User;
import ykslyasin.h4cktools.core.utilities.results.Result;
import ykslyasin.h4cktools.entities.concretes.Ringtone;

public interface AdministratorService {

	Result add(Administrator administrator);
	
	Result add(Ringtone ringtone);
	
	Result add(User user);
	
}