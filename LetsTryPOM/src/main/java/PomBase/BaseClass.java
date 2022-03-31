package PomBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import ReadDataFrmExcel.PomReadExcel;

public class BaseClass {

	protected ChromeDriver driver = null;
	String url = "http://leaftaps.com/opentaps/control/main";
	public String fileName="";

	@BeforeMethod
	public void startapp() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

	}
	@DataProvider(name="getData")
	public String[][] getDat() {
		String[][] pOmExcel = PomReadExcel.getPOmExcel(fileName);
		return pOmExcel;

	}

	@AfterMethod
	public void closeapp() {

	}
}
