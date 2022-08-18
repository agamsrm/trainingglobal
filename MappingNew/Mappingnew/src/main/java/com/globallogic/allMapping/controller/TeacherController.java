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

import com.globallogic.allMapping.entity.TeacherEntity;
import com.globallogic.allMapping.repo.TeacherRepo;

@RestController
@RequestMapping("/t")
public class TeacherController {
	@Autowired
	TeacherRepo repo;
	@GetMapping("/")
	public List<TeacherEntity> showTeacher()
	{
		return repo.findAll();
	}
	@PostMapping("/")
	public List<TeacherEntity> saveTeacher(@RequestBody TeacherEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return repo.findAll();
	}
    @PutMapping("/")
    public TeacherEntity updateTeacher(@RequestBody TeacherEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return ad;
	}
    @DeleteMapping("/{id}")
    public String deleteTeacher(@PathVariable("id") long id)
	{
    	System.err.println("deleted id is : "+id);
		repo.deleteById(id);
		return "Record Has been deleted!";
	}
    

}
