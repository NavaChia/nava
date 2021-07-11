package com.davidweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "loginForm";
	}
	
	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}
}
