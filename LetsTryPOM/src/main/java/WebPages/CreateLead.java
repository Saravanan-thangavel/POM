package WebPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import PomBase.BaseClass;
import net.bytebuddy.description.modifier.Ownership;

public class CreateLead extends BaseClass {
	public CreateLead(ChromeDriver driver) {
		this.driver = driver;
	}

	public CreateLead companyName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		return this;

	}

	public CreateLead firstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;

	}

	public CreateLead lastname(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;

	}

	public CreateLead sourceValue(String value) {
		WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dp1 = new Select(drop1);
		dp1.selectByValue(value);
		return this;
	}

	public CreateLead marketingCamp(String mCamp) {
		WebElement drop2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dp2 = new Select(drop2);
		dp2.selectByValue(mCamp);
		return this;

	}

	public CreateLead firstLocal(String fLocal) {
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(fLocal);
		return this;

	}

	public CreateLead lastLocal(String lLocal) {
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys(lLocal);
		return this;

	}

	public CreateLead title(String tit) {
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys(tit);
		return this;

	}

	public CreateLead birthDate() {
		
		  driver.findElement(By.name("birthDate")).sendKeys("03/12/21");
		  return this;
				/*
				 * new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.
				 * visibilityOfAllElementsLocatedBy(By.xpath("//div[@class=\"calendar\"]/table")
				 * )); String text =
				 * driver.findElement(By.xpath("(//div[@class=\"calendar\"]//tr)[1]")).getText()
				 * ; System.out.println(text); String month = text.split(" ")[0].trim(); String
				 * year = text.split(" ")[0].trim();
				 */
	}

	public CreateLead generalProfile(String gProf) {
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(gProf);
		return this;

	}

	public CreateLead deptName(String dName) {
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(dName);
		return this;
	}

	public CreateLead annuvalReve(String annuRev) {
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys(annuRev);
		return this;

	}

	public CreateLead currencyUom(String curr) {
		WebElement drop3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dp3 = new Select(drop3);
		dp3.selectByValue(curr);
		return this;

	}

	public CreateLead industryE(String ins) {
		WebElement drop4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dp4 = new Select(drop4);
		dp4.selectByValue(ins);
		return this;

	}

	public CreateLead Ownership(String own) {
		WebElement drop5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dp5 = new Select(drop5);
		dp5.selectByValue(own);
		return this;

	}

	public CreateLead other() {
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("100");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("y");
		driver.findElement(By.name("description")).sendKeys("Makkale vango vango!!");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("vanakkam makale!!");
		WebElement country = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		country.clear();
		country.sendKeys("2");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("123456789");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("son");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sara@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.google.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("sugan");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("sister");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("xxx");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("yyy");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("yyy");
		WebElement drop6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dp6 = new Select(drop6);
		dp6.selectByValue("AK");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("10092");
		WebElement drop7 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dp7 = new Select(drop7);
		dp7.selectByValue("ASM");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("08");
		return this;

	}

	public ViewLead create() {
		driver.findElement(By.xpath("//input[@name=\"submitButton\"]")).click();
		return new ViewLead();

	}
}