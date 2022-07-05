package uk.co.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.co.management.entities.NewProduct;
import uk.co.management.repository.NewproductRepository;

@Controller

@RequestMapping (path="products")
public class ProductsController {
	
	@Autowired
	private NewproductRepository repository;
	
	@GetMapping
	public String products(Model model) {
		List<NewProduct> listaProduct = repository.findAll();
		model.addAttribute("listProduct", listaProduct);
		return "products";
	}
}
