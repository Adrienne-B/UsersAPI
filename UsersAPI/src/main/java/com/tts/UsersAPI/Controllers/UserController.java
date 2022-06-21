package com.tts.UsersAPI.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tts.UsersAPI.Models.User;
import com.tts.UsersAPI.Repositories.UserRespository;

@RestController
public class UserController {
	
	@Autowired //Is initializing the class ..so no need to create an constructor
	private UserRespository repository;
	
	@GetMapping("/users")
	public List<User> getUsers(){
	return (List<User>) repository.findAll();
	}

}
