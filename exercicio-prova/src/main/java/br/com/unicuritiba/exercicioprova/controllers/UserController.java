package br.com.unicuritiba.exercicioprova.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unicuritiba.exercicioprova.models.User;
import br.com.unicuritiba.exercicioprova.repositories.UserRepository;

@RestController
public class UserController {

	@Autowired
	UserRepository repository;
	
	@GetMapping("/clientes")
	public ResponseEntity<List<User>> getUser(){
		return ResponseEntity.ok(repository.findAll());	
	}
	
	@PostMapping("/clientes")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		User savedUser = repository.save(user);
		return ResponseEntity.ok(savedUser);
	}
}
