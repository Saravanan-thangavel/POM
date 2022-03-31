package TestLeaf;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PomBase.BaseClass;
import WebPages.CreateLead;
import WebPages.CrmFA;
import WebPages.Login;

public class TestLeaf2 extends BaseClass {
	@BeforeTest
	public void setfilename() {
		fileName="Login2";

	}
	@Test(dataProvider = "getData")
	public void runLogin(String[] data) {
		Login l = new Login(driver);
		boolean userLabel = l.getUserLabel();
		Assert.assertEquals(userLabel, true);
		Boolean passwordLabel = l.getPasswordLabel();
		Assert.assertTrue(passwordLabel);
		new Login(driver).username(data[0]).password(data[1]).clickLogin();
		CrmFA c = new CrmFA(driver); c.crmsf(); c.clickLeads(); c.clickMyLeads();
		  c.clickCreateLead(); 
		  new CreateLead(driver).companyName(data[2]).firstName(data[3]).lastname(data[4]).sourceValue(data[5])
		  .marketingCamp(data[6]).firstLocal(data[7]).lastLocal(data[8]).title(data[9])
		  .birthDate().generalProfile(data[10]).deptName(data[11]).annuvalReve(data[12]).currencyUom(data[13])
		  .industryE(data[14]).Ownership(data[15]).other().create();
		
	}

}
