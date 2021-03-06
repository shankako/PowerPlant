package com.ge.predix.solsvc.machinedata.simulator.config;

public class Constants {
	public static enum Range {
		GOOD, SATISFACTORY, MODERATE, POOR, VERY_POOR, SEVERE
	};

	public static enum Parameter {
		PM10, PM2_5,NO2, O3, CO, SO2, NH3, PB
	};
	
	public static enum Hygiene {
		TEMPERATURE, HUMIDITY, NOISE
	};

	public static String hygieneAreas[] = new String[] { "SMT Line 1", "SMT Line 2", "Production Ground Floor" };
}


