package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {

@Test(priority = 1)
	public void method1()
	{
		System.out.println("m1 executing");
	}
@Test(priority = 0)
	public void method2()
	{
	System.out.println("m2 executing");
	}
@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod executing");
		
	}
@AfterMethod
	public void afterMethod() {
	System.out.println("afterMethod Executuing");
	
}


}
