package com.maven_Project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyLoginNew {
	
	WebDriver driver;
	
	public VerifyLoginNew(WebDriver ldriver) 
	{
		this.driver=ldriver;
		
	}
	
	@FindBy(name="userName")
	private WebElement Username;
	 
	public void Username(String Uname)
	{
		Username.sendKeys(Uname);
	}
	
	
	@FindBy(name = "password") 
	private WebElement Password;
	
	public void Password(String Pword)
	{
		Password.sendKeys(Pword);
	}
	
	@FindBy(xpath ="//input[@name='login']")
	private WebElement Login;
	
	public void Login()
	{
		Login.click();
	 }		
		
	}
	