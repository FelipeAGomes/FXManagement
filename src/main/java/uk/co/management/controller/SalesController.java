package uk.co.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.co.management.entities.NewSale;
import uk.co.management.repository.NewSaleRepository;

@Controller

@RequestMapping (path = "sales")
public class SalesController {

	@Autowired
	private NewSaleRepository repository;
	
	@GetMapping
	public String sales(Model model) {
		List<NewSale> listSales = repository.findAll();
		model.addAttribute("listSales", listSales);
		return "sales";
	}
}
