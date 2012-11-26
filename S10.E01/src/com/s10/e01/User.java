package com.s10.e01;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name = "It is me User";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
