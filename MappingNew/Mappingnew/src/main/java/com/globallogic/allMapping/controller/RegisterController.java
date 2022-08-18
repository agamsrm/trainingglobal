package com.globallogic.allMapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.allMapping.entity.RegisterEntity;
import com.globallogic.allMapping.repo.RegisterRepo;

@RestController
@RequestMapping("/reg")
public class RegisterController {
	@Autowired
	RegisterRepo repo;
	@GetMapping("/")
	public List<RegisterEntity> showRegister()
	{
		return repo.findAll();
	}
	@PostMapping("/")
	public List<RegisterEntity> saveRegister(@RequestBody RegisterEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return repo.findAll();
	}
    @PutMapping("/")
    public RegisterEntity updateRegister(@RequestBody RegisterEntity  ad)
	{
		
		repo.save(ad);
		System.err.println(ad);
		return ad;
	}
    @DeleteMapping("/{id}")
    public String deleteRegister(@PathVariable("id") long id)
	{
    	System.err.println("deleted id is : "+id);
		repo.deleteById(id);
		return "Record Has been deleted!";
	}
    

	
}
