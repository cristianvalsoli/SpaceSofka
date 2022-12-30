package com.sofka.SpacecraftSofkaTest.interfacesService;

import java.util.List;
import java.util.Optional;

import com.sofka.SpacecraftSofkaTest.models.Drone;

public interface IDronesServices {

	
	
	
	public List<Drone>showList();
	public Optional<Drone>showById(int id);
	public int save(Drone shuttle);
	public void delete(int id); 
	
	 
 
}
