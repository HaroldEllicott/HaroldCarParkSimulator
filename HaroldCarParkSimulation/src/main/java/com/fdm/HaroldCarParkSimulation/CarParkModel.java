package com.fdm.HaroldCarParkSimulation;

import java.util.Scanner;

public class CarParkModel implements ICarPark {
	UserInputView UIV = new UserInputView();
	int[] carParkReport = new int[8];
	int size = carParkReport.length;
	
	public int carEntryEvent() {
		int event1 = carParkReport[0]++;
		int event2 = carParkReport[6]--;
		int event3 = carParkReport[4]++;
		return (event1 & event2 & event3);
	}
	@Override
	public int carExitEvent() {
		int event1 = carParkReport[0]--;
		int event2 = carParkReport[6]++;
		int event3 = carParkReport[4]--;
		return (event1 & event2 & event3);
	}
	@Override
	public int truckEntryEvent() {
		int event1 = carParkReport[1]++;
		int event2 = (carParkReport[6]--) * 2;
		int event3 = carParkReport[5]++;
		return (event1 & event2 & event3);
	}
	@Override
	public int truckExitEvent() {
		int event1 = carParkReport[1]--;
		int event2 = (carParkReport[6]++) * 2;
		int event3 = carParkReport[5]--;
		return (event1 & event2 & event3);
	}

	@Override
	public int vehicleEntry() {
		if (input() == "ENTER CAR") {
			return carEntryEvent();
		}
		if (input() == "ENTER TRUCK") {
			return truckEntryEvent();
		}

		return vehicleEntry();
	}

	@Override
	public int vehicleExit() {
		if (input() == "EXIT CAR [0-9]+") {
			return (carExitEvent() & calculateCarFees());
		}
		if (input() == "EXIT TRUCK [0-9]+") {
			return truckExitEvent() & calculateTruckFees();
		}

		return vehicleExit();
	}

	@Override
	public String splitCarInput(String vehicleEntry) {
		return vehicleEntry.substring(10);
	}
	@Override
	public int calculateCarFees() {
		int hoursInCarPark = ((Integer.parseInt(splitCarInput(null))) * 2);
		return (carParkReport[7]++)*(hoursInCarPark);
	}
	@Override
	public String splitTruckInput(String vehicleEntry) {
		return vehicleEntry.substring(12);
	}
	@Override
	public int calculateTruckFees() {
		int hoursInCarPark = (Integer.parseInt(splitTruckInput(null))) * 3;
		return (carParkReport[7]++)*(hoursInCarPark);
	}
	@Override
	public String input() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

}
