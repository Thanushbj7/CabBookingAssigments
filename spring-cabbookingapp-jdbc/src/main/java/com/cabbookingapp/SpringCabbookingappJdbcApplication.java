package com.cabbookingapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cabbookingapp.model.Cab;
import com.cabbookingapp.service.ICabBookingService;

@SpringBootApplication
public class SpringCabbookingappJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringCabbookingappJdbcApplication.class, args);
	}
	@Autowired
	ICabBookingService cabBookingService;	
	@Override
	public void run(String... args) throws Exception {
//		Cab cab=new Cab("Rajajinagar","SLK Green Park",1000,"Bus",123);
//		Cab cab1=new Cab("Sadashivanagar","SLK Green Park",2000,"Car",456);
//		cabBookingService.addCab(cab1);
//		Cab cab=new Cab();
//		cabBookingService.getAll().forEach(System.out::println);
		cabBookingService.updateCab(3000, 123);
	}

}
