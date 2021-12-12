package controller;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.PlaceRushOrderController;
/**
 * 
 * @author HoangNhatMinh-20183955
 *
 */
class ValidateRushOrderInstructionTest {

	private PlaceRushOrderController placeRushOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeRushOrderController = new PlaceRushOrderController();
	}

	@ParameterizedTest
    @CsvSource(value = {
    	"Toi o tang 11,true",
        "abc@#$#*,false",
        "null,false"
    })
	
	@Test
	void test(String instruction, boolean expected) {
		//when
		boolean isValid = placeRushOrderController.validateRushOrderInstruction(instruction);
		//then
		assertEquals(expected, isValid);
	}

}
