package com.springboot.web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.springboot.web.model.Owner;
import com.springboot.web.service.OwnerService;
@Controller
public class OwnerController {
	@Autowired
	private OwnerService ownerservice;
	
	@GetMapping("/Registration")
	public String showOwnerSignupForm(Model model) {
		model.addAttribute("ownobj", new Owner());
	    return "Registration";
	}
	
	@PostMapping("/Registration")
	public String addOwner(@ModelAttribute("ownobj") Owner ownobj, Model model)
	{
		ownerservice.addOwner(ownobj);
		return "redirect:/Welcome";
	}
	
	@GetMapping("/Welcome")
	public String welcome(Model model) {
		return "Welcome";
	}
}
