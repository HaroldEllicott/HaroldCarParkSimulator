package com.fdm.HaroldCarParkSimulation;

public interface ICarPark {
	public String input();
	public int vehicleEntry();
	public int vehicleExit();
	public String splitCarInput(String input);
	public int calculateCarFees();
	public String splitTruckInput(String input);
	public int calculateTruckFees();
	public int carEntryEvent();
	public int carExitEvent();
	public int truckEntryEvent();
	public int truckExitEvent();
	
	
}
