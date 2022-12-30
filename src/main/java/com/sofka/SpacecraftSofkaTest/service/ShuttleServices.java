package com.sofka.SpacecraftSofkaTest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sofka.SpacecraftSofkaTest.interfaces.IShuttle;
import com.sofka.SpacecraftSofkaTest.interfacesService.IShuttleServices; 
import com.sofka.SpacecraftSofkaTest.models.Shuttle;
@Service
public class ShuttleServices implements IShuttleServices{
	@Autowired
	private IShuttle data;

	@Override
	public List<Shuttle> showList() {
		// TODO Auto-generated method stub
		return (List<Shuttle>)data.findAll();
	}

	 

	@Override
	public int save(Shuttle s) {
		int res=0;
		Shuttle	shuttle=data.save(s);
		if(!shuttle.equals(null)) {
			res=1;
		}
		return res;
	}
	
	@Override
	public void delete(int id) {
	 data.deleteById(id);	
	}


	@Override
	public Optional<Shuttle> showById(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}


	 
}
