package com.TestNG;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	@DataProvider(name="dataproviderMethod")

	public Object[][] dataProviderMethod()
	{
		return new Object[][] {
			{"name1","name2"},
			{"name3","name4"},
			{"name5","name6"},
		};
		
	}
	@Test(dataProvider = "dataproviderMethod")
	public void method(String name, String Value)
	{
		System.out.println(name+":::"+Value);
	}
	
	
}
