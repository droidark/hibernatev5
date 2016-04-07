package net.virux.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloWorldController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model){
		model.addAttribute("greeting","Hello World from Spring 4 MVC");
		return "welcome";
	}
	
	@RequestMapping(value = "/helloagain", method = RequestMethod.GET)
	public String sayHelloAgain(ModelMap model){
		model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
		return "welcome";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String sayHelloList(ModelMap model){
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("uno");
		lista.add("dos");
		lista.add("tres");
		model.addAttribute("greeting", lista);
		return "welcome";
	}
}
