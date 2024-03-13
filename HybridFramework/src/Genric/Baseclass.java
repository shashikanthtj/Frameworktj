package Genric;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utils.Fetchproperty;

public class Baseclass implements FWconstent  {
	public WebDriver driver;
	@BeforeMethod
	public void openappln() throws FileNotFoundException, IOException
	{
		System.setProperty(gekey,gevalue);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(Fetchproperty.getpro());
	}
	@AfterMethod
	public void closeappln(ITestResult res)
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			genric_photo.get_photo(driver);
		}
		driver.close();
	}
}
