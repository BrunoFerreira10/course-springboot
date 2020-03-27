package com.mun.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mun.course.entities.User;
import com.mun.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> optionalEntity = repository.findById(id);
		return optionalEntity.get();
	}

	public User insert(User entity) {
		return repository.save(entity);
	}
}
