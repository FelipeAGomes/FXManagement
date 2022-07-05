package uk.co.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.co.management.entities.Login;

@Controller // Classe de controle
@RequestMapping(path = "login") // URI /login direciona para a pagina login
public class LoginController {

	@GetMapping // Recebendo chamada tipo getting, Nome da pagina
	public String login(Model model) {
		model.addAttribute("login", new Login());
		return "login";
	}

	@PostMapping // 
	public String loginSubmit(@ModelAttribute Login login, Model model) {
		model.addAttribute("login", login);
		return "firstpage";
	}
}
