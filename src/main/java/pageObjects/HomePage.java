package pageObjects;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
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
	
	@FindBy(xpath="//a[contains(text(),'View all similar stories')]")
	private WebElement CustomerEvidenceSearch;
	
	@FindBy(xpath="//a[contains(text(),'Explore customer evidence')]")
	private WebElement ExploreCustomerEvidenceSearch;
	
	@FindBy(xpath="//li[@id='AISummary']")
	private WebElement AISummaryButton;
	
	@FindBy(xpath="//a[contains(text(),'How to sell ISD offers')]")
	private WebElement ISDOfferButton;
	
	@FindBy(xpath="//span[contains(text(),'Catalog Assistance Request Form')]")
	private WebElement CatalogAssistanceRequestFormButton;
	
	@FindBy(xpath="//a[contains(text(),'View Campaign Page')]")
	private WebElement ViewCampaignPage;
	
	@FindBy(xpath="//a[contains(text(),'Learn more')]")
	private WebElement HLearnmore;
	
	@FindBy(xpath="//a[contains(text(),'Visit the AI Hub')]")
	private WebElement VisittheAIHub;
	
	@FindBy(xpath="//a[@id='nextLink']//div[@id='campgn_frame']")
	private WebElement NextButton;
	
	@FindBy(xpath="//a[contains(text(),'Visit the IS Request form')]")
	private WebElement VisitISRequestform;
	
	@FindBy(xpath="//span[contains(text(),'Cloud Transition Services')]")
	private WebElement CloudTransitionServicesLink;
	
	@FindBy(xpath="//span[contains(text(),'Cloud Management and Operations')]")
	private WebElement CloudManagementOperationsLink;
	
	@FindBy(xpath="//span[contains(text(),'Business Outcomes with AI')]")
	private WebElement Business_Outcomes_with_AILink;

	@FindBy(xpath="//h4[contains(text(),'Digital Security and Compliance')]")
	private WebElement Digital_Security_and_ComplianceLink;
	
	@FindBy(xpath="//h4[contains(text(),'Microsoft Security Services for Enterprise')]")
	private WebElement Microsoft_Security_Services_for_EnterpriseLink;
	
	@FindBy(xpath="//h4[contains(text(),'Organizational and Operational Enablement')]")
	private WebElement Org_operationsLink;
	
	@FindBy(xpath="//a[contains(text(),'View all offers')]")
	private WebElement VerifyAllOffersLink;
	
	@FindBy(xpath="//h4[contains(text(),'Identity and Access Services')]")
	private WebElement Identity_and_Access_ServicesLink;
	
	@FindBy(xpath="//button[@id='spanexpand']")
	private WebElement spanexpandLink;
	
	@FindBy(xpath="//a[contains(text(),'Data Strategy')]")
	private WebElement DataStrategyLink;
	
	@FindBy(xpath="//h4[contains(text(),'Product Innovation Development Services')]")
	private WebElement ProductInnovationDevelopmentServicesLink;
	
	@FindBy(xpath="//a[contains(text(),'End-to-End Machine Learning')]")
	private WebElement EndtoEndMachineLearningLink;
	
	@FindBy(xpath="//h4[contains(text(),'Data Strategy Platform & Analytics')]")
	private WebElement DataStrategyPlatformAnalyticsServicesLink;
	
	@FindBy(xpath="//a[contains(text(),'View all top offers')]")
	private WebElement ViewalltopoffersLink;
	
	@FindBy(xpath="//h2[@id='lblCounter']")
	private WebElement CustomerEvidenceSearchResult;
	
	@FindBy(xpath="//span[@id='currentRole']")
	private WebElement CurrentRole_View;
	
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
	
	@FindBy(xpath = "//input[@aria-label='Search Portfolio']")
	private WebElement catalogueSearchTextBox;
	
	@FindBy(xpath = "//div[contains(text(),'Mobility')]")
	private WebElement AutomotiveMobilityandTransportationtButton;
	
	@FindBy(xpath = "//div[contains(text(),'Cross-Industry')]")
	private WebElement CrossIndustryButton;
	
	@FindBy(xpath = "//div[contains(text(),'Defense and Intelligence')]")
	private WebElement DefenseandIntelligenceButton;
	
	@FindBy(xpath = "//div[contains(text(),'Education')]")
	private WebElement EducationButton;
	
	@FindBy(xpath = "//div[contains(text(),'Energy')]")
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
	
	@FindBy(xpath = "//div[@id='Carousel']")
	private WebElement CarouselOnISSellerView;
	
	@FindBy(xpath = "//*[@id=\"DeliveryTeam\"]/div[2]/div[1]/div/div/div[2]/a")
	private WebElement IndustrySolutionsDeliveryHomePage;
	
	public void clickOnIndustrySolutionsDeliveryHomePageButton() {
		util.clickOnElementUsingActions(driver, IndustrySolutionsDeliveryHomePage);
	}
	
	@FindBy(xpath = "//*[@id=\"DeliveryTeam\"]/div[2]/div[2]/div/div/div[2]/a")
	private WebElement UnifiedHomepage;
	
	public void clickOnUnifiedHomepageButton() {
		util.clickOnElementUsingActions(driver, UnifiedHomepage);
	}
	
	@FindBy(xpath = "//*[@id=\"DeliveryTeam\"]/div[2]/div[3]/div/div/div[2]/a")
	private WebElement PartnerHomepage;
	
	public void clickOnPartnerHomepageButton() {
		util.clickOnElementUsingActions(driver, PartnerHomepage);
	}
	@FindBy(xpath = "//*[@id=\"customerEvidence\"]/div/a[1]/div/div")////a[contains(text(),'EDF - PowerPlatform Center of Excellence')]
	private WebElement EvidenceCheckOnHomePage;
	
	public WebElement getEvidenceCheckonHomePage() {
		return EvidenceCheckOnHomePage;
	}
	public void clickEvidenceCardOnHomePage()
	{
		util.clickOnElementUsingActions(driver, EvidenceCheckOnHomePage);
	}
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
	public WebElement getCarouselOnISSellerView() {
	    return CarouselOnISSellerView;
	}

	public WebElement getVisittheAIHubLink() {
	    WebElement carousel = getCarouselOnISSellerView();
	    return carousel.findElement(By.xpath("//a[contains(text(),'Visit the AI Hub')]"));
	}
	public WebElement getLearnMoreLink() {
	    WebElement carousel2 = getCarouselOnISSellerView();
	    return carousel2.findElement(By.xpath("//a[contains(text(),'Learn more')]"));
	}
	public boolean isDisplayedLearnMore()
	{
	 return getcarouselLearnMoreButton().isDisplayed();
	}
	public WebElement getfilteredLinkButton() {
		
		return filteredLink;
	}
	public WebElement getCustomerEvidenceSearchButton() {
		
		return ExploreCustomerEvidenceSearch;
	}
	
	public WebElement getCustomerEvidenceSearchResults() {
		
		return CustomerEvidenceSearchResult;
	}
	public WebElement getCurrentRole_View() {
		
		return CurrentRole_View;
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
		//util.scrollDownForElementToBeVisible(driver, HLearnmore, 2000);
		util.clickOnElementUsingActions(driver, HLearnmore);
	
	}
	public void clickOnVisittheAIHubButton()
	{
		util.clickOnElementUsingActions(driver, getVisittheAIHubLink());
	}
	public void clickOnNextButton()
	{
		util.scrollDownForElementToBeVisible(driver, NextButton, 2000);
		util.clickOnElementUsingActions(driver, NextButton);
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
	public void clickOnBusiness_Outcomes_with_AILink()
	{
		util.clickOnElementUsingActions(driver, Business_Outcomes_with_AILink);
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
	public void clickOnOrganizational_and_Operational_EnablementLink()
	{
		util.clickOnElementUsingActions(driver, Org_operationsLink);
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
	public void clickOnEndtoEndMachineLearningLinkLink()
	{
		util.clickOnElementUsingActions(driver, EndtoEndMachineLearningLink);
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
		util.scrollDownForElementToBeVisible(driver, CustomerEvidenceSearch, 2000);
		util.clickOnElementUsingActions(driver, CustomerEvidenceSearch);
	}
	public void clickOnExploreCustomerEvidenceSearchButton()
	{
		util.scrollDownForElementToBeVisible(driver, ExploreCustomerEvidenceSearch, 2000);
		util.clickOnElementUsingActions(driver, ExploreCustomerEvidenceSearch);
	}
	public void clickOnAISummaryButton()
	{
		util.clickOnElementUsingActions(driver, AISummaryButton);
		util.scrollDownForElementToBeVisible(driver, AISummaryButton, 2000);
	}
	public void clickOnISDOfferButton()
	{
		util.clickOnElementUsingActions(driver, ISDOfferButton);
		util.scrollDownForElementToBeVisible(driver, ISDOfferButton, 2000);
	}
	public void clickOnCatalogAssistanceRequestFormButton()
	{
		util.clickOnElementUsingActions(driver, CatalogAssistanceRequestFormButton);
		util.scrollDownForElementToBeVisible(driver, CatalogAssistanceRequestFormButton, 2000);
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
