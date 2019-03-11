package com.fdm.HaroldCarParkSimulation;

import static org.mockito.Mockito.*;
import org.junit.Test;

public class ControllerTest {

	@Test
	public void when_user_inputs_should_get_string() {
		IView view = mock(IView.class);
		IValidator validator = mock(IValidator.class);
		ICarPark carPark = mock(ICarPark.class);
		Controller controller = new Controller(view, validator, carPark);
		
		controller.handle();
		
		verify(view).getInput();
	}
	
	@Test
	public void can_receive_number_of_carpark_spaces_available() throws InputInvalidException {
		IView view = mock(IView.class);
		IValidator validator = mock(IValidator.class);
		ICarPark carPark = mock(ICarPark.class);
		Controller controller = new Controller(view, validator, carPark);
		when(view.getInput()).thenReturn("10", "CAR ENTER", "QUIT");
		when(carPark.input("10")).thenReturn(3.0);
		
		controller.handle();
		
		verify(validator).validate("ENTER CAR");
	}
	
	@Test
	public void when_quit_is_called_close_scanner() throws InputInvalidException {
		IView view = mock(IView.class);
		IValidator validator = mock(IValidator.class);
		ICarPark carPark = mock(ICarPark.class);
		Controller controller = new Controller(view, validator, carPark);
		when(view.getInput()).thenReturn("%");
		doThrow(new InputInvalidException("This input is not valid")).when(iValidator).validate("%");
		
		controller.handle();
		
		verify(validator).validate("%");
		verify(view).display("This input is not valid");
	}
	
	@Test
	public void if_valid_input_then_display_valid_response() {
		IView view = mock(IView.class);
		IValidator validator = mock(IValidator.class);
		ICarPark carPark = mock(ICarPark.class);
		Controller controller = new Controller(view, validator, carPark);
		when(view.getInput()).thenReturn("REPORT");
		
		controller.handle();
		
		verify(view).display("Cars Entered: 1");
	}
}
