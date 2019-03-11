package com.fdm.HaroldCarParkSimulation;

public class Validator implements IValidator {
	UserInputView userInputView = new UserInputView();
	String userInput = userInputView.nextLine();
	public void validate(String userInput) throws InputInvalidException {
		
		System.out.println(userInput);
		
		if (userInput.matches("(ENTER).*")) {
			throw (new InputInvalidException ("Input contains no spaces between ENTER and vehicle symbol"));
		}	
	}
}
