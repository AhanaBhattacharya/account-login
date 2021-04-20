package com.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountLoginController {
	
	@GetMapping("/order")
	public String login() {
		return "orderplace";
		
	}
	
	@GetMapping("/login")
	public String loginn() {
		return "Str";
		
	}
	
	/*@GetMapping("/login/oauth2/code/google")
	public String log() {
		return "hey";
	}*/

}
