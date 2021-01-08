package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class Maincontroller {
	
	@GetMapping("/Enter")
	public String DisplayForm(Model model)
	{
		User user=new User();
		model.addAttribute("user", user);
		List<String> professionList= Arrays.asList("Enginner"," Doctor", "Manager","Sportsperson");
		model.addAttribute("professionList",professionList);
		return "Enter";
	}
	@PostMapping("/Enter")
	public String submitForm(@ModelAttribute("user")User user ) {
		System.out.println(user);
		return "regsuc";
	}
}
