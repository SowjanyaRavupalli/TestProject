package com.maven_Project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookFlight {
	WebDriver driver;
	public BookFlight()
	{
		PageFactory.initElements(driver, this);
	}
	public BookFlight(WebDriver ldriver)  // constructor
	{
		this.driver=ldriver;
	}
    @FindBy(name="passFirst0")
    private WebElement Passenger_name;
    
    public void  Passenger_name(String FirstName)
    {
    	Passenger_name.sendKeys(FirstName);
    }
    @FindBy(xpath = "//input[@name='passLast0']")
    private WebElement Passenger_Lname;
    
    public void Passenger_Last(String LastName)
    {
    	Passenger_Lname.sendKeys(LastName);
    }
    @FindBy(xpath = "//select[@name=\"pass.0.meal\"]")
    private WebElement Meals;
    
    public WebElement Meals()
    {
    	return Meals; 
    }
    @FindBy(xpath = "//select[@name='creditCard']")
    private WebElement Card;
    
    public WebElement Cards()
    {
    	return Card;
    }
    @FindBy(name = "creditnumber")
    private WebElement Number;
    
    public void CreditCard_number(String Num)
    {
    	Number.sendKeys(Num);
    }
    @FindBy(xpath = "//select[@name='cc_exp_dt_mn']")
    private WebElement Exp_month;
    
    public WebElement Exp_month()
    {
    	return Exp_month;
    }
    @FindBy(xpath = "//select[@name='cc_exp_dt_yr']")
    private WebElement Exp_year;
    
    public WebElement Exp_year()
    {
    	return Exp_year;
    }
    @FindBy(name="cc_frst_name")
    private WebElement CC_FirstName;
    
    public void CC_FirstName(String CC_Frstname)
    {
          CC_FirstName.sendKeys(CC_Frstname);
    }
    @FindBy(name="cc_mid_name")
    private WebElement CC_MidName;
    
    public void CC_MidName(String CC_Midname)
    {
    	CC_MidName.sendKeys(CC_Midname);
    }
    @FindBy(name="cc_last_name")
    private WebElement CC_Lastname;
    
    public void CC_LastName(String CC_Lstname)
    {
    	CC_Lastname.sendKeys(CC_Lstname);
    }
    @FindBy(name ="billAddress1")
    private WebElement BillAddress1;
    
    public void BillAddress(String BillAddress)
    {
    	BillAddress1.sendKeys(BillAddress);
    }
    @FindBy(name="billAddress2")
    private WebElement BillAddress2;
    
    public void BillAddress2(String billAddress2)
    {
    	BillAddress2.sendKeys(billAddress2);
    }
    @FindBy(name = "billCity")
    private WebElement City;
    
    public void City(String city)
    {
    	City.sendKeys(city);
    }
    @FindBy(name ="billState")
    private WebElement State;
    
    public void State(String state)
    {
    	State.sendKeys(state);
    }
    @FindBy(name = "billZip")
    private WebElement Postal_code;
    
    public void Postal_code(String code)
    {
    	Postal_code.sendKeys(code);
    }
    @FindBy(name="billCountry")
    private WebElement Country;
    
    public WebElement Contry()
    {
    	return Country;
    }
    @FindBy(name ="ticketLess")
    private WebElement SameAddress;
    
    public void SameAddress()
    {
    	SameAddress.click();
    }
    @FindBy(xpath = "//input[@name='buyFlights']")
    private WebElement secure_purchase;
    
    public void secure_purchase()
    {
    	secure_purchase.click();
    }
}

