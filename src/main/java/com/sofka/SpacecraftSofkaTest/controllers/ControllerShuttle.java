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
import com.sofka.SpacecraftSofkaTest.interfacesService.IShuttleServices;
 
import com.sofka.SpacecraftSofkaTest.models.Shuttle;
 
 
 

@Controller
@RequestMapping
public class ControllerShuttle {
 
	@Autowired
	private IShuttleServices shuttleService;
 	
	
   

	
	//
	

	@GetMapping("/showshuttle")
	public String Listars(Model model) {	
	List<Shuttle>shuttles=shuttleService.showList();
	model.addAttribute("shuttles",shuttles);
	model.addAttribute("shuttle", new Shuttle());
	 return "showshuttle";	
	}
 
	
	@PostMapping("/saveshuttle")
	public String saves(@Validated Shuttle shuttle, Model model) {
	shuttleService.save(shuttle);
	return "redirect:/showshuttle";
	}
	
	@GetMapping("/editshuttle/{id}")
	public String edits(@PathVariable int id , Model model) {
	Optional<Shuttle>shuttle=shuttleService.showById(id);
	model.addAttribute("shuttle",shuttle);
	return "formshuttle";
}

	
	@GetMapping("/deleteshuttle/{id}")
	public String deletes(@PathVariable int id , Model model) {
	shuttleService.delete(id);
	return "redirect:/showshuttle";
}
	

		
	//
	

 	
}
