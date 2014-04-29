package org.scompo.testspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/home")
public class MainController{

	private static final String GREET_STRING = "Hello %s!";

	/**
	 * @param name
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public String greeterByName(@RequestParam String name){
		return String.format(GREET_STRING, name);
	}
}