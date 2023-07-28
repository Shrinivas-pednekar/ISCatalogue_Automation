package pageObjects;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;

import resources.Utilities;


public class HomePage {
	
	public WebDriver driver;
	Utilities util = new Utilities();
	
	@FindBy(xpath = "//*[@id=\"msCarousel\"]/div[1]/div[2]/div/div/p[2]/a")
	private WebElement carouselLearnMore2;
	
	@FindBy(xpath="//*[@id=\"copyToClipboard\"]") 
	private WebElement filteredLink;
	
	@FindBy(xpath="//button[@id='ArchView']")
	private WebElement ArchView;
	
	@FindBy(xpath="//button[@id='userViewChangeDropdown']")
	private WebElement ViewChangeDropdown;
	
	@FindBy(xpath="//li[contains(text(),'IS Seller View')]")
	private WebElement ISSellerViewButton;
	
	@FindBy(xpath="//li[contains(text(),'Architect View')]")
	private WebElement ArchitectViewButton;
	
	@FindBy (xpath="//*[@id=\"msCarousel\"]/div[1]/div[1]/div/div/p[2]/a")
	private WebElement carouselLearnMore1;
	
	@FindBy (xpath="//*[@id=\"ms-carousel-play-button\"]/img")
	private WebElement carouselPlayButton;
	
	@FindBy(xpath="//button[@id='ISView']")
	private WebElement ISView;
	
	@FindBy(xpath="//a[contains(text(),'See all customer evidence')]")
	private WebElement CustomerEvidenceSearch;
	
	@FindBy(xpath="//a[contains(text(),'View Campaign Page')]")
	private WebElement ViewCampaignPage;
	
	@FindBy(xpath="//a[contains(text(),'Learn more')]")
	private WebElement HLearnmore;
	
	@FindBy(xpath="//a[contains(text(),'Visit the IS Request form')]")
	private WebElement VisitISRequestform;
	
	@FindBy(xpath="//h4[contains(text(),'Cloud Transition Services')]")
	private WebElement CloudTransitionServicesLink;
	
	@FindBy(xpath="//h4[contains(text(),'Cloud Management and Operations')]")
	private WebElement CloudManagementOperationsLink;
	
	@FindBy(xpath="//h4[contains(text(),'End-to-End AI and Machine Learning')]")
	private WebElement End_to_End_AI_and_Machine_LearningLink;

	@FindBy(xpath="//h4[contains(text(),'Digital Security and Compliance')]")
	private WebElement Digital_Security_and_ComplianceLink;
	
	@FindBy(xpath="//h4[contains(text(),'Microsoft Security Services for Enterprise')]")
	private WebElement Microsoft_Security_Services_for_EnterpriseLink;
	
	@FindBy(xpath="//h4[contains(text(),'Security operations')]")
	private WebElement Security_operationsLink;
	
	@FindBy(xpath="//a[contains(text(),'View all offers')]")
	private WebElement VerifyAllOffersLink;
	
	@FindBy(xpath="//h4[contains(text(),'Identity and Access Services')]")
	private WebElement Identity_and_Access_ServicesLink;
	
	@FindBy(xpath="//button[@id='spanexpand']")
	private WebElement spanexpandLink;
	
	@FindBy(xpath="//h4[contains(text(),'Data Strategy')]")
	private WebElement DataStrategyLink;
	
	@FindBy(xpath="//h4[contains(text(),'Product Innovation Development Services')]")
	private WebElement ProductInnovationDevelopmentServicesLink;
	
	@FindBy(xpath="//h4[contains(text(),'Data Strategy Platform & Analytics')]")
	private WebElement DataStrategyPlatformAnalyticsServicesLink;
	
	@FindBy(xpath="//a[contains(text(),'View all top offers')]")
	private WebElement ViewalltopoffersLink;
	
	@FindBy(xpath="//h2[@id='lblCounter']")
	private WebElement CustomerEvidenceSearchResult;
	
	@FindBy(xpath="//div[contains(text(),'Explore IS Mainstream Solutions, Evidence and Conn')]")
	private WebElement MCAPS_Seller_View;
	
	@FindBy(xpath="//div[contains(text(),'Everything you need to convert customer solutions ')]")
	private WebElement IS_Seller_View;
	
	@FindBy(xpath="//div[contains(text(),'Search for anything in the catalogue')]")
	private WebElement IS_Architect_View;
	
	@FindBy(xpath="//div[contains(text(),'Pick up where you left off')]")
	private WebElement pick_up_where_left;
	
	@FindBy(xpath="//div[contains(text(),'Trending offers')]")
	private WebElement TreadingOffer;
	
	@FindBy(xpath="//a[contains(@href,'.')]")
	private WebElement Linkshref;
	
	@FindBy(xpath="//a[contains(text(),'Eureka')]")
	private WebElement Eureka;
	
	@FindBy(xpath="(//a[contains(text(),'Privacy')])[1]")
	private WebElement Privacy;
	
	@FindBy(xpath = "//input[@id='IdSearchbox']")
	private WebElement catalogueSearchTextBox;
	
	@FindBy(xpath = "//div[contains(text(),'Automotive, Mobility and Transportation')]")
	private WebElement AutomotiveMobilityandTransportationtButton;
	
	@FindBy(xpath = "//div[contains(text(),'Cross-Industry')]")
	private WebElement CrossIndustryButton;
	
	@FindBy(xpath = "//div[contains(text(),'Defense and Intelligence')]")
	private WebElement DefenseandIntelligenceButton;
	
	@FindBy(xpath = "//div[contains(text(),'Education')]")
	private WebElement EducationButton;
	
	@FindBy(xpath = "//a[@aria-label='Energy and Resources']//div[2]")
	private WebElement EnergyandResourcesButton;
	
	@FindBy(xpath = "//div[contains(text(),'Financial Services')]")
	private WebElement FinancialServicesButton;
	
	@FindBy(xpath = "//div[contains(text(),'Government')]")
	private WebElement GovernmentButton;
	
	@FindBy(xpath = "//div[contains(text(),'Healthcare')]")
	private WebElement HealthcareButton;
	
	@FindBy(xpath = "//a[@aria-label='Industrial and Manufacturing']//div[2]")
	private WebElement IndustrialandManufacturingButton;
	
	@FindBy(xpath = "//div[contains(text(),'Retail and Customer Goods')]")
	private WebElement RetailandCustomerGoodsButton;
	
	@FindBy(xpath = "//div[contains(text(),'Sustainability')]")
	private WebElement SustainabilityButton;
	
	@FindBy(xpath = "//a[@aria-label='Telecommunications and Media']//div[2]")
	private WebElement TelecommunicationsandMediaButton;
	
	public void enterSearchDetails(String SearchDetails) {
		catalogueSearchTextBox.sendKeys(SearchDetails);
	}
	public void pressEnterbuttonForSearch() {
		catalogueSearchTextBox.sendKeys(Keys.ENTER);
	}
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	public WebElement getcarouselLearnMoreButton() {
		return carouselPlayButton;
	}
	public boolean isDisplayedLearnMore()
	{
	 return getcarouselLearnMoreButton().isDisplayed();
	}
	public WebElement getfilteredLinkButton() {
		
		return filteredLink;
	}
	public WebElement getCustomerEvidenceSearchButton() {
		
		return CustomerEvidenceSearch;
	}
	
	public WebElement getCustomerEvidenceSearchResults() {
		
		return CustomerEvidenceSearchResult;
	}
	public WebElement getMCAPS_Seller_View_Title() {
		
		return MCAPS_Seller_View;
	}
	public WebElement getIS_Seller_View_Title() {
		
		return IS_Seller_View;
	}
	public WebElement get_Architect_View_Title() {
		
		return IS_Architect_View;
	}
	public WebElement get_pick_uo_where_you_left_Title() {
		
		return pick_up_where_left;
	}
	public WebElement get_TreadingOffer_Title() {
		
		return TreadingOffer;
	}
	public boolean isDisplayedfilteredLinkButton()
	{
		//util.clickOnElementUsingActions(driver,carouselPlayButton);
		return getfilteredLinkButton().isDisplayed();
	}
	public boolean isDisplayedCustomerEvidenceSearchButton()
	{
		//util.clickOnElementUsingActions(driver,carouselPlayButton);
		return getCustomerEvidenceSearchButton().isDisplayed();
	}
	public void clickOnArchView()
	{
		util.clickOnElementUsingActions(driver, ArchView);
	//	util.scrollDownForElementToBeVisible(driver,filteredLink,2000);
	}
	public void clickViewChangeDropdown()
	{
		util.clickOnElementUsingActions(driver, ViewChangeDropdown);
	}
	public void clickISSellerViewButton()
	{
		util.clickOnElementUsingActions(driver, ISSellerViewButton);
	}
	public void clickArchitectViewButton()
	{
		util.clickOnElementUsingActions(driver, ArchitectViewButton);
	}
	public void clickOnISView()
	{
		util.clickOnElementUsingActions(driver, ISView);
	}
	public void clickOnViewCampaignPage()
	{
		util.clickOnElementUsingActions(driver, ViewCampaignPage);
	}
	public void clickOnLearnMoreButton()
	{
		util.clickOnElementUsingActions(driver, HLearnmore);
	}
	public void clickOnISRequestFormButton()
	{
		util.clickOnElementUsingActions(driver, VisitISRequestform);
	}
	public Set<String> getWindowHandles() 
	{
	    return driver.getWindowHandles();
	}
	public void clickOnCloudTransitionServicesLink()
	{
		util.clickOnElementUsingActions(driver, CloudTransitionServicesLink);
	}
	public void clickOnCloudManagementOperationsLink()
	{
		util.clickOnElementUsingActions(driver, CloudManagementOperationsLink);
	}
	public void clickOnEnd_to_End_AI_and_Machine_LearningLink()
	{
		util.clickOnElementUsingActions(driver, End_to_End_AI_and_Machine_LearningLink);
	}
	public void clickOnDigital_Security_and_ComplianceLink()
	{
		util.clickOnElementUsingActions(driver, Digital_Security_and_ComplianceLink);
	}
	public void clickOnMicrosoft_Security_Services_for_EnterpriseLink()
	{
		util.clickOnElementUsingActions(driver, Microsoft_Security_Services_for_EnterpriseLink);
	}
	public void clickOnIdentity_and_Access_ServicesLink()
	{
		util.clickOnElementUsingActions(driver, Identity_and_Access_ServicesLink);
	}
	public void clickOnSecurity_OperationsLink()
	{
		util.clickOnElementUsingActions(driver, Security_operationsLink);
	}
	public void clickOnVerifyAllOffersLink()
	{
		util.clickOnElementUsingActions(driver, VerifyAllOffersLink);
	}
	public void clickOnExpandtoviewallLink()
	{
		util.clickOnElementUsingActions(driver, spanexpandLink);
	}
	public void clickOnDataStrategyLink()
	{
		util.clickOnElementUsingActions(driver, DataStrategyLink);
	}
	public void clickOnDProductInnovationDevelopmentServicesLinkLink()
	{
		util.clickOnElementUsingActions(driver, ProductInnovationDevelopmentServicesLink);
	}
	public void clickOnData_Strategy_Platform_Analytics_PageOnHomepageLinkLink()
	{
		util.clickOnElementUsingActions(driver, DataStrategyPlatformAnalyticsServicesLink);
	}
	public void clickOnViewalltopoffersLink()
	{
		util.clickOnElementUsingActions(driver, ViewalltopoffersLink);
	}
	public void clickOnCustomerEvidenceSearchButton()
	{
		util.clickOnElementUsingActions(driver, CustomerEvidenceSearch);
	}
	public void CustomerEvidenceSearchResultwaitForElementToBeVisible()
	{
		util.waitForElementToBeVisible(driver, CustomerEvidenceSearchResult,50);
	}
	public WebElement getLinkshref() {
		
		
		return Linkshref;
	}
	
	public void clickOnEurekaButton()
	{
		util.clickOnElementUsingActions(driver, Eureka);
	}
	public void clickOnPrivacyButton()
	{
		util.clickOnElementUsingActions(driver, Privacy);
	}
	public void clickOnAutomotiveMobilityandTransportationtButton()
	{
		util.clickOnElementUsingActions(driver, AutomotiveMobilityandTransportationtButton);
	}
	public void clickOnCrossIndustryButton()
	{
		util.clickOnElementUsingActions(driver, CrossIndustryButton);
	}
	public void clickOnDefenseandIntelligenceButton()
	{
		util.clickOnElementUsingActions(driver, DefenseandIntelligenceButton);
	}
	public void clickOnEducationButton()
	{
		util.clickOnElementUsingActions(driver, EducationButton);
	}
	public void clickOnEnergyandResourcesButton()
	{
		util.clickOnElementUsingActions(driver, EnergyandResourcesButton);
	}
	public void clickOnFinancialServicesButton()
	{
		util.clickOnElementUsingActions(driver, FinancialServicesButton);
	}
	public void clickOnGovernmentButton()
	{
		util.clickOnElementUsingActions(driver, GovernmentButton);
	}
	public void clickOnRetailandConsumerGoodsButton()
	{
		util.clickOnElementUsingActions(driver, RetailandCustomerGoodsButton);
	}
	public void clickOnHealthcareButton()
	{
		util.clickOnElementUsingActions(driver, HealthcareButton);
	}
	public void clickOnIndustrialsandManufacturingButton()
	{
		util.clickOnElementUsingActions(driver, IndustrialandManufacturingButton);
	}
	public void clickOnSustainabilityButton()
	{
		util.clickOnElementUsingActions(driver, SustainabilityButton);
	}
	public void clickOnTelecommunicationsandMediaButton()
	{
		util.clickOnElementUsingActions(driver, TelecommunicationsandMediaButton);
	}
}
