package com.alana.jersey.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.NotFoundException;

import com.alana.jersey.model.User;

public class UserService {
	private List<User> users = new ArrayList<User>();
	
	public List<User> fetchAll() {
		users.add(new User(100, "alana", "alana@gmail.com"));
		users.add(new User(101, "joshua", "joshua@gmail.com"));
		users.add(new User(102, "victor", "victor@gmail.com"));
		users.add(new User(103, "bose", "bose@gmail.com"));
		users.add(new User(104, "a", "a@gmail.com"));
		users.add(new User(105, "alauwa", "ana@gmail.com"));
		users.add(new User(106, "na", "na@gmail.com"));
		users.add(new User(107, "meand", "meand@gmail.com"));
		users.add(new User(108, "alana", "youandme@gmail.com"));
		return users;
	}
	
	public User fetchBy(long id) throws NotFoundException {
		for (User user2 : fetchAll()) {
			if (id == user2.getId()) {
				return user2;
			} else {
				throw new NotFoundException("Resource not found with Id :: " + id);
			}
		}
		return null;
	}
	
	public void create(User user) {
		users.add(user);
	}
	
	public void update(User user) {
		for (User user2 : users) {
			if (user.getId() == user2.getId()) {
				users.remove(user2);
				users.add(user);
			}
		}
	}
	
	public void delete(long id) throws NotFoundException {
		
	}
		
	}
