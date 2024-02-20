package pageObjects;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import resources.Utilities;

public class SolutionPage {

	public WebDriver driver;
	Utilities util = new Utilities();

	@FindBy(xpath = "//*[@id=\"menubar1\"]/li[3]/a")
	private WebElement cataloguePagesMenu;

	@FindBy(xpath = "//a[contains(text(),'Emerging Innovation & Engineering')]")
	private WebElement EmergingInnovationEngineeringPagesMenu;

	@FindBy(xpath = "//a[contains(text(),'Digital Enablement and Operations')]")
	private WebElement DigitalEnablementandOperationsMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Industry Solutions Delivery')]")
	private WebElement IndustrySolutionsDeliveryHomeMenu;
	
	@FindBy(xpath = "//*[@id=\"menubar1\"]/li[3]/ul/li[1]/ul/li[2]/a")
	private WebElement UnifiedMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Adoption, Change, and Services Management')]")
	private WebElement AdoptionChangeandServicesManagementMenu;

	@FindBy(xpath = "//a[contains(text(),'Business Apps')]")
	private WebElement BusinessAppsMenu;

	@FindBy(xpath = "//a[contains(text(),'Cross Solution Area and Functional Solutions')]")
	private WebElement CrossSolutionAreaandFunctionalSolutionsMenu;

	@FindBy(xpath = "//a[contains(text(),'Digital and Application Innovation')]")
	private WebElement DigitalandApplicationInnovationMenu;

	@FindBy(xpath = "//a[contains(text(),'Data and AI')]")
	private WebElement DataandAIMenu;

	@FindBy(xpath = "//a[contains(text(),'Infrastructure')]")
	private WebElement InfrastructureMenu;

	@FindBy(xpath = "//a[contains(text(),'Modern Work')]")
	private WebElement ModernWorkMenu;

	@FindBy(xpath = "//a[contains(text(),'Security')]")
	private WebElement SecurityMenu;

	@FindBy(xpath = "//span[contains(text(),'Mobility')]")
	private WebElement AutomotiveMobilityandTransportationMenu;

	@FindBy(xpath = "//a[contains(text(),'Industries')]")
	private WebElement IndustryMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Cross-Industry')]")
	private WebElement CrossIndustryMenu;

	@FindBy(xpath = "//span[contains(text(),'Defense and Intelligence')]")
	private WebElement DefenseandIntelligenceMenu;

	@FindBy(xpath = "//span[contains(text(),'Education')]")
	private WebElement EducationMenu;

	@FindBy(xpath = "//a[contains(text(),'Energy')]")
	private WebElement EnergyandResourcesMenu;

	@FindBy(xpath = "//span[contains(text(),'Financial Services')]")
	private WebElement FinancialServicesMenu;

	@FindBy(xpath = "//span[contains(text(),'Government')]")
	private WebElement GovernmentMenu;

	@FindBy(xpath = "//span[contains(text(),'Healthcare')]")
	private WebElement HealthcareMenu;

	@FindBy(xpath = "//span[contains(text(),'Industrials and Manufacturing')]")
	private WebElement IndustrialsandManufacturingMenu;

	@FindBy(xpath = "//span[contains(text(),'Retail and Consumer Goods')]")
	private WebElement RetailandConsumerGoodsMenu;

	@FindBy(xpath = "//span[contains(text(),'Sustainability')]")
	private WebElement SustainabilityMenu;

	@FindBy(xpath = "//span[contains(text(),'Telecommunications and Media')]")
	private WebElement TelecommunicationsandMediaMenu;

	@FindBy(xpath = "(//*[@aria-label =\"Show Details\"])[1]")
	private WebElement ShowDetailsButton;

	@FindBy(xpath = "//*[@id=\"bom-2478\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement selectAllBom;

	@FindBy(xpath = "//*[@id=\"bom-2306\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement ACMselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2099\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement BAselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2567\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement AMTselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2412\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement CSAselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"OfferIP\"]/div/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement DAIselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2431\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement DandIselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"OfferIP\"]/div/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement DandIselectAllBomMain;
	
	@FindBy(xpath = "//*[@id=\"bom-2306\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement InfraselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2463\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement ModernWorkselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"OfferIP\"]/div/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement SecurityselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"OfferIP\"]/div/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement CloudselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"OfferIP\"]/div/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement BaMAIAppsselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"OfferIP\"]/div/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement EndselectAllBom;
	
	@FindBy(xpath = "//span[contains(text(),'Complex Architecture and Design Services')]")
	private WebElement DECatlogOfferButton;
	
	@FindBy(xpath = "//a[contains(text(),'Evidence Tiles')]")
	private WebElement EvidenceTab;
	
	@FindBy(xpath = "//span[contains(text(),'Machine Learning Operationalization & Monitoring')]")
	private WebElement MLOMButton;
	
	@FindBy(xpath = "//a[contains(text(),'Customer Success Unit')]")
	private WebElement CSUButton;
	
	@FindBy(xpath = "//a[contains(text(),'Find Out More')]")
	private WebElement VBDFindOutMoreButton;
	
	@FindBy(xpath = "//a[contains(text(),'Find out more')]")
	private WebElement PSSFindOutMoreButton;
	
	@FindBy(xpath = "//*[@id=\"Enhancements\"]/div/div[2]/div/ul/li[3]/a")
	private WebElement ResourcesButton;
	
	@FindBy(xpath = "//*[@id=\"CustomerSuccessUnit\"]/div/div/div/div/h3/a")
	private WebElement MSPlayBookButton;
	
	@FindBy(xpath = "//a[contains(text(),'Learn More')]")
	private WebElement LearnMoreButton;
	
	@FindBy(xpath = "//*[@id=\"bom-2459\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement CIselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2478\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement DaIselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2494\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement EduselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2478\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement EaRselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2566\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement FinselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2314\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement GovselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2478\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement HealthselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2478\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement IaMselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2478\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement RaCGselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2382\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement SusselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2400\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement TelCselectAllBom;
	
	@FindBy(xpath = "//span[contains(text(),'Download Selected')]")
	private WebElement DownloadSelected;

	@FindBy(xpath = "//span[@title='Subscribe']")
	private WebElement SubscribeButton;
	
	@FindBy(xpath = "//label[contains(text(),'Read full description')]")
	private WebElement ReadfulldescriptionButton;
	
	@FindBy(xpath = "//*[@id=\"spanSubscribe\"]/a")
	private WebElement DataAISubscribeButton;

	@FindBy(xpath = "//*[@id=\"sub-entities\"]/div[1]/div/span/label/span")
	private WebElement SubscribeSliderButton;

	@FindBy(xpath = "//input[@id='btnSubmit']")
	private WebElement SubmitButton;

	@FindBy(xpath = "//p[contains(text(),'Your subscription preference is successfully updat')]")
	private WebElement SubscribeSucessMsg;

	@FindBy(xpath = "//span[@title='Unsubscribe']")
	private WebElement UnsubscribeButton;

	@FindBy(xpath = "//*[@id=\"tab_evidence_1\"]/div[2]/div[2]/a[1]/div/div")////a[contains(text(),'EDF - PowerPlatform Center of Excellence')]
	private WebElement EDFEvidenceCheck;
	
	@FindBy(xpath = "//*[@id=\"tab_evidence_1\"]/div[2]/div[2]/a[1]/div/div")////a[contains(text(),'EDF - PowerPlatform Center of Excellence')]
	private WebElement OfferEvidenceCheck;
	
	@FindBy(xpath = "//*[@id=\"CustomerEvidence\"]/div[2]/div[1]/div[2]/span")////a[contains(text(),'EDF - PowerPlatform Center of Excellence')]
	private WebElement EvidenceCheck;
	
	@FindBy(xpath = "//*[@id=\"customerEvidenceContent\"]/div/div[2]/a[1]/div/div")////a[contains(text(),'EDF - PowerPlatform Center of Excellence')]
	private WebElement SPEvidenceCheck;
	
	@FindBy(xpath = "//*[@id=\"evidenceCards\"]/div[2]/a[1]/div/div")////a[contains(text(),'EDF - PowerPlatform Center of Excellence')]
	private WebElement IndustryEvidenceCheck;
	
	@FindBy(xpath = "//div[contains(text(),'Mainstream')]")
	private WebElement MaturityCheck;
	
	@FindBy(xpath = "//*[@id=\"Introduction\"]/div[2]/div[3]/div/div[2]")
	private WebElement DelivaryOrgCheck;
	
	@FindBy(xpath = "//*[@id=\"Introduction\"]/div[2]/div[3]/div[2]/div/div/div")
	private WebElement ProvenMaturityCheck;
	
	
	@FindBy(xpath = "//*[@id=\"CoreIPGrid\"]/div/div[1]/div[2]/div")//("//*[@id="CoreIPGrid"]/div/div[1]/div[2]/div")
	private WebElement KeyMaterialsCheck;
	
	@FindBy(xpath = "//*[@id=\"offerContainer\"]/div/div[1]/h3/a")////a[contains(text(),'EDF - PowerPlatform Center of Excellence')]
	private WebElement CatalogueOfferCheck;
	
	@FindBy(xpath = "//*[@class='card solution-play'][1]")////a[contains(text(),'EDF - PowerPlatform Center of Excellence')]
	private WebElement SolutionPlayCheck;
	
	@FindBy(xpath = "//div[@class='row noCardHeader']//a[1]")////a[contains(text(),'EDF - PowerPlatform Center of Excellence')]
	private WebElement ServicesCheck;
	
	@FindBy(xpath = "//*[@id=\"offerContainer\"]/div/div[1]/h3/a")////a[contains(text(),'EDF - PowerPlatform Center of Excellence')]
	private WebElement ArtifactCheck;
	
	@FindBy(xpath = "//*[@id=\"offerContainer\"]/div/a[1]")
	private WebElement ArtifactTabName;
	
	@FindBy(xpath = "//*[@id=\"offercards\"]/div/div[2]/div/a[1]/div/div/div[2]")////a[contains(text(),'EDF - PowerPlatform Center of Excellence')]
	private WebElement CatalogueOfferCards;
	
	@FindBy(xpath = "//*[@id=\"offerContainer\"]/div/a[1]/div/div")////a[contains(text(),'EDF - PowerPlatform Center of Excellence')]
	private WebElement CatalogueOfferTab;
	
	@FindBy(xpath = "//*[@id=\"offerContainer\"]/div/a[1]/div/div")////a[contains(text(),'EDF - PowerPlatform Center of Excellence')]
	private WebElement CatalogueOfferTabEO;

	@FindBy(xpath = "//li[@id='tabBOM']")
	private WebElement BOMButton;
	
	@FindBy(xpath = "//li[@id='tabBOMTile']")
	private WebElement SPBOMButton;
	
	@FindBy(xpath = "//*[@id=\"offertabguide\"]/li[2]/a")
	private WebElement DataAIBOMButton;

	@FindBy(xpath = "//li[@id='tabArtefact']")
	private WebElement ArtefactButton;
	
	@FindBy(xpath = "//li[@id='tabCatalogueOffer']")
	private WebElement CatalogueOfferButton;
	
	@FindBy(xpath = "//li[@id='tabSolutionPlay']")
	private WebElement tabSolutionPlayButton;
	
	@FindBy(xpath = "//li[@id='tabServices']")
	private WebElement tabServicesButton;
	
	@FindBy(xpath = "//*[@id=\"dvOfferMetrics\"]/div/div/div[3]/div[2]/div[2]")
	private WebElement SoldCount;
	
	@FindBy(xpath = "//button[@id='exportsummery']")
	private WebElement exportsummery;
	
	@FindBy(xpath = "//span[contains(text(),'MCAPS Catalog - Assistance Requests')]")
	private WebElement CatalogAssistanceRequestFormLabel;
	
	@FindBy(xpath = "//b[contains(text(),'Catalog AI in training:')]")
	private WebElement CatalogAIintraining;
	
	@FindBy(xpath = "//*[@id=\"dvOfferMetrics\"]/div/div[2]/div[2]")
	private WebElement ArtifactSoldCount;

	@FindBy(xpath = "//div[@id='arrowdown']")
	private WebElement ViewMoreSalseStat;

	@FindBy(xpath = "//th[contains(text(),'Customer name')]")
	private WebElement CompassOneDealsLabel;
	
	@FindBy(xpath = "//body/section[1]/button[1]")
	private WebElement DownloadSectionCloseButton;
	
	@FindBy(xpath = "//a[contains(text(),'Solutions & Packages')]")
	private WebElement SolutionsPackagesButton;

	public SolutionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public Set<String> getWindowHandles() {
		return driver.getWindowHandles();
	}

	public void clickOncataloguePagesMenuButton() {
		util.clickOnElementUsingActions(driver, cataloguePagesMenu);
	}

	public void clickOnEmergingInnovationEngineeringPagesMenuButton() {
		util.clickOnElementUsingActions(driver, EmergingInnovationEngineeringPagesMenu);
	}

	public void clickOnDigitalEnablementandOperationsMenuButton() {
		util.clickOnElementUsingActions(driver, DigitalEnablementandOperationsMenu);
	}

	public void clickOnIndustrySolutionsDeliveryHomeMenuButton() {
		util.clickOnElementUsingActions(driver, IndustrySolutionsDeliveryHomeMenu);
	}
	
	public void clickOnUnifiedMenuButton() {
		util.clickOnElementUsingActions(driver, UnifiedMenu);
	}
	
	public void clickOnBusinessAppsMenuButton() {
		util.clickOnElementUsingActions(driver, BusinessAppsMenu);
	}

	public void clickOnCrossSolutionAreaandFunctionalSolutionsMenuButton() {
		util.clickOnElementUsingActions(driver, CrossSolutionAreaandFunctionalSolutionsMenu);
	}

	public void clickOnDigitalandApplicationInnovationMenuButton() {
		util.clickOnElementUsingActions(driver, DigitalandApplicationInnovationMenu);
	}

	public void clickOnDataandAIMenuButton() {
		util.clickOnElementUsingActions(driver, DataandAIMenu);
	}

	public void clickOnInfrastructureMenuButton() {
		util.clickOnElementUsingActions(driver, InfrastructureMenu);
	}

	public void clickOnModernWorkMenuButton() {
		util.clickOnElementUsingActions(driver, ModernWorkMenu);
	}

	public void clickOnSecurityMenuButton() {
		util.clickOnElementUsingActions(driver, SecurityMenu);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}

	public void clickOnAutomotiveMobilityandTransportationMenuButton() {
		util.clickOnElementUsingActions(driver, AutomotiveMobilityandTransportationMenu);
	}

	public void clickOnCrossIndustryMenuButton() {
		util.clickOnElementUsingActions(driver, CrossIndustryMenu);
	}
	
	public void clickIndustryMenuButton() {
		util.clickOnElementUsingActions(driver, IndustryMenu);
	}

	public void clickOnDefenseandIntelligenceMenuButton() {
		util.clickOnElementUsingActions(driver, DefenseandIntelligenceMenu);
	}

	public void clickOnEducationMenuButton() {
		util.clickOnElementUsingActions(driver, EducationMenu);
	}

	public void clickOnEnergyandResourcesMenuButton() {
		util.clickOnElementUsingActions(driver, EnergyandResourcesMenu);
	}

	public void clickOnFinancialServicesMenuButton() {
		util.clickOnElementUsingActions(driver, FinancialServicesMenu);
	}

	public void clickOnGovernmentMenuButton() {
		util.clickOnElementUsingActions(driver, GovernmentMenu);
	}

	public void clickOnHealthcareMenuButton() {
		util.clickOnElementUsingActions(driver, HealthcareMenu);
	}

	public void clickOnIndustrialsandManufacturingMenuButton() {
		util.clickOnElementUsingActions(driver, IndustrialsandManufacturingMenu);
	}
	public void clickOnAdoptionChangeandServicesManagementMenuButton() {
		util.clickOnElementUsingActions(driver, AdoptionChangeandServicesManagementMenu);
	}

	public void clickOnRetailandConsumerGoodsMenuButton() {
		util.clickOnElementUsingActions(driver, RetailandConsumerGoodsMenu);
	}

	public void clickOnSustainabilityMenuButton() {
		util.clickOnElementUsingActions(driver, SustainabilityMenu);
	}

	public void clickOnTelecommunicationsandMediaMenuButton() {
		util.clickOnElementUsingActions(driver, TelecommunicationsandMediaMenu);
	}

	public void clickOnShowDetailsButton() {
		util.scrollDownForElementToBeVisible(driver, ShowDetailsButton, 2000);
		util.clickOnElementUsingActions(driver, ShowDetailsButton);
	}

	public void clickselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, selectAllBom, 2000);
		util.clickOnElementUsingActions(driver, selectAllBom);

	}

	public WebElement getDownloadSelectedText() {
		return DownloadSelected;
	}

	public boolean isDisplayedDownloadButton() {
		// util.clickOnElementUsingActions(driver,carouselPlayButton);
		return getDownloadSelectedText().isDisplayed();
	}

	public void clickOnSubscribeButton() {
		util.clickOnElementUsingActions(driver, SubscribeButton);
	}
	
	public void clickOnReadfulldescriptionButton() {
		util.clickOnElementUsingActions(driver, ReadfulldescriptionButton);
	}
	
	public void clickOnSubscribeSliderButton() {
		util.clickOnElementUsingActions(driver, SubscribeSliderButton);
	}

	public void clickOnSubmitButton() {
		util.clickOnElementUsingActions(driver, SubmitButton);
	}

	public WebElement getSubscribeSucessMsg() {
		return SubscribeSucessMsg;
	}

	public boolean isDisplayedSubscribeSucessMsg() {
		// util.clickOnElementUsingActions(driver,carouselPlayButton);
		return getSubscribeSucessMsg().isDisplayed();
	}

	public WebElement getSubscribeButton() {
		return SubscribeButton;
	}
	public WebElement getDataAISubscribeButton() {
		return DataAISubscribeButton;
	}
	public void clickOnDataAISubscribeButton() {
		util.clickOnElementUsingActions(driver, DataAISubscribeButton);
	}

	public void clickOnUnsubscribeButton() {
		util.clickOnElementUsingActions(driver, UnsubscribeButton);
	}

	public WebElement getEDFEvidenceCheck() {
		return EDFEvidenceCheck;
	}
	public WebElement getIndustriEvidenceCheck() {
		return IndustryEvidenceCheck;
	}
	public WebElement getEvidenceCheck() {
		return EvidenceCheck;
	}
	public WebElement getofferEvidenceCheck() {
		return OfferEvidenceCheck;
	}
	public WebElement getSPEvidenceCheck() {
		return SPEvidenceCheck;
	}
	public WebElement getMaturityCheck() {
		return MaturityCheck;
	}
	public WebElement getDelivaryOrgCheck() {
		return DelivaryOrgCheck;
	}
	public WebElement getProvenMaturityCheck() {
		return ProvenMaturityCheck;
	}
	public WebElement getKeyMaterialsCheck() {
		return KeyMaterialsCheck;
	}
	public boolean isDisplayedgetEDFEvidence() {
		// util.clickOnElementUsingActions(driver,carouselPlayButton);
		return getEDFEvidenceCheck().isDisplayed();
	}
	public WebElement getCatalogueOfferCards() {
		return CatalogueOfferCards;
	}
	public WebElement getCatalogueOffer() {
		return CatalogueOfferTab;
	}
	public WebElement getCatalogueOfferDEO() {
		return CatalogueOfferTabEO;
	}
	public WebElement getSolutionPlay() {
		return SolutionPlayCheck;
	}
	public WebElement gettabServices() {
		return ServicesCheck;
	}
	public WebElement getArtifact() {
		return ArtifactCheck;
	}
	
	public WebElement getArtifactTabName() {
		return ArtifactTabName;
	}
	public boolean isDisplayedCatalogueOffer() {
		// util.clickOnElementUsingActions(driver,carouselPlayButton);
		return getCatalogueOffer().isDisplayed();
	}


	public void clickOnBOMTABButton() {
		util.scrollDownForElementToBeVisible(driver, BOMButton, 2000);
		util.clickOnElementUsingActions(driver, BOMButton);
	}
	
	public void clickOnSPBOMTABButton() {
		util.scrollDownForElementToBeVisible(driver, SPBOMButton, 2000);
		util.clickOnElementUsingActions(driver, SPBOMButton);
	}
	
	public void clickOnDABOMTABButton() {
		util.scrollDownForElementToBeVisible(driver, DataAIBOMButton, 2000);
		util.clickOnElementUsingActions(driver, DataAIBOMButton);
	}

	public void clickACMselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, ACMselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, ACMselectAllBom);

	}

	public void clickArtefactButton() {
		util.scrollDownForElementToBeVisible(driver, ArtefactButton, 2000);
		util.clickOnElementUsingActions(driver, ArtefactButton);
	}
	public void clickBOMButton() {
		util.scrollDownForElementToBeVisible(driver, BOMButton, 2000);
		util.clickOnElementUsingActions(driver, BOMButton);
	}
	public void clickCatalogueOfferButton() {
		util.scrollDownForElementToBeVisible(driver, CatalogueOfferButton, 2000);
		util.clickOnElementUsingActions(driver, CatalogueOfferButton);
	}
	public void clicktabSolutionPlayButtonButton() {
		util.scrollDownForElementToBeVisible(driver, tabSolutionPlayButton, 2000);
		util.clickOnElementUsingActions(driver, tabSolutionPlayButton);
	}
	public void clicktabServicesButtonButton() {
		util.scrollDownForElementToBeVisible(driver, tabServicesButton, 2000);
		util.clickOnElementUsingActions(driver, tabServicesButton);
	}
	public WebElement getSoldCount() {
		return SoldCount;
	}
	public WebElement getexportsummery() {
		return exportsummery;
	}
	public WebElement getCatalogAssistanceRequestFormLabel() {
		return CatalogAssistanceRequestFormLabel;
	}
	public WebElement getCatalogAIintraininglabel() {
		return CatalogAIintraining;
	}
	public void SoldCountwaitForElementToBeVisible()
	{
		util.waitForElementToBeVisible(driver, SoldCount,50);
	}
	public WebElement getArtifactSoldCount() {
		return ArtifactSoldCount;
	}
	public void clickViewMoreSalseStatButton() {
		util.scrollDownForElementToBeVisible(driver, ViewMoreSalseStat, 2000);
		util.clickOnElementUsingActions(driver, ViewMoreSalseStat);
	}
	public WebElement getCompassOneDealsLabel() {
		return CompassOneDealsLabel;
	}
	public boolean isDisplayedCompassOneDealsLabel() {
		// util.clickOnElementUsingActions(driver,carouselPlayButton);
		return getCompassOneDealsLabel().isDisplayed();
	}
	public void CompassOneDealsLabelwaitForElementToBeVisible()
	{
		util.waitForElementToBeVisible(driver, CompassOneDealsLabel,50);
	}
	public void clickABAselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, BAselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, BAselectAllBom);
	}
	public void clickOnDownloadSectionCloseButton() 
	{
		util.clickOnElementUsingActions(driver, DownloadSectionCloseButton);
		
	}
	public void clickOnAMTselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, AMTselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, AMTselectAllBom);
	}
	public void clickOnCIselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, CIselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, CIselectAllBom);
	}
	public void clickonCSAselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, DaIselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, CSAselectAllBom);
	}
	public void clickonDAIselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, DAIselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, DAIselectAllBom);
	}
	public void clickonSolutionsPackagesButton() {
		util.clickOnElementUsingActions(driver, SolutionsPackagesButton);
	}
	public void clickonDandIselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, DandIselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, DandIselectAllBom);
	}
	public void clickonDandIselectAllBomMainButton() {
		util.scrollDownForElementToBeVisible(driver, DandIselectAllBomMain, 2000);
		util.clickOnElementUsingActions(driver, DandIselectAllBomMain);
	}
	public void clickonInfraselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, InfraselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, InfraselectAllBom);
	}
	public void clickonModernWorkselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, ModernWorkselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, ModernWorkselectAllBom);
	}
	public void clickonSecurityselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, SecurityselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, SecurityselectAllBom);
	}
	public void clickonCloudTSselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, CloudselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, CloudselectAllBom);
	}
	public void clickonBaMAIAppsSselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, BaMAIAppsselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, BaMAIAppsselectAllBom);
	}
	public void clickonEndselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, EndselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, EndselectAllBom);
	}
	public void clickonDECatlogOfferButton() {
		util.scrollDownForElementToBeVisible(driver, DECatlogOfferButton, 2000);
		util.clickOnElementUsingActions(driver, DECatlogOfferButton);
	}
	public void clickonEvidenceTabButton() {
		util.scrollDownForElementToBeVisible(driver, EvidenceTab, 2000);
		util.clickOnElementUsingActions(driver, EvidenceTab);
	}
	public void clickonMLOMButton() {
		util.scrollDownForElementToBeVisible(driver, MLOMButton, 2000);
		util.clickOnElementUsingActions(driver, MLOMButton);
	}
	public void clickonCSUButton() {
		util.scrollDownForElementToBeVisible(driver, CSUButton, 2000);
		util.clickOnElementUsingActions(driver, CSUButton);
	}
	public void clickonVBDFindOutMoreButton() {
		util.scrollDownForElementToBeVisible(driver, VBDFindOutMoreButton, 2000);
		util.clickOnElementUsingActions(driver, VBDFindOutMoreButton);
	}
	public void clickonPSSFindOutMoreButton() {
		util.scrollDownForElementToBeVisible(driver, PSSFindOutMoreButton, 2000);
		util.clickOnElementUsingActions(driver, PSSFindOutMoreButton);
	}
	public void clickonResourcesButton() {
		util.scrollDownForElementToBeVisible(driver, ResourcesButton, 2000);
		util.clickOnElementUsingActions(driver, ResourcesButton);
	}
	public void clickonMSPlayBookButton() {
		util.scrollDownForElementToBeVisible(driver, MSPlayBookButton, 2000);
		util.clickOnElementUsingActions(driver, MSPlayBookButton);
	}
	public void clickonLearnMoreButton() {
		util.scrollDownForElementToBeVisible(driver, LearnMoreButton, 2000);
		util.clickOnElementUsingActions(driver, LearnMoreButton);
	}
	public void clickOnDaIselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, DaIselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, DaIselectAllBom);
	}
	public void clickOnEduselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, EduselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, EduselectAllBom);
	}
	public void clickOnEaRselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, EaRselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, EaRselectAllBom);
	}
	public void clickOnFinselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, FinselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, FinselectAllBom);
	}
	public void clickOnGovselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, GovselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, GovselectAllBom);
	}
	public void clickOnHealthselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, HealthselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, HealthselectAllBom);
	}
	public void clickOnIaMselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, IaMselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, IaMselectAllBom);
	}
	public void clickOnRaCGselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, RaCGselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, RaCGselectAllBom);
	}
	public void clickOnSuSselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, SusselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, SusselectAllBom);
	}
	public void clickOnTelselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, TelCselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, TelCselectAllBom);
	}
	public void ArtifactsTabtwaitForElementToBeVisible()
	{
		util.waitForElementToBeVisible(driver, ArtifactTabName,50);
	}
	public void ExportButtonwaitForElementToBeVisible()
	{
		util.waitForElementToBeVisible(driver, exportsummery,50);
	}
	public void CatalogAssistanceRequestFormLabelwaitForElementToBeVisible()
	{
		util.waitForElementToBeVisible(driver, CatalogAssistanceRequestFormLabel,50);
	}
	public void AISumLabelwaitForElementToBeVisible()
	{
		util.waitForElementToBeVisible(driver, CatalogAIintraining,50);
	}
	public void getSolutionPlaywaitForElementToBeVisible()
	{
		util.waitForElementToBeVisible(driver, SolutionPlayCheck,50);
	}
	public void gettabServiceswaitForElementToBeVisible()
	{
		util.waitForElementToBeVisible(driver, ServicesCheck,50);
	}
}
