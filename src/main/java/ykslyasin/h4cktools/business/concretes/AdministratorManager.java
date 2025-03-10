package ykslyasin.h4cktools.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import ykslyasin.h4cktools.business.abstracts.AdministratorService;
import ykslyasin.h4cktools.core.dataAccess.AdministratorDao;
import ykslyasin.h4cktools.core.dataAccess.UserDao;
import ykslyasin.h4cktools.core.entities.Administrator;
import ykslyasin.h4cktools.core.entities.User;
import ykslyasin.h4cktools.core.utilities.results.Result;
import ykslyasin.h4cktools.core.utilities.results.SuccessResult;
import ykslyasin.h4cktools.dataAccess.ToolsDao;
import ykslyasin.h4cktools.entities.concretes.Tools;

@Service
public class AdministratorManager implements AdministratorService{

	private AdministratorDao administratorDao;
	private ToolsDao toolsDao;
	private UserDao userDao;
	
	@Autowired
	public AdministratorManager(AdministratorDao administratorDao, ToolsDao toolsDao, UserDao userDao) {
		super();
		this.administratorDao = administratorDao;
		this.toolsDao = toolsDao;
		this.userDao = userDao;
	}
	
	@Override
	public Result add(Administrator administrator) {
		// TODO Auto-generated method stub
		this.administratorDao.save(administrator);
		return new SuccessResult("Administrator eklendi.");
	}

	@Override
	public Result add(Tools tools) {
		this.toolsDao.save(tools);
		return new SuccessResult("Zil sesi eklendi.");
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı eklendi");
	}
	
	

}
