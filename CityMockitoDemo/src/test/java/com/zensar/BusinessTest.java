package com.zensar;

import static org.junit.Assert.*;

import org.junit.Test;

public class BusinessTest {

	@Test
	public void testBusinessApp() {
		CityService  cityService = new CityServiceStub();
		LoginService loginService = new LoginServiceStub();
	    BusinessApp businessApp = new BusinessApp(cityService,loginService);
	    
	    assertEquals(businessApp.login("Rahul", "Rahul"), true);
	    
	    assertEquals(businessApp.retrieveCityListByCountry("INDIA").size(), 3);
	}

}
