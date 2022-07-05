package uk.co.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.co.management.repository.NewSaleRepository;

@Controller

@RequestMapping (path="firstpage")
public class FirstPageController {
	
	@Autowired
	private NewSaleRepository repositoryns;
	
	@GetMapping()
	public String sumvalue(Model model) {
		model.addAttribute("somasales", repositoryns.allValueSale());
		return "firstpage";
	}
	
}
