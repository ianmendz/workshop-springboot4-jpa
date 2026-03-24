package com.portfolio.system.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.system.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {
	
	@GetMapping
	public ResponseEntity<User> findeAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "61999676767", "12345");
		return ResponseEntity.ok().body(u);
	}

}
