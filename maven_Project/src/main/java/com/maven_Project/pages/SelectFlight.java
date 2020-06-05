package com.maven_Project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {
	
	WebDriver driver;
	public SelectFlight()
	{
		PageFactory.initElements(driver, this);
	}
	public SelectFlight(WebDriver ldriver)  // constructor
	{
		this.driver=ldriver;
	}
	
	@FindBy(xpath = "//input[@name='outFlight' and  @value='Blue Skies Airlines$360$270$5:03']")
	private WebElement FLight1;
	
	public void Flight1()
	{
		FLight1.click();
	}
	@FindBy(xpath = "//input[@name='outFlight' and  @value='Blue Skies Airlines$361$271$7:10']")
	private WebElement Flight2;
	
	public void Flight2() 
	{
		Flight2.click();
		
	}
	@FindBy(xpath = "//input[@name='outFlight' and  @value='Pangea Airlines$362$274$9:17']")
	private WebElement Flight3;
	
	public void Flight3()
	{
		Flight3.click();
	}
	@FindBy(xpath = "//input[@name='outFlight' and  @value='Unified Airlines$363$281$11:24']")
	private WebElement Flight4;
	
	public void Flight4() 
	{
		Flight4.click();
		
	}
//Return
	@FindBy(xpath = "//input[@name='inFlight' and  @value='Blue Skies Airlines$630$270$12:23']")
	private WebElement Return_Flight1;
	
	public void Re_Flight1()
	{
		Return_Flight1.click();
	}
	@FindBy(xpath = "//input[@name='inFlight' and  @value='Blue Skies Airlines$631$273$14:30']")
	private WebElement Return_Flight2;
	
	public void Re_Flight2() 
	{
		Return_Flight2.click();
		
	}
	@FindBy(xpath = "//input[@name='inFlight' and  @value='Pangea Airlines$632$282$16:37']")
	private WebElement Return_Flight3;
	
	public void Re_Flight3()
	{
		Return_Flight3.click();
	}
	@FindBy(xpath = "//input[@name='inFlight' and  @value='Unified Airlines$633$303$18:44']")
	private WebElement Return_Fligth4;
	
	public void Re_Flight4()
	{
		Return_Fligth4.click();
	}
	@FindBy(xpath = "//input[@name='reserveFlights']")
	private WebElement Continue2;
	
	public void Continue2()
	{
		Continue2.click();
	}

}
