package com.globallogic.BookStore.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.globallogic.BookStore.entity.admin;
import com.globallogic.BookStore.repo.AdminRepo;
import com.globallogic.BookStore.service.adminser;


@Component
public class adminImpl implements adminser {
	@Autowired
	AdminRepo adr;
	@Autowired
	

	@Override
	public String admi(admin s) {
		// TODO Auto-generated method stub
		adr.save(s);
		return "Data Admin Added";
	}

	@Override
	public List<admin> showdet() {
		// TODO Auto-generated method stub
		return adr.findAll();
	}

	@Override
	public String update(admin s) {
		// TODO Auto-generated method stub
		adr.save(s);
		return "Data Admin updated";
	}

	@Override
	public String delete(long id) {
		// TODO Auto-generated method stub
		adr.deleteById(id);
		return "Data deleted of admin";
	}

	@Override
	public String sucessSignin(long id, String email, String pass) {
		// TODO Auto-generated method stub
		return null;
	}


	}

