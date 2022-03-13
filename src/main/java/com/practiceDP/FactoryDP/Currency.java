package com.practiceDP.FactoryDP;

public interface Currency {
	double getConversionRate(CurrencyType type,double convertTo);
	double convert();

}
