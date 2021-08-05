package com.davidweb.service;


import java.util.List;

import com.davidweb.entity.User;

public interface IUserService {
	
	public User save (User user);
	
	public List<User> getAll();
}
