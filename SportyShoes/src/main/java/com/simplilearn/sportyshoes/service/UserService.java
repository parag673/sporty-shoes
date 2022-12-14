package com.simplilearn.sportyshoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.sportyshoes.entity.UserEntity;
import com.simplilearn.sportyshoes.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	public UserEntity addUser(UserEntity user) {
		return repo.save(user);
	}
	
	public List<UserEntity> getAllUsers(){
		return repo.findAll();
	}
	
	public UserEntity getUserById(int uid) {
		if(repo.findById(uid).isPresent())
			return repo.findById(uid).get();
		else
			return null;
	}

}
