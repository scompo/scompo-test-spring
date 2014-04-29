package org.scompo.testspring.controllers;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/home")
public class MainController{

	@ResponseBody
	@RequestMapping(value = "/greet")	
	public String greeter(){
		return "Hello World!";
	}
}