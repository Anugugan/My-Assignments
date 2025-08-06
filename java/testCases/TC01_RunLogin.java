package testCases;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.LoginPage;

public class TC01_RunLogin extends BaseClass {
	@Test
	public void runLogin() {
	LoginPage lp=new LoginPage();
	lp.enterUserName().enterPassWord().clickOnLogin();
	}
}

