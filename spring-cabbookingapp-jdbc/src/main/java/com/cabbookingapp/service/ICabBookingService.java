package com.cabbookingapp.service;

import java.util.List;

import com.cabbookingapp.model.Cab;


public interface ICabBookingService {
	
	void addCab(Cab cab);
	void updateCab(double cost,Integer cabNumber);
	void deleteCab(Integer cabNumber);
	List<Cab> getAll();
	List<Cab> getByCabType(String typeOfVehicle);
	List<Cab> getByPickupLocation(String pickup);
	List<Cab> getByDropLocation(String drop);
	List<Cab> getByPrice(double cost);
	Cab getByCabNumber(int cabNumber);
}
