package day10.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

 class TestEmailValidator {
	
	@Test
	void testEmail() {
		
		String email = "arun@gmail.com";
		
		try {
			assertTrue(new ValidateUser().isValidEmail(email));
		} catch (InvalidEmailException e) {
			e.printStackTrace();
		}
	}

}