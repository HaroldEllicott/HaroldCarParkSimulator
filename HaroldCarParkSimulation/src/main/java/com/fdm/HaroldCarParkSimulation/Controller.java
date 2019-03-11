package com.fdm.HaroldCarParkSimulation;

import java.util.Scanner;

public class Controller {
	private UserInputView userInputView;
	private Validator validator;
	private CarParkModel carParkModel;
	public Scanner scanner;
	public Controller(UserInputView userInputView, Validator validator, CarParkModel carParkModel) {
		this.userInputView = userInputView;
		this.validator = validator;
		this.carParkModel = carParkModel;
}
	public String handle( ) {
		String s;
		
		try {
			String userInput = userInputView.nextLine();
			validator.validate(userInput);
		} catch (InputInvalidException e) {
			
			e.getMessage();
		}
		
		userInputView.println("How many car park spaces are available?");
		
		userInputView.nextInt();
		
		userInputView.println("What vehicle is entering the car park? (Car or Truck)");
		
		userInputView.nextLine();
	
		
	    while ((s = userInputView.nextLine()) != "QUIT") {
	    	userInputView.nextLine();
		
		switch(userInputView.nextLine()) {
		case ("ENTER CAR"):
			carParkModel.carEntryEvent();
			break;
		case ("ENTER TRUCK"):
			carParkModel.truckEntryEvent();
			break;
		case ("EXIT CAR [0-9]+"):
			carParkModel.splitCarInput(userInputView.nextLine());
			carParkModel.calculateCarFees();
			carParkModel.carExitEvent();
			break;
		case ("EXIT TRUCK [0-9]+"):
			carParkModel.splitTruckInput(userInputView.nextLine());
			carParkModel.calculateTruckFees();
			carParkModel.truckExitEvent();
			break;
		case ("REPORT"):
			System.out.println("Cars Entered: " + carParkModel.carParkReport[0]);
			System.out.println("Trucks Entered: " + carParkModel.carParkReport[1]);
			System.out.println("Cars Exited: " + carParkModel.carParkReport[2]);
			System.out.println("Trucks Exited: " + carParkModel.carParkReport[3]);
			System.out.println("Parking Cars: " + carParkModel.carParkReport[4]);
			System.out.println("Parking Trucks: " + carParkModel.carParkReport[5]);
			System.out.println("Spaces Available: " + carParkModel.carParkReport[6]);
			System.out.println("Fees Paid: " + carParkModel.carParkReport[7]);
			break;
		case ("QUIT"):
			scanner.close();
			break;
			
			
		  default:
		    // code block
		}
	    }
		boolean checkNextLine = userInputView.hasNextLine();
		boolean checKNextLine = true;
		if (checkNextLine == true) {
			return (userInputView.nextLine());
		}
		return null;

	}
	
	  
	
	
	
	
}