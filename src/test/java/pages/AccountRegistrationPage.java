package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountRegistrationPage 
{
	WebDriver driver;
	
	public AccountRegistrationPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='m']")
	WebElement male_radio_button;
	
	@FindBy(how=How.XPATH, using="//input[@value='f']")
	WebElement female_radio_button;
	
	@FindBy(how=How.XPATH, using="//input[@name='firstname']")
	WebElement firstname;
	
	@FindBy(how=How.XPATH, using="//input[@name='lastname']")
	WebElement lastname;
	
	@FindBy(how=How.XPATH, using="//input[@name='email_address']")
	WebElement email;
	
	@FindBy(how=How.XPATH, using="//input[@name='street_address']")
	WebElement street_address;
	
	
	
	
}
