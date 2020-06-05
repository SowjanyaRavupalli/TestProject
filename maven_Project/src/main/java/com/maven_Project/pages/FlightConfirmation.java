package com.maven_Project.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightConfirmation {
	WebDriver driver;
	public FlightConfirmation()
	{
		PageFactory.initElements(driver, this);
	}
	public FlightConfirmation(WebDriver ldriver)  // constructor
	{
		this.driver=ldriver;
	}
	@FindBy(xpath = "//img[@src='/images/forms/Logout.gif']")
	private WebElement Logout;
	
	public void Logout()
	{
		Logout.click();
	}

}
