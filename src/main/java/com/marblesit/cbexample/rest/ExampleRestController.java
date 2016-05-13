package com.marblesit.cbexample.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleRestController {

	@RequestMapping(path="/member/{id}", method=RequestMethod.GET)
	public @ResponseBody String getMemeber(@PathVariable long id) {
		return "Hello";
	}
}
