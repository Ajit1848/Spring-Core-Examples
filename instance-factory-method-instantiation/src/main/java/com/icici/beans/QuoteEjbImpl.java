package com.icici.beans;

public class QuoteEjbImpl implements QuoteEjb{
@Override
public double getPremiumAmount(int manufactureYear, String vehicleType, String fuelType, String insuranceType,
		double vehicleValue) {
	return 15000.48;
}
}
