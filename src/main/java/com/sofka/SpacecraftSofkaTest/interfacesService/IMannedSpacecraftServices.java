package com.sofka.SpacecraftSofkaTest.interfacesService;

import java.util.List;
import java.util.Optional;
 
import com.sofka.SpacecraftSofkaTest.models.MannedSpacecraft;

public interface IMannedSpacecraftServices {

	
	public List<MannedSpacecraft>showList();
	public Optional<MannedSpacecraft>showById(int id);	 
	public int save(MannedSpacecraft shuttle);
	public void delete(int id);
}
