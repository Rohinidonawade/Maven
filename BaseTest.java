package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class BaseTest extends Pojo{

    private WebDriver driver;
    private String strBaseURL;
	
	public void initilizeOfWebDriver() {
		
	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		strBaseURL =("https://ebs4-qa2.simplifyhealthcare.com/");
		this.setBaseURL(strBaseURL);		
		driver.get(this.getBaseURL());
		this.setDriver(driver);
		driver.manage().window().maximize();		
	}
	
	public void tearDown() {
		driver.quit();
	}
}
