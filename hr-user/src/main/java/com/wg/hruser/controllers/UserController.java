package com.wg.hruser.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wg.hruser.entities.User;
import com.wg.hruser.repositories.UserRepository;


@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	
	@Autowired
	private UserRepository repository;
		
		
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){		
		User entity = repository.findById(id).get();		
		return ResponseEntity.ok(entity);
	}
	
	@GetMapping(value = "search")
	public ResponseEntity<User> findByEmail(@RequestParam String email){		
		User entity = repository.findByEmail(email);
		return ResponseEntity.ok(entity);
	}

}
