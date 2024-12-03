package ykslyasin.h4cktools.business.abstracts;

import java.util.List;


import ykslyasin.h4cktools.core.utilities.results.DataResult;
import ykslyasin.h4cktools.core.utilities.results.Result;
import ykslyasin.h4cktools.entities.concretes.Categories;
import ykslyasin.h4cktools.entities.concretes.Tools;


public interface ToolsService {

	DataResult<List<Tools>> getAll();
	
	Result add(Tools tools);
	
	DataResult<Tools> getByToolName(String toolName);
	
	DataResult<Tools> getByToolId(int toolId);
	
	DataResult<Tools> getByToolCategory(Categories toolCategory);
	
	/*List<Ringtone> getAll();*/
	
}
