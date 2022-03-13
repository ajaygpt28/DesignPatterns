package com.practiceDP.FactoryDP;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	IndianRupee rupee=(IndianRupee)CurrencyFactory.createCurrency("RUPEE");
    	System.out.println(rupee.getCurrencySymboll());
    }
}
