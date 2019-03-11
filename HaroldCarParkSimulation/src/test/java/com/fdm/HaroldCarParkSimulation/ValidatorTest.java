package com.fdm.HaroldCarParkSimulation;

import org.junit.Before;
import org.junit.Test;

public class ValidatorTest {
	
	private Validator validator;
	
	@Before
	public void setUp() {
		validator = new Validator();
	}
	
	@Test(expected = InputInvalidException.class)
	public void when_user_input_has_no_spaces() throws InputInvalidException{
		validator.validate("(ENTER).*");
	}
	
	
	

}
