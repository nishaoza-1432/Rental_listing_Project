package com.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.web.model.Owner;
import com.springboot.web.service.OwnerService;

@Controller
public class LoginController {

	@Autowired
    private OwnerService ownerservice;
    
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
    
    @PostMapping("/login")
    public String processLoginForm(@RequestParam String email, @RequestParam String password, Model model) {
    	Owner ownobj = ownerservice.getOwnerByEmail(email);
        if (ownobj != null && ownobj.getPassword().equals(password)) {
            return "redirect:/Welcome"; // Redirect to the dashboard upon successful login
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "redirect:/Error"; // Return to the login page with an error message
        }
        
    }
    
    @GetMapping("/Error")
    public String showRegistrationForm(Model model) {
        return "Error";
    }
}