package com.psl.q1;

public class Vehicle {
	String vehicleNo,vehicleName;

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	@Override
	public String toString() {
		return  vehicleNo + "   "
				+ vehicleName ;
	}

 
}
