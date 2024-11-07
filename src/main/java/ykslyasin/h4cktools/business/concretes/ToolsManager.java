package ykslyasin.h4cktools.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ykslyasin.h4cktools.business.abstracts.ToolsService;
import ykslyasin.h4cktools.core.utilities.results.DataResult;
import ykslyasin.h4cktools.core.utilities.results.Result;
import ykslyasin.h4cktools.core.utilities.results.SuccessDataResult;
import ykslyasin.h4cktools.core.utilities.results.SuccessResult;
import ykslyasin.h4cktools.dataAccess.ToolDao;
import ykslyasin.h4cktools.entities.concretes.Categories;
import ykslyasin.h4cktools.entities.concretes.Tools;

@Service
public class ToolsManager implements ToolsService{

	private ToolDao toolDao;
	
	@Autowired
	public ToolsManager(ToolDao toolDao) {
		super();
		this.toolDao = toolDao;
	}

	@Override
	public DataResult<List<Tools>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Tools>>
		(this.toolDao.findAll(), "Data listelendi." );
				
	}

	@Override
	public Result add(Tools tools) {
		this.toolDao.save(tools);
		return new SuccessResult("Zil sesi eklendi.");
	}

	@Override
	public DataResult<Tools> getByToolName(String toolName) {
		
		return new SuccessDataResult<Tools>
		(this.toolDao.getByToolName(toolName), "Data getirildi.");
	}

	@Override
	public DataResult<Tools> getById(int toolId) {
		return new SuccessDataResult<Tools>
		(this.toolDao.getById(toolId), "Data getirildi.");
	}

	@Override
	public DataResult<Tools> getByToolCategory(Categories toolCategory) {
		
		return new SuccessDataResult<Tools>
		(this.toolDao.getByToolCategory(toolCategory), "Data getirildi.");
	}

	/*@Override
	public List<Ringtone> getAll() {
		return this.ringtoneDao.findAll();
	}*/



}
