package com.arthurvinicius.mongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthurvinicius.mongo.domain.User;
import com.arthurvinicius.mongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User>findAll(){
		return repo.findAll();
	}
}
