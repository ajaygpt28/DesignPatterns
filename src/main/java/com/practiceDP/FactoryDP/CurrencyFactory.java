package com.practiceDP.FactoryDP;

public class CurrencyFactory {
	
	public static Currency createCurrency(String type) {
		if(type.toUpperCase().equals(CurrencyType.RUPEE.toString()))
			return new IndianRupee();
		if(type.toUpperCase().equals(CurrencyType.USDOLLAR.toString()))
			return new AmericanDollar();
		if(type.toUpperCase().equals(CurrencyType.EURO.toString()))
			return new EuropeanEuro();
		if(type.toUpperCase().equals(CurrencyType.POUNDSTERLING.toString()))
			return new UKSterling();
		return null;
	}

}
