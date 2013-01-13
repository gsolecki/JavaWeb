package com.gsezone.services;

import org.springframework.beans.factory.BeanNameAware;

public class MyUserService implements BeanNameAware {

	private String name;

	public String getName() {
		return "My name is Frank :: " + this.hashCode() + ". I am bean " + name;
	}

	public void setBeanName(String name) {
		this.name = name;
	}

}
