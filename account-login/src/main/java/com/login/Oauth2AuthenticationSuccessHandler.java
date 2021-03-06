/*package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;





@Component("oauth2authSuccessHandler")

public class Oauth2AuthenticationSuccessHandler implements AuthenticationSuccessHandler{

	private  RedirectStrategy redirectStrategy=  new DefaultRedirectStrategy();;

	
	@Autowired
	private  PasswordEncoder encoder;
	 
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		OAuth2AuthenticationToken oToken = (OAuth2AuthenticationToken)authentication;
        System.out.println("token is"+oToken);	
		this.redirectStrategy.sendRedirect(request, response, "/order");
	
	}
}*/
