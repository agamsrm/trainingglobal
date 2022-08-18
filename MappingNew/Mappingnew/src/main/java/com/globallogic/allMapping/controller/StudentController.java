package com.globallogic.allMapping.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.allMapping.entity.AddressEntity;
import com.globallogic.allMapping.entity.RegisterEntity;
import com.globallogic.allMapping.entity.StudentEntity;
import com.globallogic.allMapping.entity.TeacherEntity;
import com.globallogic.allMapping.repo.AddressRepo;
import com.globallogic.allMapping.repo.RegisterRepo;
import com.globallogic.allMapping.repo.StudentRepo;
import com.globallogic.allMapping.repo.TeacherRepo;


@RestController
@RequestMapping("/map")
public class StudentController {
	
	@Autowired
	StudentRepo srepo;
	
	@Autowired
	AddressRepo arepo;

	@Autowired
	TeacherRepo trepo;

	@Autowired
    RegisterRepo rrepo;
	
	@GetMapping("/")
	public List<StudentEntity> showstudent()
	{
		return srepo.findAll();
	}

	@PostMapping("/")
	public StudentEntity saveStudent(@RequestBody StudentEntity  ad)
	{
		System.err.println(ad);
		srepo.save(ad);
		System.err.println(ad);
		return ad;
	}
    @PutMapping("/")
    public StudentEntity updateStudent(@RequestBody StudentEntity  ad)
	{
		System.err.println(ad);
		srepo.save(ad);
		System.err.println(ad);
		return ad;
	}
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable("id") long id)
	{
    	System.err.println("deleted id is : "+id);
		srepo.deleteById(id);
		return "Record Has been deleted!";
	}
    

}
