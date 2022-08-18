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

import com.globallogic.allMapping.entity.AddressEntity;
import com.globallogic.allMapping.repo.AddressRepo;

@RestController
@RequestMapping("/add")
public class AddressController {
	@Autowired
	AddressRepo repo;
	@GetMapping("/")
	public List<AddressEntity> showAddress()
	{
		return repo.findAll();
	}
	@PostMapping("/")
	public List<AddressEntity> saveAddress(@RequestBody AddressEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return repo.findAll();
	}
    @PutMapping("/")
    public AddressEntity updateAddress(@RequestBody AddressEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return ad;
	}
    @DeleteMapping("/{id}")
    public String deleteAddress(@PathVariable("id") long id)
	{
    	System.err.println("deleted id is : "+id);
		repo.deleteById(id);
		return "Record Has been deleted!";
	}
    

	

}
