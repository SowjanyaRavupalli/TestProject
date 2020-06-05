package maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.maven_Project.pages.BookFlight;
import com.maven_Project.pages.BrowserFacotry;
import com.maven_Project.pages.FlightConfirmation;
import com.maven_Project.pages.FlightFinder;
import com.maven_Project.pages.SelectFlight;
import com.maven_Project.pages.VerifyLoginNew;



public class VerifyLogin {
	
	@Test

	public void verifyValidLogin()
	{
		//this will launch  the browser
		WebDriver driver=BrowserFacotry.StartBrowser("chromedriver", "http://newtours.demoaut.com/");
		//created page object using page factory
		VerifyLoginNew login_page = PageFactory.initElements(driver, VerifyLoginNew.class);
		//call the method
		login_page.Username("mercury");
		login_page.Password("mercury");
		login_page.Login();
	
	FlightFinder f1= PageFactory.initElements(driver,FlightFinder.class);		
		
//		FlightFinder f1 = new FlightFinder();
		//f1.strType();
			f1.strType2();
		
//Passenger Data		
		Select sel=new Select(f1.passengerDropDown());
		sel.selectByIndex(0);
//Departing Data
		
		Select DP= new Select(f1.DeaprtingFrom());
		DP.selectByIndex(3);
//Month 
		
		Select Mon= new Select(f1.Month_dep());
		Mon.selectByIndex(9);
//from Day
		
		Select onday= new Select(f1.From_day());
		onday.selectByIndex(5);
//Arriving
		
		Select Arriving = new Select(f1.Arriving_In());
		Arriving.selectByVisibleText("New York");
//Returning
		
		Select Return= new Select(f1.Return());
		Return.selectByIndex(4);
//to day	
		
		Select Day_to = new Select(f1.Return_day());
		Day_to.selectByVisibleText("22");
//service Class			
		
		//f1.Service_class();
		 //f1.Service_class1();
		   f1.Service_class2();
//Airlines
		
		Select airlines=new Select(f1.airlines());
		airlines.selectByIndex(2);

		f1.Continue();

// Select Flight Depart
	    SelectFlight f2= PageFactory.initElements(driver, SelectFlight.class);
	         f2.Flight2();
//Select Flight Return
	         f2.Re_Flight3();
// continue
	         f2.Continue2();
	
//Book A Flight
	 //Passenger
	     BookFlight f3= PageFactory.initElements(driver,BookFlight.class);
	             f3.Passenger_name("Ravupalli");
	             f3.Passenger_Last("Sowjanya");
	        Select Meals= new Select(f3.Meals());
	        Meals.selectByIndex(1);
	//Credit card
	        Select Cards = new Select(f3.Cards());
	        Cards.selectByIndex(1);
	          f3.CreditCard_number("1234293849345");
	        Select Exp_month= new Select(f3.Exp_month());
	        Exp_month.selectByIndex(2);
	        Select Exp_year= new Select(f3.Exp_year());
	        Exp_year.selectByIndex(2);
	        f3.CC_FirstName("Ravupalli");
	        f3.CC_MidName("Devi");
	        f3.CC_LastName("Sowjanya");
	        f3.BillAddress("House number-1234");
	        f3.BillAddress2("The gravyyard street");
	        f3.City("New york");
	        f3.State("CU");
	        f3.Postal_code("098756467");
	        Select Country=new Select(f3.Contry());
	        Country.selectByIndex(1);
	        f3.SameAddress();
	        f3.secure_purchase(); 
	        
//Flight Logout
	        FlightConfirmation f4= PageFactory.initElements(driver, FlightConfirmation.class);
	        f4.Logout();
	        
//Close browser
	        
	        
	         }		
	}

