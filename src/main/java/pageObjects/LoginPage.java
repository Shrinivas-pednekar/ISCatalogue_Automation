package pageObjects;

import javax.mail.MessagingException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Utilities;


public class LoginPage {

	public WebDriver driver;
	Utilities util = new Utilities();
	
	@FindBy(xpath = "//*[@id='tilesHolder']/div //small[contains(.,'microsoft')]")
	private WebElement loginAccount;
	
	@FindBy(xpath = "//div[contains(text(),'Shrinivas Pednekar (Persistent Systems Inc)')]")
	private WebElement ShriUSername;
	
	@FindBy(xpath = "//div[contains(text(),'Sapna Kshirsagar (Persistent Systems Inc)')]")
	private WebElement SapnaUSername;
	
	@FindBy(xpath = "//div[contains(text(),'Jitendra Sadafale (Persistent Systems Inc)')]")
	private WebElement JitUSername;
	
	@FindBy(xpath = "//*[@id=\"i0116\"]")
	private WebElement LoginID;
	
	
	
	
	
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
	
	public void clickOnUserButton()
	{
		util.clickOnElementUsingActions(driver, SapnaUSername);
	}
	public void clickOnUserButtonJit()
	{
		util.clickOnElementUsingActions(driver, JitUSername);
	}
	public void enterLoginID(String StoryDetails) {
		LoginID.sendKeys(StoryDetails);
	}
	
}
