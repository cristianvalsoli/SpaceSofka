package com.sofka.SpacecraftSofkaTest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sofka.SpacecraftSofkaTest.models.MannedSpacecraft;
import com.sofka.SpacecraftSofkaTest.service.MannedSpacecraftService;
 
 

@Controller
@RequestMapping
public class ControllerMannedSpace {
 

	
	
	
	
	
	
	
	@Autowired
	private MannedSpacecraftService mannedSpacecraftService;
	
 	//
	@GetMapping("/showmanned")
	public String Listarm(Model model) {	
	List<MannedSpacecraft>mannedSpacecraft=mannedSpacecraftService.showList();
	model.addAttribute("mannedSpacecraft",mannedSpacecraft);
	model.addAttribute("mannedSpacecraftM", new MannedSpacecraft());
	 return "showmanned";	
	}
	
	
	@GetMapping("/editmanned/{id}")
	public String editm(@PathVariable int id , Model model) {
	Optional<MannedSpacecraft>mannedSpacecraft = mannedSpacecraftService.showById(id);
	model.addAttribute("mannedSpacecraft",mannedSpacecraft);
	return "formmanned";
}
 
	@GetMapping("/deletemanned/{id}")
	public String deletem(@PathVariable int id , Model model) {
	mannedSpacecraftService.delete(id);
	return "redirect:/showmannedspacecraft";
}
	

	@PostMapping("/savemanned")
	public String save(@Validated MannedSpacecraft mannedSpacecraft, Model model) {
		mannedSpacecraftService.save(mannedSpacecraft);
	return "redirect:/showmannedspacecraft";
	}


	
}
