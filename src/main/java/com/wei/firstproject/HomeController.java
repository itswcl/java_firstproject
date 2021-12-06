package com.wei.firstproject;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RestController
//@RequestMapping("/hello")
public class HomeController {
	
	// index route
	// @GetMapping for default GET request
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	// payment process post
	// @PostMapping("/processPayment") -- shorthand  for POST
	@RequestMapping(value="/processPayment", method=RequestMethod.POST)
	public String processPayment(
			@RequestParam(value="creditCardNumber") Integer creditCardNumber,
			@RequestParam(value="exDate") Date expDate,
			@RequestParam(value="productID") Integer productID
			)
	{
		
		System.out.println("" + creditCardNumber + expDate + productID);
		System.out.printf("Chargin credit, timestamp: %s",new Date());
		
		return "redirect:/confirm";
	}
	
	// payment confirm page
	@RequestMapping("/confirm")
	public String confirmationPage(Model model) {
		return "confirmation.jsp";
	}
	
	
	
	// route for login submission
	// @PostMapping("/login") -- shorthand  for POST
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(
			@RequestParam(value="email") String email,
			@RequestParam(value="password")String password
			) 
	{
		return "redirect:/dashboard";
	}
	
	
	public String indexSession(HttpSession session) {
		// check if session not exist will return null
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			
		} else {
		// exist then get the count time and turn to interger
			Integer currentCount = (Integer) session.getAttribute("count");
			// set the session attribute of count to plus 1;
			session.setAttribute("count", currentCount++);			
		}
		
		return "index.jsp";
	}
	
	public String showCount(HttpSession session, Model model) {
		
		Integer currentCount = (Integer) session.getAttribute("count");
		model.addAttribute("countToShow", currentCount);
		
		return "showCount.jsp";
	}

	
//	@RequestMapping("/")
//	public String index(Model model) {
//		model.addAttribute("fruit", "banana");
//		
//		String firstName = "Ada";
//		String lastName = "Lovelace";
//		String email = "ones@zeroes.com";
//		Integer age = 160;
//		
//		model.addAttribute("firstName", firstName);
//		model.addAttribute("lastName", lastName);
//		model.addAttribute("email", email);
//		model.addAttribute("age", age);
// 
//		return "index.jsp";
//	}
	

//	@RequestMapping("/dojos")
//	public String indexDojo(Model model) {
//		ArrayList<String> dojos = new ArrayList<String>();
//		
//		dojos.add("Brubank");
//		dojos.add("Chicago");
//		dojos.add("Bellevue");
//		
//		model.addAttribute("dojosList", dojos);
//		return "index.jsp";
//	}
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