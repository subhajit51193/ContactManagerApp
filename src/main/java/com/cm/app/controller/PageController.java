package com.cm.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author SubhajitSaha
 *
 */
@Controller
public class PageController {

	/**
	 * 
	 * @return
	 */
	@RequestMapping("/home")
	public String home() {
		System.out.println("Home Page");
		return "home";
	}
}
