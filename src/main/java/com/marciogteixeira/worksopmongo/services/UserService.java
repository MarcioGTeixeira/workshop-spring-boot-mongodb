package com.marciogteixeira.worksopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marciogteixeira.worksopmongo.domain.User;
import com.marciogteixeira.worksopmongo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	public List<User>findAll(){
      return repo.findAll();
	}
}
