package com.sofka.SpacecraftSofkaTest.models;
 

 
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="mannedSpacecraft")
public class MannedSpacecraft  extends Spacecraft {
	//tripulación maxima
	private int crew;
	//tiempo de vida para la tripulación 
	private float timeOfLifeForCres;
	//vehiculo lunar
	private  boolean rover;
    //litros de agua
	private float waterLiters;
	
 
 
 

	 

  

	public MannedSpacecraft() {
		super();
	}

	public MannedSpacecraft(long id, String typePropulsion, float maximumLoad, float weight, float height, float power,
			float maximumSpeed, String model, Boolean statusTakeOff, Boolean statusLanding, Boolean statusToOrbit,
			int crew, float timeOfLifeForCres, boolean rover, float waterLiters) {
		super(id, typePropulsion, maximumLoad, weight, height, power, maximumSpeed, model, statusTakeOff, statusLanding,
				statusToOrbit);
		this.crew = crew;
		this.timeOfLifeForCres = timeOfLifeForCres;
		this.rover = rover;
		this.waterLiters = waterLiters;
	}

	public int getCrew() {
		return crew;
	}

	public void setCrew(int crew) {
		this.crew = crew;
	}

	public float getTimeOfLifeForCres() {
		return timeOfLifeForCres;
	}

	public void setTimeOfLifeForCres(float timeOfLifeForCres) {
		this.timeOfLifeForCres = timeOfLifeForCres;
	}

	public boolean isRover() {
		return rover;
	}

	public void setRover(boolean rover) {
		this.rover = rover;
	}

	public float getWaterLiters() {
		return waterLiters;
	}

	public void setWaterLiters(float waterLiters) {
		this.waterLiters = waterLiters;
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
