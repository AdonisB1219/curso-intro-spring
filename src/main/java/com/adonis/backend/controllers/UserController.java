package com.adonis.backend.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adonis.backend.models.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@GetMapping
	public List<User> getAllUsers(){
		return List.of(
				new User(
						"Juan Pérez",
						"Juan123",
						"Pa$$word1",
						"juanito@gmail.com",
						"image.png"
				), new User(
						"josé Pérez",
						"José123",
						"Pa$$word1",
						"jose@gmail.com",
						"image.png")
				);
	}
}
