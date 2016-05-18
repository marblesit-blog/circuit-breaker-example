package com.marblesit.cbexample.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.marblesit.cbexample.service.User;
import com.marblesit.cbexample.service.UserService;

@RestController
public class ExampleRestController {

	@Autowired
	private UserService userService;

	@RequestMapping(path="/users", method=RequestMethod.GET)
	public @ResponseBody Collection<User> getUsers() {
		return userService.getAllUsers();
	}
}
