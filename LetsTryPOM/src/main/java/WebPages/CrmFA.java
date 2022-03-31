package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBase.BaseClass;

public class CrmFA extends BaseClass {
	public CrmFA(ChromeDriver driver) {
		this.driver = driver;
	}

	public void crmsf() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	public void clickLeads() {
		driver.findElement(By.linkText("Leads")).click();

	}

	public void clickMyLeads() {
		driver.findElement(By.linkText("My Leads")).click();

	}

	public CreateLead clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLead(driver);

	}
}
