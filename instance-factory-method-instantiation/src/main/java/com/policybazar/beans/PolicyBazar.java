package com.policybazar.beans;

import com.icici.beans.QuoteEjb;

public class PolicyBazar {
	QuoteEjb quoteEjb;
	public double getQuote(int manufactureYear, String vehicleType, String fuelType, String insuranceType,
			double vehicleValue)
	{
		double total=0;
		total=quoteEjb.getPremiumAmount(manufactureYear, vehicleType, fuelType, insuranceType, vehicleValue);
		return total;
	}
	public void setQuoteEjb(QuoteEjb quoteEjb) {
		this.quoteEjb = quoteEjb;
	}
	
}
