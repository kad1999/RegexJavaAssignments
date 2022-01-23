package com.abc.app1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("admin")
		.password(encoder().encode("admin123"))
		.roles("CUSTOMER");
		
		auth.inMemoryAuthentication()
		.withUser("manager1")
		.password(encoder().encode("manager123"))
		.roles("MANAGER");
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests()
		.antMatchers("/").permitAll()
		
		.antMatchers("/offers").authenticated()
		.antMatchers("/balance").hasAnyRole("CUSTOMER", "MANAGER")
		.antMatchers("/loanApprove").hasRole("MANAGER")
		.anyRequest().authenticated()
		.and().formLogin()
		.and().logout()
		.and().exceptionHandling().accessDeniedPage("/denied");
		
	}
}
