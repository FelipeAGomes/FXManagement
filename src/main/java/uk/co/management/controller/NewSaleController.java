package uk.co.management.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.co.management.entities.NewSale;
import uk.co.management.repository.NewSaleRepository;

@Controller

@RequestMapping (path = "newsale")
public class NewSaleController {
	
	@Autowired
	private NewSaleRepository repository;
	
	@GetMapping
	public String newsale(Model model) {
		model.addAttribute("newsale", new NewSale());
		return "newsale";
	}
	@PostMapping String submit(@ModelAttribute NewSale newsale, Model model) {
		 newsale.setDate(LocalDate.now());
		 repository.save(newsale);
		 List<NewSale> listSale = repository.findAll();
		 model.addAttribute("listSale", listSale);
		 return "sales";
	}
}
