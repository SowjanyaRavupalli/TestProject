package com.maven_Project.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightFinder {
	
	WebDriver driver;
	public FlightFinder()
	{
		PageFactory.initElements(driver, this);
	}
	
	public FlightFinder(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy(xpath="//input[@name='tripType' and @type='radio']")
	private WebElement strType1;
	
	public void  strType()
	{
		strType1.click();
		
	}
	
	@FindBy(xpath = "//input[@name='tripType' and  @value='oneway']")
	private WebElement strType2;
	
	public void strType2()
	{
		strType2.click();
	}
	@FindBy(name="passCount")
	private WebElement passengerDropDown;
	
	public WebElement passengerDropDown()
	{
		return passengerDropDown;
	}
	
	@FindBy(name="fromPort")
	private WebElement DeaprtingFrom;
	
	public WebElement DeaprtingFrom()
	{
		return DeaprtingFrom;
	}
	
	@FindBy(name="fromMonth")
	private WebElement Month_dep;
	
	public WebElement Month_dep() 
	{
	   return Month_dep;
	}
	
	@FindBy(name="fromDay")
	private WebElement From_day;
	
	public WebElement From_day()
	{
		return From_day;
		
	}
	
	@FindBy(name="toPort")
	private WebElement Arriving;
	
	public WebElement Arriving_In()
	{
		return Arriving;
	}
	@FindBy(name="toMonth")
	private WebElement Return;
	
	public WebElement Return()
	{
		return Return;
	}
	@FindBy(name="toDay")
	private WebElement Return_day;
	
	public WebElement Return_day()
	{
		return Return_day;
	}
	@FindBy(name="servClass")
	private WebElement service;
	
	public void Service_class()
	{
		service.click();
	}
	@FindBy(xpath="//input[@name='servClass' and  @value='Business']")
	private WebElement Service1;
	
	public void Service_class1()
	{
		Service1.click();
	}
	@FindBy(xpath = "//input[@name='servClass' and  @value='First']")
	private WebElement Servcie2;
	
	public void Service_class2()
	{
		Servcie2.click();
	}
	
	@FindBy(name="airline")
	private WebElement Airline;
	
	public WebElement airlines()
	{
		return Airline;
	}
	 @FindBy(xpath="//input[@name='findFlights']")
	 private WebElement continue_button;
	 
	 public void  Continue()
	 {
		 continue_button.click();
	 }
	
}


