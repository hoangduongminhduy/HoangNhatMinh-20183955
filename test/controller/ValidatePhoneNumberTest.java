package controller;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidatePhoneNumberTest {
	private boolean expected;
	private String input;
	private PlaceOrderController placeOrderController;
	
	public ValidatePhoneNumberTest() {
		placeOrderController = new PlaceOrderController();
	}	
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void test() {
		expected = true;
		input = "0123456789";
		assertEquals(expected, placeOrderController.validatePhoneNumber(input));
	}
}
