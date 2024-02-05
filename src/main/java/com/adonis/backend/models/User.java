package com.adonis.backend.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="app_user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Size(min=2, max=200)
	private String name;
	@Size(min=10, max=200)
	@Pattern(regexp=".+@.+\\..+")
	private String email;
	@Size(min=2, max=40)
	private String username;
	@Size(min=8, max=200)
	@Pattern(regexp="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}$")
	private String password;
	@NotEmpty
	private String image;
	@OneToMany
	private Set<Post> posts;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Set<Post> getPosts() {
		return posts;
	}
	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}
	public Long getId() {
		return id;
	}
	public User(String name,
			@Size(min = 10, max = 200) @Pattern(regexp = ".+@.+\\..+") String email,
			@Size(min = 2, max = 40) String username,
			@Size(min = 8, max = 200) @Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}$") String password,
			@NotEmpty String image) {
		super();
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
		this.image = image;
	}
	public User() {
		super();
	}
	
	
	
}
