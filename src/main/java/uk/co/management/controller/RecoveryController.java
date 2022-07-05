package uk.co.management.controller;

import org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="recovery")
public class RecoveryController {

	@GetMapping
	public String recovery(Model model) {
		model.addAttribute("recovery", new Recovery());
		return "recovery";
	}
	@PostMapping
	public String recoverySubmit(@ModelAttribute Recovery recovery, Model model) {
		model.addAttribute("recovery", recovery);
		return "recovery";
	}
}
