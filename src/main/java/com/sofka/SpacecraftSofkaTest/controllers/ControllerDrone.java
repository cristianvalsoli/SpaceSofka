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

import com.sofka.SpacecraftSofkaTest.interfacesService.IDronesServices;
import com.sofka.SpacecraftSofkaTest.models.Drone;
 

@Controller
@RequestMapping
public class ControllerDrone {
	@Autowired
	private IDronesServices droneService;
	
	 
	
	@GetMapping("/showdrone")
	public String Listar(Model model) {	
	List<Drone>drones=droneService.showList();
	model.addAttribute("drones",drones);
	model.addAttribute("drone", new Drone());
	 return "showdrone";	
	}
	
 
	@PostMapping("/savedrone")
	public String save(@Validated Drone drone, Model model) {
	droneService.save(drone);
	return "redirect:/showdrone";
	}
	
	@GetMapping("/editdrone/{id}")
	public String edit(@PathVariable int id , Model model) {
	Optional<Drone>drone=droneService.showById(id);
	model.addAttribute("drone",drone);
	return "formdrone";
    }

	@GetMapping("/deletedrone/{id}")
	public String deletes(@PathVariable int id , Model model) {
	droneService.delete(id);
	return "redirect:/showshuttle";
}
	
	
}
