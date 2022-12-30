package com.sofka.SpacecraftSofkaTest.models;
 
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public  abstract class Spacecraft {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;   
	private String typePropulsion;
	private float maximumLoad;
	private float weight;
	private float height;
	private float power;
	private float maximumSpeed;
	@Column(name = "model", nullable = false, unique = true)
	private String model;
	private Boolean statusTakeOff;
	private Boolean statusLanding;
	private Boolean statusToOrbit;
	
	public Spacecraft() {
		
	}
	
	
	   

	public Spacecraft(long id, String typePropulsion, float maximumLoad, float weight, float height, float power,
			float maximumSpeed, String model, Boolean statusTakeOff, Boolean statusLanding, Boolean statusToOrbit) {
		super();
		this.id = id;
		this.typePropulsion = typePropulsion;
		this.maximumLoad = maximumLoad;
		this.weight = weight;
		this.height = height;
		this.power = power;
		this.maximumSpeed = maximumSpeed;
		this.model = model;
		this.statusTakeOff = statusTakeOff;
		this.statusLanding = statusLanding;
		this.statusToOrbit = statusToOrbit;
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getTypePropulsion() {
		return typePropulsion;
	}




	public void setTypePropulsion(String typePropulsion) {
		this.typePropulsion = typePropulsion;
	}




	public float getMaximumLoad() {
		return maximumLoad;
	}




	public void setMaximumLoad(float maximumLoad) {
		this.maximumLoad = maximumLoad;
	}




	public float getWeight() {
		return weight;
	}




	public void setWeight(float weight) {
		this.weight = weight;
	}




	public float getHeight() {
		return height;
	}




	public void setHeight(float height) {
		this.height = height;
	}




	public float getPower() {
		return power;
	}




	public void setPower(float power) {
		this.power = power;
	}




	public float getMaximumSpeed() {
		return maximumSpeed;
	}




	public void setMaximumSpeed(float maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}




	public String getModel() {
		return model;
	}




	public void setModel(String model) {
		this.model = model;
	}




	public Boolean getStatusTakeOff() {
		return statusTakeOff;
	}




	public void setStatusTakeOff(Boolean statusTakeOff) {
		this.statusTakeOff = statusTakeOff;
	}




	public Boolean getStatusLanding() {
		return statusLanding;
	}




	public void setStatusLanding(Boolean statusLanding) {
		this.statusLanding = statusLanding;
	}




	public Boolean getStatusToOrbit() {
		return statusToOrbit;
	}




	public void setStatusToOrbit(Boolean statusToOrbit) {
		this.statusToOrbit = statusToOrbit;
	}




	public abstract void takeOff();

	public abstract void landing();
	

	public abstract void  toOrbit();
}
 
