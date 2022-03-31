package ReadData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utils.DataProvide;

public class Data {
	String url="http://leaftaps.com/opentaps/control/main";
	@Test(dataProvider = "getData" , dataProviderClass = DataProvide.class )
	public void loginPage(String data[]) {
		System.out.println(data[0]);
		System.out.println(data[1]);
		  ChromeDriver driver= new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get(url);
		  driver.findElement(By.id("username")).sendKeys(data[0]);
		  driver.findElement(By.id("password")).sendKeys(data[1]);
		  driver.findElement(By.className("decorativeSubmit")).click();
		  
		  
		 

	}
}
