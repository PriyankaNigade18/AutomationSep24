package com.DataDrivenTesting;

import org.testng.annotations.DataProvider;

public class CustomData {

	@DataProvider(name="arraydata")
	public Object[][] testData()
	{
		Object data[][]= {{"Admin","admin123"},{"Kiran","test123"},{"Admin","admin123"},{"Ram","test123"}};
		return data;
	}
}
