package testCases;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.LoginPage;

public class TC02_CreateLead extends BaseClass {
	@Test
	public void runCreateLead() {
		LoginPage lp=new LoginPage();
		lp.enterUserName().enterPassWord().clickOnLogin().clickOnAppLauncher().clickOnViewAll().
		clickOnSales().clickOnLeads().clickOnNew().enterSalutation().enterFirstName().enterLastName().
		enterCompanyName().enterLeadStatus().clickOnSave().verifyLeadName();
	}

}
