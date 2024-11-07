package ykslyasin.h4cktools.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;


import ykslyasin.h4cktools.entities.concretes.Categories;
import ykslyasin.h4cktools.entities.concretes.Tools;


public interface ToolDao extends JpaRepository<Tools, Integer>{

	Tools getByToolName(String toolName);
	
	Tools getByToolCategory(Categories toolCategory);
	
	Tools getById(int toolId);
}
