package com.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.web.model.Tenant;
import com.springboot.web.service.TenantService;

@Controller
public class TenantController {
	@Autowired
	private TenantService tenantservice;
	
	@GetMapping("/tenantRegistration")
	public String showTenantSignupForm(Model model) {
		model.addAttribute("tenobj", new Tenant());
	    return "tenantRegistration";
	}
	
	@PostMapping("/tenantRegistration")
	public String addTenant(@ModelAttribute("tenobj") Tenant tenobj, Model model)
	{
		tenantservice.addTenant(tenobj);
		return "redirect:/Welcome";
	}
	
}