package day10.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Day10.Practice.UserAlreadyExistsException;
import model.User;
import Day10.Practice.RegisterUser;

class TestRegisterUser {

	@Test
	void testUser1() {
		RegisterUser user1 = new RegisterUser();
		RegisterUser newuser = new RegisterUser();
		
		try {
			user1.register(newuser);
			ArrayList<User> arr = user1.getArr();
			assertEquals("gopi@gmail.com",arr.get(arr.size()-1).getEmailId());
		} catch (UserAlreadyExistsException e) {
			e.printStackTrace();
		}

	}

}