package com.fdm.HaroldCarParkSimulation;

public class RunCarParkController{

	

	public static void main(String[] args) {
		UserInputView userInputView = new UserInputView();
		Validator validator = new Validator();
		CarParkModel carParkModel = new CarParkModel();
		Controller controller = new Controller(userInputView, validator, carParkModel);
		
		controller.handle();
	}

}
