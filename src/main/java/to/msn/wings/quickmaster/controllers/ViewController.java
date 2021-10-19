package to.msn.wings.quickmaster.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
public class ViewController{
	@GetMapping("/view/html") 
	public String html( Model model) {
		model.addAttribute("message", "<h1>こんにちは</h1>" + "<span><a href ='https://spring.io/projects/spring-boot/'>Spring Boot!!</a></span>");
		return "view/html"; 
	}
}
