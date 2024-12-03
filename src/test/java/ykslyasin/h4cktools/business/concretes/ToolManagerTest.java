package ykslyasin.h4cktools.business.concretes;

import static org.junit.jupiter.api.Assertions.*;


import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import ykslyasin.h4cktools.business.concretes.ToolsManager;
import ykslyasin.h4cktools.core.utilities.results.DataResult;
import ykslyasin.h4cktools.core.utilities.results.Result;
import ykslyasin.h4cktools.dataAccess.ToolsDao;
import ykslyasin.h4cktools.entities.concretes.Categories;

@ExtendWith(MockitoExtension.class)
class ToolManagerTest {

	 	@Mock
	    private ToolsDao toolsDao;

	    @InjectMocks
	    private ToolsManager toolsManager;
/*
	   @Test
	    public void testAdd() {

		    Categories toolCategory = new Categories(1, "Animals");
	        Tools toolToAdd = new Tools(1, "birds1", "0:15", toolCategory, "mp3", 4.99, "yasin");


	        when(toolsDao.save(any(Tools.class))).thenReturn(toolToAdd);


	        Result result = toolsManager.add(toolToAdd);


	        assertEquals(true, result.isSuccess());
	    }
	    
	    @Test
	    public void testGetAll() {

	        List<Tools> mockTools = new ArrayList<>();
	        Categories toolCategory = new Categories(1, "Animals");
	        mockTools.add(new Tools(1, "birds1", "0:15", toolCategory, "mp3", 4.99, "yasin"));


	        when(toolsDao.findAll()).thenReturn(mockTools);


	        DataResult<List<Tools>> result = toolsManager.getAll();


	        assertEquals(mockTools.size(), result.getData().size());
	    }
	
	    @Test
	    public void testGetToolsByToolsName() {
	    	
	        String toolName = "TestToolName";
	        Categories ToolsCategory = new Categories(1, "Animals");
	        Tools mockTools = new Tools(1, "birds1", "0:15", toolCategory, "mp3", 4.99, "yasin");


	        when(toolsDao.getByToolName(toolName)).thenReturn(mockTools);


	        DataResult<Tools> result = toolsManager.getByToolName(toolName);

	        
	        assertEquals(mockTools, result.getData());

	    }
	    
	   @Test
	    public void testGetRingtoneByToolsCategory() {
	    	
	        Categories toolCategory = new Categories(1, "Animals");
	        Tools mockTools = new Tools(1, "birds1", "0:15", toolCategory, "mp3", 4.99, "yasin");


	        when(toolsDao.getByToolsCategory(toolCategory)).thenReturn(mockTools);


	        DataResult<Tools> result = toolsManager.getByToolCategory(toolCategory);

	        
	        assertEquals(mockTools, result.getData());

	    }
	    
	    @Test
	    public void testGetToolsById() {
	    	
	        int ringtoneId = 5;
	        Categories toolCategory = new Categories(1, "Animals");
	        Tools mockTools = new Tools(1, "birds1", "0:15", toolCategory, "mp3", 4.99, "yasin");


	        when(toolsDao.getById(toolId)).thenReturn(mockTools);


	        DataResult<Tools> result = toolsManager.getById(toolId);

	        
	        assertEquals(mockTools, result.getData());

	    }
*/
}
