package com.sofka.SpacecraftSofkaTest.interfacesService;

import java.util.List;
import java.util.Optional;

import com.sofka.SpacecraftSofkaTest.models.Shuttle;

public interface IShuttleServices {
	
	public List<Shuttle>showList();
	public Optional<Shuttle>showById(int id);
	
	public int save(Shuttle shuttle);
	public void delete(int id);
	
}
