package uk.co.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.co.management.entities.NewOverheadCost;
import uk.co.management.repository.NewOverheadCostRepository;

@Controller

@RequestMapping (path = "overheadcost")
public class OverheadCostController {

	@Autowired
	private NewOverheadCostRepository repositoryoc;
	
	@GetMapping
	public String overheadcost(Model model) {
		List<NewOverheadCost> listOverheadcost = repositoryoc.findAll();
		model.addAttribute("listOverheadcost", listOverheadcost);
		return "overheadcost";
	}
}
