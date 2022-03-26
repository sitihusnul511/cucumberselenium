package com.juaracoding.ujiancucumber.drivers;

import com.juaracoding.ujiancucumber.drivers.Chrome;
import com.juaracoding.ujiancucumber.drivers.DriverStrategy;
import com.juaracoding.ujiancucumber.drivers.Firefox;
import com.juaracoding.ujiancucumber.utils.Constants;

public class DriverStrategyImplementator {
public static DriverStrategy chooseStrategy(String strategy) {
		
		switch(strategy) {
		case Constants.FIREFOX:
			return new Firefox();
			
		case Constants.CHROME:
			return new Chrome();
			
		default:
			return null;
		}
	}

}
