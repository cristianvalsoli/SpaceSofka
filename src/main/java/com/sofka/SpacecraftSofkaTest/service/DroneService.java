package com.sofka.SpacecraftSofkaTest.service;

 
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sofka.SpacecraftSofkaTest.interfaces.IDrone;
import com.sofka.SpacecraftSofkaTest.interfacesService.IDronesServices;
import com.sofka.SpacecraftSofkaTest.models.Drone;
@Service
public class DroneService  implements  IDronesServices{

	@Autowired
	private IDrone data;
	@Override
	public List<Drone> showList() {
	 
		return (List<Drone>)data.findAll();
	}

 
	@Override
	public int save(Drone d) {
		
		int res=0;
		Drone drone=data.save(d);
		if(!drone.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
	 data.deleteById(id);	
	}


	@Override
	public Optional<Drone> showById(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}


	 

 


	 
 
 

 
 

}
