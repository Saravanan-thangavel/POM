package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PomBase.BaseClass;

public class Login extends BaseClass {
	public Login(ChromeDriver driver) {
		this.driver = driver;
	}

	public boolean getUserLabel() {
		return driver.findElement(By.xpath("//label[@for=\"username\"]")).isDisplayed();

	}

	public Boolean getPasswordLabel() {
		return driver.findElement(By.xpath("//label[@for=\"password\"]")).isDisplayed();

	}

	public Login username(String name) {
		driver.findElement(By.id("username")).sendKeys(name);
		return this;
	}

	public Login password(String pswd) {
		driver.findElement(By.id("password")).sendKeys(pswd);
		return this;

	}

	public CrmFA clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new CrmFA(driver);

	}

}
