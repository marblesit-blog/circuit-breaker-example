package com.marblesit.cbexample.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.marblesit.cbexample.dao.UserRepository;

@RestController
public class ExampleRestController {

	@Autowired
	UserRepository repo;

	@RequestMapping(path="/member/{id}", method=RequestMethod.GET)
	public @ResponseBody String getMemeber(@PathVariable long id) {
		repo.findAll().forEach(user -> System.out.println(user));
		return "Hello";
	}
}
