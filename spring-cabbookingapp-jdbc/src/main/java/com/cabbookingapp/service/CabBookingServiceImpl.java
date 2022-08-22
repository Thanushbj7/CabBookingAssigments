package com.cabbookingapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabbookingapp.model.Cab;
import com.cabbookingapp.repositery.ICabBookingRepositery;
@Service
public class CabBookingServiceImpl implements ICabBookingService {
private ICabBookingRepositery cabBookingRepositery;
	@Override
	public void addCab(Cab cab) {
		cabBookingRepositery.addCab(cab);
		
	}
@Autowired
	public CabBookingServiceImpl(ICabBookingRepositery cabBookingRepositery) {
		super();
		this.cabBookingRepositery = cabBookingRepositery;
	}

	@Override
	public void updateCab(double cost, Integer cabNumber) {
		cabBookingRepositery.updateCab(cost, cabNumber);
		
	}

	@Override
	public void deleteCab(Integer cabNumber) {
		cabBookingRepositery.deleteCab(cabNumber);
		
	}

	@Override
	public List<Cab> getAll() {
		// TODO Auto-generated method stub
		return cabBookingRepositery.findAll();
	}

	@Override
	public List<Cab> getByCabType(String typeOfVehicle) {
		// TODO Auto-generated method stub
		return cabBookingRepositery.findByCabType(typeOfVehicle);
	}

	@Override
	public List<Cab> getByPickupLocation(String pickup) {
		// TODO Auto-generated method stub
		return cabBookingRepositery.findByPickupLocation(pickup);
	}

	@Override
	public List<Cab> getByDropLocation(String drop) {
		// TODO Auto-generated method stub
		return cabBookingRepositery.findByDropLocation(drop);
	}

	@Override
	public List<Cab> getByPrice(double cost) {
		// TODO Auto-generated method stub
		return cabBookingRepositery.findByPrice(cost);
	}

	@Override
	public Cab getByCabNumber(int cabNumber) {
		// TODO Auto-generated method stub
		return cabBookingRepositery.findByCabNumber(null);
	}

}
