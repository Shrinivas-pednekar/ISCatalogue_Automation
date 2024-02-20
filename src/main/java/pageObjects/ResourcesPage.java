package pageObjects;


import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Utilities;


public class ResourcesPage {
	
	public WebDriver driver;
	Utilities util = new Utilities();
	
	@FindBy(xpath = "//*[@id='menubar1']/li[6]/a")
	private WebElement ResourcesMenu;
	
	@FindBy(xpath = "//a[@href=\"http://microsoft.com/mcs\"]")
	private WebElement IndustrySolutionsMenu;

	@FindBy(xpath = "//a[contains(text(),'IS Solutions Playbook')]")
	private WebElement ISSolutionsPlaybookMenu;
	
	@FindBy(xpath = "//a[contains(text(),'LED Portal')]")
	private WebElement LEDPortalMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Proposal IP Library (RFPIO)')]")
	private WebElement RFPIOMenu;
	
	@FindBy(xpath = "//div[contains(text(),'Shrinivas Pednekar (Persistent Systems Inc)')]")
	private WebElement LoginButton;
	
	@FindBy(xpath = "//a[contains(text(),'IS Clouds Overview')]")
	private WebElement ISCloudsOverviewMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Customer Hub')]")
	private WebElement CustomerHubMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Databook')]")
	private WebElement DatabookMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Funding')]")
	private WebElement FundingMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Microsoft Solutions Playbook')]")
	private WebElement MSPlaybookMenu;
	
	@FindBy(xpath = "//button[@id='showSearchList']")
	private WebElement showSearchList;
	
	@FindBy(xpath = "//button[@id='showSearchList']")
	private WebElement HomeshowSearchList;
	
	@FindBy(xpath = "//span[@id='showSearchList']")
	private WebElement SPshowSearchList;
	
	@FindBy(xpath = "//li[contains(text(),'ABERDEEN CITY COUNCIL - 2539902')]")
	private WebElement selectABERDEENCITYCOUNCIL;
	
	@FindBy(xpath = "//div[contains(text(),'2539902')]")
	private WebElement customerTPID;
	
	@FindBy(xpath = "//p[contains(text(),'Customer Evidence')]")
	private WebElement CustomerEvidenceInCustomerHub;
	
	@FindBy(xpath = "//a[contains(text(),'About ISD Catalog')]")
	private WebElement AboutISCatalogueMenuButton;
	
	@FindBy(xpath = "//a[contains(text(),'Emerging Solutions')]")
	private WebElement EmergingSolutionsMenuButton;
	
	@FindBy(xpath = "//a[contains(text(),'Manage Catalogue Subscriptions')]")
	private WebElement ManageCatalogueSubscriptionsMenuButton;
	
	@FindBy(xpath = "//a[contains(text(),'Catalogue Roadmap')]")
	private WebElement CatalogueRoadmapMenuButton;
	
	@FindBy(xpath = "//a[contains(text(),'Solution Truth')]")
	private WebElement SolutionTruthMenuButton;
	
	public ResourcesPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String getPageTitle() {
		return driver.getTitle();
	}

	public void clickOnResourcesMenuButton()
	{
		util.clickOnElementUsingActions(driver, ResourcesMenu);
	}
	public void clickOnIndustrySolutionsMenuButton()
	{
		util.clickOnElementUsingActions(driver, IndustrySolutionsMenu);
	}
	public void clickOnISSolutionsPlaybookMenuButton()
	{
		util.clickOnElementUsingActions(driver, ISSolutionsPlaybookMenu);
	}
	public void clickOnLEDPortalMenuButton()
	{
		util.clickOnElementUsingActions(driver, LEDPortalMenu);
	}
	public void clickOnRFPIOMenuButton()
	{
		util.clickOnElementUsingActions(driver, RFPIOMenu);
	}
	public void clickOnLoginButton()
	{
		util.clickOnElementUsingActions(driver, LoginButton);
	}
	public void clickOnISCloudsOverviewMenuButton()
	{
		util.clickOnElementUsingActions(driver, ISCloudsOverviewMenu);
	}
	public void clickOnCustomerHubMenuButton()
	{
		util.clickOnElementUsingActions(driver, CustomerHubMenu);
	}
	public void clickOnDatabookMenuButton()
	{
		util.clickOnElementUsingActions(driver, DatabookMenu);
	}
	public void clickOnFundingMenuButton()
	{
		util.clickOnElementUsingActions(driver, FundingMenu);
	}
	public void clickOnMSPlaybookMenuMenuButton()
	{
		util.clickOnElementUsingActions(driver, MSPlaybookMenu);
	}
	public void clickOnshowSearchListButton()
	{
		util.clickOnElementUsingActions(driver, showSearchList);
	}
	public void clickOnHomeshowSearchListButton()
	{
		util.clickOnElementUsingActions(driver, HomeshowSearchList);
	}
	public void clickOnSPshowSearchListButton()
	{
		util.clickOnElementUsingActions(driver, SPshowSearchList);
	}
	public void clickOnselectABERDEENCITYCOUNCIL()
	{
		util.clickOnElementUsingActions(driver, selectABERDEENCITYCOUNCIL);
	}
	public WebElement getcustomerTPIDValue() {
		return customerTPID;
	}
	public WebElement getCustomerEvidenceInCustomerHub() 
	{
		return CustomerEvidenceInCustomerHub;
	}
	public boolean isDisplayedCustomerEvidenceInCustomerHub() 
	{ 
		return getCustomerEvidenceInCustomerHub().isDisplayed(); 
	}
	public void clickOnAboutISCatalogueMenuButton()
	{
		util.clickOnElementUsingActions(driver, AboutISCatalogueMenuButton);
	}
	public void clickOnEmergingSolutionsMenuButton()
	{
		util.clickOnElementUsingActions(driver, EmergingSolutionsMenuButton);
	}
	public void clickOnManageCatalogueSubscriptionsMenuButton()
	{
		util.clickOnElementUsingActions(driver, ManageCatalogueSubscriptionsMenuButton);
	}
	public void clickOnCatalogueRoadmapMenuButton()
	{
		util.clickOnElementUsingActions(driver, CatalogueRoadmapMenuButton);
	}
	public void clickOnSolutionTruthMenuButton()
	{
		util.clickOnElementUsingActions(driver, SolutionTruthMenuButton);
	}
	public void HRefresh()
	{
		driver.navigate().refresh();
	}
}
