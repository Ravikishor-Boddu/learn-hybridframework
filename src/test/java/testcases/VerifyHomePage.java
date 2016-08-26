package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.HomePage;

public class VerifyHomePage {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=BrowserFactory.getBrowser();
		
		driver.get(DataProviderFactory.getConfig().getApplicationURL());
		
	}
	
	@Test
	public void testHomePage()
	{
		
		HomePage home=PageFactory.initElements(driver, HomePage.class);
		
		String title=home.getApplicationTitle();
		
		Assert.assertTrue(title.contains("GCR"));
		
		System.out.println("Application Page Title is: "+title);	
		
	}
	
	@AfterTest
	public void tearDown()
	{
		BrowserFactory.closeBrowser(driver);
	}

}
