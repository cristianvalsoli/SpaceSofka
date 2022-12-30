package com.sofka.SpacecraftSofkaTest.models;

 
 

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="drone")
public class Drone extends Spacecraft {
	private  boolean rover;
 
 

 

 


	public Drone(long id, String typePropulsion, float maximumLoad, float weight, float height, float power,
			float maximumSpeed, String model, Boolean statusTakeOff, Boolean statusLanding, Boolean statusToOrbit,
			boolean rover) {
		super(id, typePropulsion, maximumLoad, weight, height, power, maximumSpeed, model, statusTakeOff, statusLanding,
				statusToOrbit);
		this.rover = rover;
	}



	public Drone() {
		super();
	}



	public boolean isRover() {
		return rover;
	}



	public void setRover(boolean rover) {
		this.rover = rover;
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