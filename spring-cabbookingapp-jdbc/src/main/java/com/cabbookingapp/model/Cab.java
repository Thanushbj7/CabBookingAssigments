package com.cabbookingapp.model;

public class Cab {
	private String pickup;
	private String drop;
	private double cost;
	private String typeOfVehicle;
	private Integer cabNumber;
	public Cab() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cab(String pickup, String drop, double cost, String typeOfVehicle, Integer cabNumber) {
		super();
		this.pickup = pickup;
		this.drop = drop;
		this.cost = cost;
		this.typeOfVehicle = typeOfVehicle;
		this.cabNumber = cabNumber;
	}
	@Override
	public String toString() {
		return "Cab [pickup=" + pickup + ", drop=" + drop + ", cost=" + cost + ", typeOfVehicle=" + typeOfVehicle
				+ ", cabNumber=" + cabNumber + "]";
	}
	public String getPickup() {
		return pickup;
	}
	public void setPickup(String pickup) {
		this.pickup = pickup;
	}
	public String getDrop() {
		return drop;
	}
	public void setDrop(String drop) {
		this.drop = drop;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}
	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}
	public Integer getCabNumber() {
		return cabNumber;
	}
	public void setCabNumber(Integer cabNumber) {
		this.cabNumber = cabNumber;
	}
}
