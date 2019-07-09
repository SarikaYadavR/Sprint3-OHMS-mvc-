/**
 * 
 */
package com.cg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author trainee
 *
 */
@Configuration
@ComponentScan(basePackages="com.cg")
@EnableWebMvc
public class SpringwebConfiguration {
	@Bean
	public ViewResolver viewResolver()
	{
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver("/views/","users.jsp");
		return viewResolver;
	}

}
