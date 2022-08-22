package com.cabbookingapp.util;

public class DBQueries {
	public static final String INSERTQUERY=
			"INSERT INTO CAB(pickup,drop_location,cost,type_of_vehicle,cab_number) values(?,?,?,?,?)";
			public static final String UPDATEQUERY="UPDATE CAB SET cost=? WHERE cab_number=?";
			public static final String DELETEQUERY="DELETE FROM CAB WHERE cab_number=?";

			public static final String SELECTQUERY="SELECT * FROM CAB";
			public static final String SELECTBYPICKUP="SELECT * FROM CAB WHERE pickup=?";
			public static final String SELECTBYDROPLOCATION="SELECT * FROM CAB WHERE drop_location=?";
			public static final String SELECTBYCOST="SELECT * FROM CAB WHERE  cost=?";
			public static final String SELECTBYTYPE="SELECT * FROM CAB WHERE type_of_vehicle=?";
			public static final String SELECTBYCABNUMBER="SELECT * FROM CAB WHERE cab_number=?";
}
