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

import uk.co.management.entities.NewOverheadCost;
import uk.co.management.repository.NewOverheadCostRepository;

@Controller

@RequestMapping(path ="newoverheadcost")
public class NewOverheadCostController {
	
	@Autowired
	private NewOverheadCostRepository repositoryoc;
	
	@GetMapping
	public String newoverheadcost(Model model) {
		model.addAttribute("newoverheadcost", new NewOverheadCost());
		return "newoverheadcost";
	}
	@PostMapping
	public String submit(@ModelAttribute NewOverheadCost newoverheadcost, Model model) {
		newoverheadcost.setDate(LocalDate.now());
		repositoryoc.save(newoverheadcost);
		List<NewOverheadCost> listOverheadCost = repositoryoc.findAll();
		model.addAttribute("listOverheadCost", listOverheadCost);
		return "overheadcost";
	}
	
}
