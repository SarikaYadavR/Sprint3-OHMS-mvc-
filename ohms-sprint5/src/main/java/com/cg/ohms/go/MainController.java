/**
 * 
 */
package com.cg.ohms.go;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author trainee
 *
 */
@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class MainController {
	@RequestMapping("/")
	public String hello()
	
	{
		return "home";
		
	}
}
