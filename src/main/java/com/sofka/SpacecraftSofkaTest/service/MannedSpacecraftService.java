package com.sofka.SpacecraftSofkaTest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.sofka.SpacecraftSofkaTest.interfaces.IMannedSpacecraft;
import com.sofka.SpacecraftSofkaTest.interfacesService.IMannedSpacecraftServices;
import com.sofka.SpacecraftSofkaTest.models.MannedSpacecraft; 

@Service
public class MannedSpacecraftService   implements IMannedSpacecraftServices{


	@Autowired
	private IMannedSpacecraft data;
	@Override
	public List<MannedSpacecraft> showList() {
		// TODO Auto-generated method stub
		return null;
	}

	 
	@Override
	public int save(MannedSpacecraft m) {
		int res=0;
		MannedSpacecraft	mannedSpacecraft=data.save(m);
		if(!mannedSpacecraft.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		 data.deleteById(id);
		
	}


	@Override
	public Optional<MannedSpacecraft> showById(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}

	
	 
}
