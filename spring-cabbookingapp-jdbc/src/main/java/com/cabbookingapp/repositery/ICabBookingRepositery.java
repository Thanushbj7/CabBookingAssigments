package com.cabbookingapp.repositery;

import java.util.List;
import com.cabbookingapp.model.Cab;

public interface ICabBookingRepositery {
	void addCab(Cab cab);
	void updateCab(double cost,Integer cabNumber);
	void deleteCab(Integer cabNumber);
	
	List<Cab> findAll();
	List<Cab> findByCabType(String typeOfVehicle);
	List<Cab> findByPickupLocation(String pickup);
	List<Cab> findByDropLocation(String drop);
	List<Cab> findByPrice(double cost);
	Cab findByCabNumber(Integer cabNumber);
}
