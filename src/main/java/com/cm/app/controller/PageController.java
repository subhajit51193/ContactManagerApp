package com.cm.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author SubhajitSaha
 *
 */
@Controller
public class PageController {

	/**
	 * Basic Home page layout
	 * @return
	 */
	@RequestMapping("/home")
	public String home(Model model) {
		//sending data to view
		model.addAttribute("name", "Substring technologies");
		model.addAttribute("YT", "Kaizen");
		model.addAttribute("git", "https://github.com/subhajit51193");
		System.out.println("Home Page");
		return "home";
	}
}
