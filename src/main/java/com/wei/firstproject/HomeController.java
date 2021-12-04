package com.wei.firstproject;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RestController
//@RequestMapping("/hello")
public class HomeController {
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("fruit", "banana");
		
		String firstName = "Ada";
		String lastName = "Lovelace";
		String email = "ones@zeroes.com";
		Integer age = 160;
		
		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
		model.addAttribute("email", email);
		model.addAttribute("age", age);
		
		
		
		return "index.jsp";
		

	}
	@RequestMapping("/dojos")
	public String indexDojo(Model model) {
		ArrayList<String> dojos = new ArrayList<String>();
		
		dojos.add("Brubank");
		dojos.add("Chicago");
		dojos.add("Bellevue");
		
		model.addAttribute("dojosList", dojos);
		return "index.jsp";
	}
//	// function(annotation(query field, required=false)  String input)
//	public String index(
//			@RequestParam(value="q", required=false) String searchQuery
//			) 
//	{
//		if (searchQuery == null) {
//			return "You searched for: nothing";			
//		} else {
//			return "You searched for: " + searchQuery;			
//			
//		}
//	}
//	
//	@RequestMapping("/m/{track}/{module}/{lesson}")
//	public String showLesson(
//			// part of url as we set in request mapping
//			@PathVariable("track") String track,
//			@PathVariable("module") String module,
//			@PathVariable("lesson") String lesson
//			)
//	{
//		return track + " " + module + " " + lesson;
//	}
	
//	@RequestMapping("")
//	public String hello() {
//		return "Hello Worlqwed";
//	}
//	
//	@RequestMapping("/world")
//	public String world() {
//		return "Class level annotations are cool too!";
//	}
}