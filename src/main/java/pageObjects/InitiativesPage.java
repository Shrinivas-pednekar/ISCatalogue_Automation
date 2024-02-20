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
	
	@FindBy(xpath = "//*[@id=\'menubar1\']/li[5]/a")
	private WebElement  InitiativesMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Top ACR and CV Generators')]")
	private WebElement TopACRandDVGeneratorsMenu;

	@FindBy(xpath = "//a[contains(text(),'Pipeline Growth Plays​')]")
	private WebElement PipeGenerationFocusPlaysMenu;
	
	@FindBy(xpath = "//a[contains(text(),'AI Hub')]")
	private WebElement AzureAIHubMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Modern Analytics and Governance with Fabric')]")
	private WebElement ModernAnalyticsandGovernancewithFabricMenu;
	
	@FindBy(xpath = "//a[contains(text(),'PDOC')]")
	private WebElement PDOCMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Go Fast with Copilot for M365')]")
	private WebElement GoFastwithCopilotforM365Menu;
	
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
	public void clickOnPipeGenerationFocusPlaysMenuButton()
	{
		util.clickOnElementUsingActions(driver, PipeGenerationFocusPlaysMenu);
	}
	public void clickOnAzureAIHubMenuButton()
	{
		util.clickOnElementUsingActions(driver, AzureAIHubMenu);
	}
	public void clickOnModernAnalyticsandGovernancewithFabricMenuButton()
	{
		util.clickOnElementUsingActions(driver, ModernAnalyticsandGovernancewithFabricMenu);
	}
	public void clickOnPDOCMenuButton()
	{
		util.clickOnElementUsingActions(driver, PDOCMenu);
	}
	public void clickOnGoFastwithCopilotforM365MenuButton()
	{
		util.clickOnElementUsingActions(driver, GoFastwithCopilotforM365Menu);
	}
}
