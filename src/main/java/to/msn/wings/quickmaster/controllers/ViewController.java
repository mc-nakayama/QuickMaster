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

	@GetMapping("/view/format")
	public String format( Model model){
		model.addAttribute("name","山田");
		return "view/format";
	}

	@GetMapping("/view/attr")
	public String attr(Model model){
		model.addAttribute("url",
		"https://wings.msn.to/");
		return "view/attr";
	}
}
