package uk.co.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.co.management.entities.User;
import uk.co.management.repository.UserRepository;

@Controller // Classe controle

@RequestMapping (path="newuser")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public String newaccount(Model model) {
		model.addAttribute("newuser", new User());
		return "newuser";
	}
	
	@PostMapping
	public String submit(@ModelAttribute User newuser, Model model) {
		repository.save(newuser); // pronto para salvar no banco
		model.addAttribute("login", newuser);
		return "firstpage";
	}

}
