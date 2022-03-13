package com.practiceDP.FactoryDP;

public enum CurrencyType {
	RUPEE,USDOLLAR,EURO,POUNDSTERLING;
	
	public String toString() {
		switch(this) {
		case RUPEE:
			return "RUPEE";
		case USDOLLAR:
			return "USDOLLAR";
		case EURO:
			return "EURO";
		case POUNDSTERLING:
			return "POUNDSTERLING";
			
		}
		return null;
	}
}
