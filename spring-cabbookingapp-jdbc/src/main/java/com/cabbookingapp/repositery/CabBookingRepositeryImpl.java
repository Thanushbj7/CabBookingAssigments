package com.cabbookingapp.repositery;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cabbookingapp.model.Cab;
import com.cabbookingapp.util.DBQueries;

@Repository
public class CabBookingRepositeryImpl implements ICabBookingRepositery {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public CabBookingRepositeryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	

	@Override
	public void addCab(Cab cab) {
		String sql=DBQueries.INSERTQUERY;
		Object[] cabArray= {
			cab.getPickup(),cab.getDrop(),cab.getCost(),cab.getTypeOfVehicle(),cab.getCabNumber(),
		};
		jdbcTemplate.update(DBQueries.INSERTQUERY,cabArray);
		
	}

	@Override
	public void updateCab(double cost, Integer cabNumber) {
		String sql=DBQueries.UPDATEQUERY;
		jdbcTemplate.update(sql,cost,cabNumber);
		
	}

	@Override
	public void deleteCab(Integer cabNumber) {
		jdbcTemplate.update(DBQueries.DELETEQUERY,cabNumber);
		
	}

	@Override
	public List<Cab> findAll() {
		RowMapper<Cab> mapper=new CabBookingMapper();
		List<Cab> cab=
				jdbcTemplate.query(DBQueries.SELECTQUERY,mapper);
		return cab;
	}

	@Override
	public List<Cab> findByCabType(String typeOfVehicle) {
		List<Cab> cabs=jdbcTemplate.query(DBQueries.SELECTBYTYPE,
				(rs,rowNum)->{
				Cab cab=new Cab();
				cab.setPickup(rs.getString("pickup"));
				cab.setDrop(rs.getString("drop_location"));
				cab.setCost(rs.getDouble("cost"));
				cab.setTypeOfVehicle(rs.getString("type_of_vehicle"));
				
				
				Integer cabNumber=rs.getInt("cab_number");
				cab.setCabNumber(cabNumber);
				return cab;
			
		},typeOfVehicle); 
		return cabs;
	}

	@Override
	public List<Cab> findByPickupLocation(String pickup) {
		List<Cab> cabs=jdbcTemplate.query(DBQueries.SELECTBYPICKUP,new RowMapper<Cab>() {

			@Override
			public Cab mapRow(ResultSet rs, int rowNum) throws SQLException {
				Cab cab=new Cab();
				cab.setPickup(rs.getString("pickup"));
				cab.setDrop(rs.getString("drop_location"));
				cab.setCost(rs.getDouble("cost"));
				cab.setTypeOfVehicle(rs.getString("type_of_vehicle"));
				
				
				Integer cabNumber=rs.getInt("cab_number");
				cab.setCabNumber(cabNumber);
				return cab;
			}
			
		},pickup); 
		return cabs;
	}

	@Override
	public List<Cab> findByDropLocation(String drop) {
		List<Cab> cabs=jdbcTemplate.query(DBQueries.SELECTBYDROPLOCATION,new RowMapper<Cab>() {

			@Override
			public Cab mapRow(ResultSet rs, int rowNum) throws SQLException {
				Cab cab=new Cab();
				cab.setPickup(rs.getString("pickup"));
				cab.setDrop(rs.getString("drop_location"));
				cab.setCost(rs.getDouble("cost"));
				cab.setTypeOfVehicle(rs.getString("type_of_vehicle"));
				
				Integer cabNumber=rs.getInt("cab_number");
				cab.setCabNumber(cabNumber);
				return cab;
			}
			
		},drop); 
		return cabs;
	}

	@Override
	public List<Cab> findByPrice(double cost) {
		List<Cab> cabs=jdbcTemplate.query(DBQueries.SELECTBYCOST,new RowMapper<Cab>() {

			@Override
			public Cab mapRow(ResultSet rs, int rowNum) throws SQLException {
				Cab cab=new Cab();
				cab.setPickup(rs.getString("pickup"));
				cab.setDrop(rs.getString("drop_location"));
				cab.setCost(rs.getDouble("cost"));
				cab.setTypeOfVehicle(rs.getString("type_of_vehicle"));
				
				Integer cabNumber=rs.getInt("cab_number");
				cab.setCabNumber(cabNumber);
				return cab;
			}
			
		},cost); 
		return cabs;
	}

	@Override
	public Cab findByCabNumber(Integer cabNumber) {
		Cab cabs=jdbcTemplate.queryForObject(DBQueries.SELECTBYCABNUMBER, new RowMapper<Cab>(){

			@Override
			public Cab mapRow(ResultSet rs, int rowNum) throws SQLException {
				Cab cab=new Cab();
				cab.setPickup(rs.getString("pickup"));
				cab.setDrop(rs.getString("drop_location"));
				cab.setCost(rs.getDouble("cost"));
				cab.setTypeOfVehicle(rs.getString("type_of_vehicle"));
				
				
				cab.setCabNumber(cabNumber);
				return cab;
			}
			
		},cabNumber); 
		return cabs;
	}
}
