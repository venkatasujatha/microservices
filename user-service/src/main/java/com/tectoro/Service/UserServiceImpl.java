package com.tectoro.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tectoro.Model.User1;
import com.tectoro.Repo.UserRepository;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository repository;
	
	
	@Override
	public Object save(User1 user) {
		
		return repository.save(user);
	}

	@Override
	public User1 getUserWithDepartment(int uid) {
	
		
			return repository.findById(uid).get();
		
	}

}
