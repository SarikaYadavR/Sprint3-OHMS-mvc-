/**
 * 
 */
package com.cg.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author trainee
 *
 */
@Controller
@RequestMapping(path="/login")

public class UserController {
	@RequestMapping(method=RequestMethod.POST)
	public String display(Model model,User user) {
		System.out.println("name:"+user.getName());
//		model.addAttribute(user);
		//model.addAttribute(user);
		model.addAttribute("user", user);
		return "hello";
	}

}
