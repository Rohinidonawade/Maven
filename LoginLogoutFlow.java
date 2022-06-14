package com.flows;

import com.generic.Pojo;
import com.pageFactory.HomePage;
import com.pageFactory.LoginPage;

public class LoginLogoutFlow {
	
	private Pojo objPojo;
	private LoginPage objLoginPage;
	private HomePage objHomePage;
	
	public LoginLogoutFlow(Pojo pojo) {
		this.objPojo= pojo;
		objLoginPage = new LoginPage(objPojo);
	}

	public void doLogin() {
	objLoginPage.setUserName("v-khushbut");
	objLoginPage.setUserPassword("Summer@2018#");
	objLoginPage.submitButton();
   }
}
