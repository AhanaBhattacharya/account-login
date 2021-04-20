package com.login;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.web.client.RestTemplate;

@Configuration
//@Order(1)
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	


	//@Autowired
	//@Qualifier("oauth2authSuccessHandler")
	//private AuthenticationSuccessHandler oauth2authSuccessHandler;
   
	protected void configure(HttpSecurity http) throws Exception {
       
		http
        .csrf()
        .disable()
        .antMatcher("/**")
        .authorizeRequests()
        .antMatchers("/", "/index.html")
        .permitAll()
        .anyRequest()
        .authenticated();
		//.permitAll().anyRequest().authenticated().and()
		//.oauth2Login().successHandler(oauth2authSuccessHandler);
	}



	@Bean
	public PasswordEncoder getPasswordEncoder() {
		DelegatingPasswordEncoder encoder = (DelegatingPasswordEncoder) PasswordEncoderFactories
				.createDelegatingPasswordEncoder();
		return encoder;
	}

}
