package br.com.torezne.bluefood.bluefood.infrastructure.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping(path = {"/index", "/"})
	public String login() {
		return "index";
	}
}
