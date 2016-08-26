package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(how=How.XPATH, using=".//*[@id='tdb2']/span[2]")
	WebElement checkoutButton;
	
	@FindBy(how=How.XPATH, using=".//*[@id='tdb1']/span[2]")
	WebElement cartButton;
	
	@FindBy(how=How.XPATH, using=".//*[@id='tdb3']/span[2]")
	WebElement myaccountButton;
	
	@FindBy(how=How.LINK_TEXT, using="login")
	WebElement login_link;
	
	public void clickOnCheckOutButton()
	{
		checkoutButton.click();
	}
	
	public void clickOnCartButton()
	{
		cartButton.click();
	}
	
	public void clickOnMyAccountButton()
	{
		myaccountButton.click();
	}
	
	public String getApplicationTitle()
	{
		return driver.getTitle();
	}
	
	public void clickOnLoginLink()
	{
		login_link.click();
		
	}
	

}
