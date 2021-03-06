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
class ValidateRushOrderLocationTest {

	private PlaceRushOrderController placeRushOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeRushOrderController = new PlaceRushOrderController();
	}

	@ParameterizedTest
    @CsvSource({
            "Ha Noi,true",
            "fsda 8*,false"
    })
	
	@Test
	void test(String cityName, boolean expected) {
		//when
		boolean isValid = placeRushOrderController.validateLocation(cityName);
		//then
		assertEquals(expected, isValid);
	}

}
