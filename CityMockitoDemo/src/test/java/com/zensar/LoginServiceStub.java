package com.zensar;


public class LoginServiceStub implements LoginService{

	@Override
	public boolean authenticate(String username, String password) {
		
		if(username.equalsIgnoreCase("Rahul") && password.equalsIgnoreCase("Rahul"))
		{
			return true;
		}
		else
		{
		return false;
		}
	}

}
