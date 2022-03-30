package com.zensar;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.junit.Test;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class BusinessAppMockTest {

	
	@Test
	public void testMockVsSpy() {
		List<String> mockList = mock(List.class);
		mockList.add("ABC");
		mockList.add("XYZ");
		
		System.out.println("Mock :-  "+mockList.get(0));
	
	List<String> list = new ArrayList<String>(); 
	List<String> spyList = spy(list);
	spyList.add("ABC");
	spyList.add("XYZ");
	
	System.out.println("Spy Mock : - "+spyList.get(0));
	}
	
	
	@Test
	public void testBusinessApp() {
		CityService  cityservice = mock(CityService.class);
		LoginService loginService = mock(LoginService.class);
	    when(cityservice.findCitiesByCountries("INDIA")).thenReturn(Arrays.asList("Pune","Mumbai","Delhi"));
	    when(cityservice.findCitiesByCountries("USA")).thenReturn(Arrays.asList("Washington","New York","Francisco"));

	    when(cityservice.findCitiesByCountries(anyString())).thenReturn(Arrays.asList("city1","city2","city3"));
	    
	    when(loginService.authenticate("Rahul", "Rahul")).thenReturn(true);
	   
	 //   BusinessApp businessApp = new BusinessApp(cityservice,loginService);
	  //  assertEquals(businessApp.retrieveCityListByCountry("INDIA").size(), 3);
	    
	   // assertEquals(businessApp.login("Rahul", "Rahul"), true);
	}
	

}
