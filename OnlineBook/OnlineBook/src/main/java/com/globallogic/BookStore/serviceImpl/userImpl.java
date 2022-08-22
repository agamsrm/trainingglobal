package com.globallogic.BookStore.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.BookStore.entity.user;
import com.globallogic.BookStore.repo.UserRepo;
import com.globallogic.BookStore.service.userser;

@Component
class userImpl implements userser{
@Autowired
UserRepo usre;



	@Override
	public String use(user s) {
		// TODO Auto-generated method stub
		usre.save(s);
		return "Data Added";
	}

	@Override
	public List<user> showdet() {
		// TODO Auto-generated method stub
		return usre.findAll();
	}

	@Override
	public String update(user s) {
		// TODO Auto-generated method stub
		usre.save(s);
		return "Data Updated";
	}

	@Override
	public String delete(long id) {
		// TODO Auto-generated method stub
		usre.deleteById(id);
		return "Data Deleted";
	}

}
