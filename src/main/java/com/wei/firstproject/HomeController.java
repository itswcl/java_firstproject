package com.wei.firstproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RestController
//@RequestMapping("/hello")
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
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