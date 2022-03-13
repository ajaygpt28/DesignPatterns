package com.practiceDP.FactoryDP;

public class IndianRupee implements Currency{
	private String CurrencySymboll;
	
	@Override
	public double getConversionRate(CurrencyType type, double convertTo) {
		
		return 0;
	}

	@Override
	public double convert() {
		
		return 0;
	}
	
	
	public String getCurrencySymboll() {
		return "₹";
	}

}
