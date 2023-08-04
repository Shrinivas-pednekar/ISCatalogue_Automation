package pageObjects;


import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Utilities;


public class InitiativesPage {
	
	public WebDriver driver;
	Utilities util = new Utilities();
	
	@FindBy(xpath = "//*[@id=\"menubar1\"]/li[4]/a")
	private WebElement  InitiativesMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Top ACR and CV Generators')]")
	private WebElement TopACRandDVGeneratorsMenu;

	@FindBy(xpath = "//a[contains(text(),'Do More With Less')]")
	private WebElement DoMoreWithLessMenu;
	
	public InitiativesPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String getPageTitle() {
		return driver.getTitle();
	}

	public void clickOnInitiativesMenuButton()
	{
		util.clickOnElementUsingActions(driver,  InitiativesMenu );
	}
	public void clickOnTopACRandDVGeneratorsMenuButton()
	{
		util.clickOnElementUsingActions(driver, TopACRandDVGeneratorsMenu);
	}
	public void clickOnDoMoreWithLessMenuButton()
	{
		util.clickOnElementUsingActions(driver, DoMoreWithLessMenu);
	}
}
