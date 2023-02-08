package com.controller;

import java.util.Arrays;

public class UpdateOfficeException extends RuntimeException {
	
	public UpdateOfficeException()
	{
		super("updated based on exception");
	}

	@Override
	public String toString() {
		return "updated based on exception";
	}
	

}
