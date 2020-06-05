package com.maven_Project.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFacotry {
	
	static WebDriver driver;
	
	public static WebDriver StartBrowser(String browserName , String url) {
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chromedriver"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/Users/dravupalli/eclipse-workspace/MavenProject/maven_Project/drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("internet explorer"))
		{
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		
		return  driver;
	}
}
