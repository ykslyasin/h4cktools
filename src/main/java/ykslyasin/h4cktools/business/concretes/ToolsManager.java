package ykslyasin.h4cktools.business.concretes;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ykslyasin.h4cktools.business.abstracts.ToolsService;
import ykslyasin.h4cktools.core.utilities.results.DataResult;
import ykslyasin.h4cktools.core.utilities.results.Result;
import ykslyasin.h4cktools.core.utilities.results.SuccessDataResult;
import ykslyasin.h4cktools.core.utilities.results.SuccessResult;
import ykslyasin.h4cktools.dataAccess.ToolsDao;
import ykslyasin.h4cktools.entities.concretes.Categories;
import ykslyasin.h4cktools.entities.concretes.Tools;

@Service
public class ToolsManager implements ToolsService{

	private ToolsDao toolsDao;
	
	@Autowired
	public ToolsManager(ToolsDao toolsDao) {
		super();
		this.toolsDao = toolsDao;
	}

	@Override
	public DataResult<List<Tools>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Tools>>
		(this.toolsDao.findAll(), "Data listelendi." );
				
	}

	@Override
	public Result add(Tools tools) {
		this.toolsDao.save(tools);
		return new SuccessResult("Tool eklendi.");
	}

	@Override
	public DataResult<Tools> getByToolName(String toolName) {
		
		return new SuccessDataResult<Tools>
		(this.toolsDao.getByToolName(toolName), "Data getirildi.");
	}

	@Override
	public DataResult<Tools> getByToolId(int toolId) {
		return new SuccessDataResult<Tools>
		(this.toolsDao.getByToolId(toolId), "Data getirildi.");
	}

	@Override
	public DataResult<Tools> getByToolCategory(Categories toolCategory) {
		
		return new SuccessDataResult<Tools>
		(this.toolsDao.getByToolCategory(toolCategory), "Data getirildi.");
	}

	/*@Override
	public List<Tools> getAll() {
		return this.toolsDao.findAll();
	}*/



}
