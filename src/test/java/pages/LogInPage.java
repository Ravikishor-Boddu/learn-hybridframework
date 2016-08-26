package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage 
{
	WebDriver driver;
	
	public LogInPage(WebDriver ldriver)
	{
		this.driver=ldriver;				
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='email_address']")
	WebElement email_field;
	
	@FindBy(how=How.XPATH, using="//input[@name='password']")
	WebElement password_field;
	
	@FindBy(how=How.XPATH, using=".//*[@id='tdb5']")
	WebElement signIn;
	
	@FindBy(how=How.XPATH, using=".//*[@id='tdb4']/span")
	WebElement logOff_button;
	
	By logoff = By.xpath(".//*[@id='tdb4']/span");
	
	public void logInApplication(String email, String password)
	{
		email_field.sendKeys(email);
		
		password_field.sendKeys(password);
		
		signIn.click();
	}
	
	public void verifyLogOutLink()
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(logoff));
		
		String text = ele.getText();
		
		Assert.assertTrue(text.equalsIgnoreCase("log off"));
		
	}
}
