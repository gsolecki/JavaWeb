package com.gsezone.services;

import org.springframework.beans.factory.annotation.Autowired;


public class MySingleton {
	
	@Autowired
	private MyUserService myUserService;
	
	public void introduceYourself() {
		
		System.out.println("Hello. I am " + this.hashCode());
		
		System.out.println(getMyUserService().getName());
		
	}

	public MyUserService getMyUserService() {
		return myUserService;
	}

	public void setMyUserService(MyUserService myUserService) {
		this.myUserService = myUserService;
	}
	
}
