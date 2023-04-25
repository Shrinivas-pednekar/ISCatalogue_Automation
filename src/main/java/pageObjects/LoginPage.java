package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	public WebDriver driver;
	
	@FindBy(xpath = "//*[@id='tilesHolder']/div //small[contains(.,'microsoft')]")
	private WebElement loginAccount;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public HomePage LoginToAccount() {
		loginAccount.click();
		return new HomePage(driver);
	}
	
}
