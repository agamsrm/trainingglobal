package com.globallogic.controller1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {
	@RequestMapping(value = "/gethome", method = RequestMethod.GET)
public String getHome() {
	System.out.println("Hi ! there how are you?");
	return "myhome";
}
	
}