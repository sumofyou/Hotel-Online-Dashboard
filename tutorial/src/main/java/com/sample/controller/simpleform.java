package com.sample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.dto.User;
import com.sample.dto.UserListDTO;


@Controller
@RequestMapping("/form")
public class simpleform {
	
	public void formPage() {
		System.out.println("hiiii");
	}

	/*@RequestMapping(value = "/records")
	public @ResponseBody
	UserListDTO getUsers() {
		UserListDTO userListDTO = new UserListDTO();
		List<User> users = new ArrayList<User>();
		User user = new User();
		user.setUsername("ashoksaravanan");
		user.setFirstName("Ashok");
		user.setLastName("Saravanan");
		users.add(user);
		userListDTO.setUsers(users);
		return userListDTO;
	}*/
}