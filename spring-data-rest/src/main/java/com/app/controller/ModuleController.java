package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Service.ModuleService;
import com.app.dao.ModulesRepository;
import com.app.entity.ModuleEntity;

@CrossOrigin(value="http://localhost:3000")
@RestController
@RequestMapping("/module")
public class ModuleController {

	@Autowired
	ModulesRepository modulerepository;
	
	@GetMapping("/findall")
	public List<ModuleEntity> find(){
		return modulerepository.findAll();
	}

}
