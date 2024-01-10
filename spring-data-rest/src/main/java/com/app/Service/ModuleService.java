package com.app.Service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.dao.ModulesRepository;
import com.app.entity.Modules;




@Service
public class ModuleService {

	@Autowired
	private ModulesRepository modulesRepository;
	
	
	
	
	public List<Modules> getAllModules(){
		return modulesRepository.findAll();
	}





	
	
	
	
	
	
	
	
	
	
	
	


}
