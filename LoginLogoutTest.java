package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flows.LoginLogoutFlow;
import com.generic.BaseTest;
import com.pageFactory.HomePage;
import com.pageFactory.LoginPage;

public class LoginLogoutTest extends BaseTest{
	
	private LoginPage objLoginPage;
	private LoginLogoutFlow objLoginLogoutFlow;
	private HomePage objHomePage;
	
	public void initilizeWebPages() {
		objLoginPage= new LoginPage(this);
		objLoginLogoutFlow = new LoginLogoutFlow(this);
		objHomePage = new HomePage(this);
	}
	
	@BeforeClass
	public void initializeOfWebEnvir() {
		this.initilizeWebPages();
		this.initilizeOfWebDriver();
	}

	@AfterClass
	public void tearDownEnv() {
		this.tearDown();
	}
	
	@Test
	public void TC_01_VerifyPortfolioPageDisplay() {
		objLoginLogoutFlow.doLogin();
		objLoginPage.setUserName("v-khushbut");
		objLoginPage.setUserPassword("Summer@2018#");
		objLoginPage.submitButton();
		objHomePage.verifyHomeTextIsDisplayedInHomePage();
    	objHomePage.checkNotification();
		objHomePage.checkPortFolio();
		this.setImplicitWait(30);
		objHomePage.checkinsidePortFolioProductBuild();
		objHomePage.checkinsidePortFolioPackageBuild();
		objHomePage.checkebsConfigPortPolio();
		objHomePage.checkQuotes();
		objHomePage.selectQuotes();
		objHomePage.selectQuotesForModeLoad();
		objHomePage.checkSearchButton();
		objHomePage.createAccount();    
	}
}
