package com.fdm.HaroldCarParkSimulation;

import java.util.Scanner;

public class UserInputView implements IView {
	
	Scanner scanner = new Scanner(System.in);
	
	public Scanner scannerInput() {
		Scanner scanner = new Scanner(System.in);
		
		return scanner;
	}
	
	public void println(String message) {
		System.out.println(message);
	}
	
	public int nextInt() {
		int spacesAvailable = scanner.nextInt();
		
		return spacesAvailable;
	}
	
	public String nextLine() {
		String inputEvent = scanner.nextLine();
		
		return inputEvent;
	}
	
	public boolean hasNextLine() {
		boolean inputCheck = scanner.hasNextLine();
		
		return inputCheck;
	}

	
	
	
//		System.out.println("How many spaces does the car park have?");
//
//		String carParkSpaces = scanner.nextLine();
//
//		System.out.println("Please type ENTER CAR or ENTER TRUCK to add a vehicle to car park.");
//
//		String vehicleInput = scanner.nextLine();
//		
//		UserInputView uiv = new UserInputView();
//		
//		
////	    uiv.getInput(vehicleInput);
////		uiv.getInt(carParkSpaces);
//		scanner.close();
//	}
//	
//	private void getInt(int carParkSpaces) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public String getInput() {
//		Scanner scanner = new Scanner(System.in);
//		if (scanner.hasNext()) {
//			return scanner.nextLine();
//		}
//		return null;
//	}
//
}