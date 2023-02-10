package com.gestaofesta.gestaofesta.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class InMemorySecurityConfig {

	@Autowired
	public void configuraGlobal(AuthenticationManagerBuilder amb) throws Exception {
		amb.inMemoryAuthentication()
			.withUser("louise").password("rivaldo11").roles("USER").and()
			.withUser("junior").password("rivaldo11").roles("USER");
			
	}
}
