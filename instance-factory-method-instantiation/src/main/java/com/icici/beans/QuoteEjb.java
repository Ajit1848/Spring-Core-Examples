package com.icici.beans;

public interface QuoteEjb {
	double getPremiumAmount(int manufactureYear, String vehicleType,String fuelType, String insuranceType, double vehicleValue);
}
