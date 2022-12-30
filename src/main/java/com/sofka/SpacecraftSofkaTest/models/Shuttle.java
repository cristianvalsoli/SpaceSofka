package com.sofka.SpacecraftSofkaTest.models;
 

 

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="shuttle")
public class Shuttle extends Spacecraft  {
	private boolean statusLoad;
	private float weightLoad;
 
	
	
 
 
 
 
 

 

	public Shuttle() {
		super();
	}

	public Shuttle(long id, String typePropulsion, float maximumLoad, float weight, float height, float power,
			float maximumSpeed, String model, Boolean statusTakeOff, Boolean statusLanding, Boolean statusToOrbit,
			boolean statusLoad, float weightLoad) {
		super(id, typePropulsion, maximumLoad, weight, height, power, maximumSpeed, model, statusTakeOff, statusLanding,
				statusToOrbit);
		this.statusLoad = statusLoad;
		this.weightLoad = weightLoad;
	}

	public boolean isStatusLoad() {
		return statusLoad;
	}

	public void setStatusLoad(boolean statusLoad) {
		this.statusLoad = statusLoad;
	}

	public float getWeightLoad() {
		return weightLoad;
	}

	public void setWeightLoad(float weightLoad) {
		this.weightLoad = weightLoad;
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void landing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void toOrbit() {
		// TODO Auto-generated method stub
		
	}


 


}