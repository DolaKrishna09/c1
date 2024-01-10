package com.app.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.Service.FileService;
import com.app.Service.ModuleService;
import com.app.Service.VideoService;
import com.app.dao.ModulesRepository;
import com.app.dao.VideoRepository;
import com.app.dtos.FileModel;
import com.app.entity.Modules;
import com.app.entity.Video;

import jakarta.servlet.http.HttpServletResponse;

@CrossOrigin(value="http://localhost:3000")
@RestController
@RequestMapping("/module")
public class ModuleController {

	@Autowired
    ModuleService moduleservice;
	
	
	@GetMapping("/getAllModules")
	public List<Modules> getallModules(){
		return moduleservice.getAllModules();
	}
	  	
	   
	
	

}
