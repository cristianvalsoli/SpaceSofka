package com.sofka.SpacecraftSofkaTest.interfaces;

 

import org.springframework.data.repository.CrudRepository;
 
import com.sofka.SpacecraftSofkaTest.models.Shuttle;

public interface IShuttle  extends CrudRepository< Shuttle,Integer>{ 

 
	
}
