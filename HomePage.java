package com.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.generic.Pojo;


public class HomePage {

	private Pojo objPojo;
	
	public HomePage(Pojo pojo) {
		this.objPojo = pojo;
	}
	
	By Loc_txtHomeInHomePage = By.xpath("//div[@class='pull-left hometext']");
	
	By Loc_butNotification = By.xpath("//div[@id='messages']");
	By Loc_butPortFoliaPage = By.xpath("//div[@class='col-sm-12 pl-0 pr-0 pb10 brdrbtm pt10']");
	By Loc_butPortFolioProductBuild = By.xpath("//a[@class='PortFolioProductBuild ui-tabs-anchor']");
	By Loc_butPortFolioPackageBuild = By.xpath("//a[@class='PortFolioPackageBuild ui-tabs-anchor']");
	By Loc_buteBSConfig = By.xpath("//div[@class='bluetext']");
	By Loc_butQuotes = By.xpath("//div[@class='col-sm-12 pl-0 pr-0 pb10 pt10 brdrbtm']");
	By Loc_selQuotesSelectForFilter = By.xpath("//select[@id='drpsearchTypeFilter']");
	By Loc_selQuotesSelectForModeLoad = By.xpath("//select[@id='drpViewModeLoad']");
	By Loc_seaQuotesSearchButton = By.xpath("//button[@id='switchToadvanceSearch']");
	By Loc_inpQuotesSearch = By.xpath("//input[@class='search-field']");
	By Loc_butQuotesAccount = By.xpath("//button[@id='btnManageAccountAdd']");
	By Loc_inpQuotesAccountName = By.xpath("//input[@id='accountname']");
	By Loc_butQuotesAccountSave = By.xpath("//button[@id='accountname']");     
		
	public String getHomeTextOnHomePage() {
	String strHomeText = objPojo.getDriver().findElement(Loc_txtHomeInHomePage).getText();
	return strHomeText;
	}
	
	public void verifyHomeTextIsDisplayedInHomePage() {
		if(this.getHomeTextOnHomePage().equals("Home")) {
		System.out.println("Test passed");
		}
		else {
			System.out.println("Test not passed");
		}
	}
	
	public void checkNotification() {
		objPojo.getDriver().findElement(Loc_butNotification).click();
	}
	
	public void checkPortFolio() {
		objPojo.getDriver().findElement(Loc_butPortFoliaPage).click();
	}
	public void checkinsidePortFolioProductBuild() {
	//	Actions actions = new Actions(objPojo.getDriver());
	    WebElement element=	objPojo.getDriver().findElement(Loc_butPortFolioProductBuild);
	    element.click();
	//   actions.moveToElement(element);
	}
	public void checkinsidePortFolioPackageBuild() {
		objPojo.getDriver().findElement(Loc_butPortFolioPackageBuild).click();
	}
	
	public void checkebsConfigPortPolio() {
		objPojo.getDriver().findElement(Loc_buteBSConfig).click();		
	}
	
	public void checkQuotes() {
		objPojo.getDriver().findElement(Loc_butQuotes).click();
	}
	
	public void selectQuotes() {
	WebElement element = objPojo.getDriver().findElement(Loc_selQuotesSelectForFilter);
	Select selectFilter = new Select(element);
	selectFilter.selectByVisibleText("Account");  
	}
	
	public void selectQuotesForModeLoad() {
		WebElement element = objPojo.getDriver().findElement(Loc_selQuotesSelectForModeLoad);
		Select selectLoad = new Select(element);
		selectLoad.selectByVisibleText("Summary");
   }
	
	public void checkSearchButton() {
		objPojo.getDriver().findElement(Loc_seaQuotesSearchButton).click();
	
		WebElement elementSearch = objPojo.getDriver().findElement(Loc_inpQuotesSearch);
		elementSearch.sendKeys("Search_inf");
		elementSearch.click();
	}
	
	public void createAccount() {
		objPojo.getDriver().findElement(Loc_butQuotesAccount).click();
		
		objPojo.getDriver().findElement(Loc_inpQuotesAccountName).sendKeys("Name");
		
		objPojo.getDriver().findElement(Loc_butQuotesAccountSave).click();

	}   
}



