package com.pageFactory;

import org.openqa.selenium.By;

import com.generic.Pojo;

public class LoginPage {

	private Pojo objPojo;
	
	public LoginPage(Pojo pojo) {
		this.objPojo = pojo;
	}
	
	By Loc_inpName = By.xpath("//input[@id='UserName']");
	By Loc_inpPassword = By.xpath("//input[@id='Password']");
	By Loc_butSubmit = By.xpath("//button[@class='btn btn-lg btn-primary btn-block btn-signin']");  
	
	public void setUserName(String strUserName) {
		objPojo.getDriver().findElement(Loc_inpName).sendKeys(strUserName);		
	}
	
	public void setUserPassword(String strPassword) {
		objPojo.getDriver().findElement(Loc_inpPassword).sendKeys(strPassword);		
	}
	
	public void submitButton() {
		objPojo.getDriver().findElement(Loc_butSubmit).click();		
	}
	
}
