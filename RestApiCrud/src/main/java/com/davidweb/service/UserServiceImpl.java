package com.davidweb.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidweb.dao.UserRepository;
import com.davidweb.entity.User;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userrep;


	@Override
	public User save(User user) {
	return userrep.save(user);
	}


	@Override
	public List<User> getAll() {
		return userrep.findAll();
	}



}
