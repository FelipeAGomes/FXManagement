package uk.co.management.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.co.management.entities.NewProduct;
import uk.co.management.repository.NewproductRepository;

@Controller

@RequestMapping (path="newproduct")
public class NewProductController {
 
	@Autowired
	private NewproductRepository repository;
	
	@GetMapping
	public String newproduct(Model model) {
		model.addAttribute("newproduct", new NewProduct());
		return "newproduct";
	}
	@PostMapping
	public String submit(@ModelAttribute NewProduct newproduct, Model model) {
		newproduct.setDate(LocalDate.now()); 
		repository.save(newproduct);
		List<NewProduct> listProduct = repository.findAll();
		model.addAttribute("listProduct", listProduct);
		return "products";
	}
	@DeleteMapping("/{id}")
	public String deleteall(@ModelAttribute Long newproduct, Model model) {
		repository.deleteById(newproduct);
		List<NewProduct> deleteProduct = repository.findAll();
		model.addAttribute("deleteProduct", deleteProduct);
		return "products";
		
	}
}
