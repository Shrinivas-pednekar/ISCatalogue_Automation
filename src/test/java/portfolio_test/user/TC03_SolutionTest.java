
package portfolio_test.user;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.swing.text.Utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.SolutionPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.TestBase;

public class TC03_SolutionTest extends TestBase {
	public WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	SolutionPage cataloguePage;

	Utilities util;
	public static Logger log = LogManager.getLogger(TestBase.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");
		util = new Utilities();
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		cataloguePage = new SolutionPage(driver);
		driver.get(prop.getProperty("produrl"));
		//loginPage.clickOnUserButton();

	}


	// --------------------------------------------Solution Area Innovation-----------------------
	@Test(priority = 2)
	public void verifyAdoptionChangeandServicesManagementPageOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnAdoptionChangeandServicesManagementMenuButton();
		Thread.sleep(3000);
		// boolean isTrue ;
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(2000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(2000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
	//	homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		
		
		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText()
				.contains("Customer Evidence");
		//System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
		Assert.assertTrue(actualResult4);
		System.out.println("Displayed EDF Evidence");
		
		boolean actualResult5 = cataloguePage.getCatalogueOffer().getText()
				.contains("Center of Excellence for Power Platform");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult5);
		System.out.println("Displayed Catalogue Offer ");

		
	
		cataloguePage.clickArtefactButton();
		//cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		Thread.sleep(6000);
		boolean actualResult6 = cataloguePage.getArtifactTabName().getText()
				.contains("Catalogue Artifact");
		//System.out.println("Artifact displaed as expected =" + cataloguePage.getArtifactTabName().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Artifact ");
	
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Adoption, Change, and Services Management"));
		System.out.println("Adoption, Change, and Services Management is loaded sucessfully ");
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void verifyBusinessAppsPageButtonOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnBusinessAppsMenuButton();
		Thread.sleep(5000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
		
		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText()
				.contains("Customer Evidence");
		//System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
		Assert.assertTrue(actualResult4);
		System.out.println("Displayed Customer Evidence");
		
		boolean actualResult5 = cataloguePage.getSolutionPlay().getText()
				.contains("Solution Play");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getSolutionPlay().getText());
		Assert.assertTrue(actualResult5);
		System.out.println("Displayed Solution Play ");
		
		cataloguePage.clickCatalogueOfferButton();
		Thread.sleep(5000);
		boolean actualResult6 = cataloguePage.getCatalogueOffer().getText()
				.contains("Catalogue Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");

		
	
		cataloguePage.clickArtefactButton();
		//cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		Thread.sleep(5000);
		boolean actualResult7 = cataloguePage.getArtifactTabName().getText()
				.contains("Catalogue Artifact");
		//System.out.println("Artifact displaed as expected =" + cataloguePage.getArtifactTabName().getText());
		Assert.assertTrue(actualResult7);
		System.out.println("Displayed Artifact ");		
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Business Apps"));
		Thread.sleep(3000);
	}

	

	@Test(priority = 5)
	public void verifyDigitalandApplicationInnovationOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnDigitalandApplicationInnovationMenuButton();
		Thread.sleep(5000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}

		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText()
				.contains("Customer Evidence");
		//System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
		Assert.assertTrue(actualResult4);
		System.out.println("Displayed EDF Evidence");
		
		boolean actualResult5 = cataloguePage.getSolutionPlay().getText()
				.contains("Solution Play");
		System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getSolutionPlay().getText());
		Assert.assertTrue(actualResult5);
		System.out.println("Displayed Solution Play ");
		
		cataloguePage.clickCatalogueOfferButton();
		Thread.sleep(5000);
		boolean actualResult6 = cataloguePage.getCatalogueOffer().getText()
				.contains("Catalogue Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
	
		cataloguePage.clickArtefactButton();
		//cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		Thread.sleep(5000);
		boolean actualResult7 = cataloguePage.getArtifactTabName().getText()
				.contains("Catalogue Artifact");
		//System.out.println("Artifact displaed as expected =" + cataloguePage.getArtifactTabName().getText());
		Assert.assertTrue(actualResult7);
		System.out.println("Displayed Artifact ");	
		
		cataloguePage.clickBOMButton();
		cataloguePage.clickonDAIselectAllBomButton();
		Assert.assertTrue(cataloguePage.isDisplayedDownloadButton());
		System.out.println("BOM is displayed and able to download ");
		Thread.sleep(2000);
		cataloguePage.clickOnDownloadSectionCloseButton();
		Thread.sleep(2000);

		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Digital and Application Innovation"));
		Thread.sleep(3000);
	}

	@Test(priority = 6)
	public void verifyDataandAIOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(2000);
		cataloguePage.clickOnDataandAIMenuButton();
		Thread.sleep(7000);

		try {
			if (cataloguePage.getDataAISubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnDataAISubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
	
		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText()
				.contains("Customer Evidence");
		//System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
		Assert.assertTrue(actualResult4);
		System.out.println("Displayed EDF Evidence");
		
		boolean actualResult5 = cataloguePage.getSolutionPlay().getText()
				.contains("Solution Play");
		System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getSolutionPlay().getText());
		Assert.assertTrue(actualResult5);
		System.out.println("Displayed Solution Play ");
		
		cataloguePage.clickCatalogueOfferButton();
		Thread.sleep(5000);
		boolean actualResult6 = cataloguePage.getCatalogueOffer().getText()
				.contains("Catalogue Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
	
		cataloguePage.clickArtefactButton();
		//cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		Thread.sleep(5000);
		boolean actualResult7 = cataloguePage.getArtifactTabName().getText()
				.contains("Catalogue Artifact");
		//System.out.println("Artifact displaed as expected =" + cataloguePage.getArtifactTabName().getText());
		Assert.assertTrue(actualResult7);
		System.out.println("Displayed Artifact ");	
		
		cataloguePage.clickBOMButton();
		cataloguePage.clickonDandIselectAllBomMainButton();
		Assert.assertTrue(cataloguePage.isDisplayedDownloadButton());
		System.out.println("BOM is displayed and able to download ");
		Thread.sleep(2000);
		cataloguePage.clickOnDownloadSectionCloseButton();
		Thread.sleep(2000);

		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Data and AI"));
		Thread.sleep(3000);
	}

	@Test(priority = 7)
	public void verifyInfrastructureOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnInfrastructureMenuButton();
		Thread.sleep(5000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText()
				.contains("Customer Evidence");
		//System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
		Assert.assertTrue(actualResult4);
		System.out.println("Displayed EDF Evidence");
		
		boolean actualResult5 = cataloguePage.getSolutionPlay().getText()
				.contains("Solution Play");
		System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getSolutionPlay().getText());
		Assert.assertTrue(actualResult5);
		System.out.println("Displayed Solution Play ");
		
		cataloguePage.clickCatalogueOfferButton();
		Thread.sleep(5000);
		boolean actualResult6 = cataloguePage.getCatalogueOffer().getText()
				.contains("Catalogue Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
	
		cataloguePage.clickArtefactButton();
		//cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		Thread.sleep(5000);
		boolean actualResult7 = cataloguePage.getArtifactTabName().getText()
				.contains("Catalogue Artifact");
		//System.out.println("Artifact displaed as expected =" + cataloguePage.getArtifactTabName().getText());
		Assert.assertTrue(actualResult7);
		System.out.println("Displayed Artifact ");	
		
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Infrastructure"));
		Thread.sleep(3000);
	}

	@Test(priority = 8)
	public void verifyModernWorkOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(2000);
		cataloguePage.clickOnModernWorkMenuButton();
		Thread.sleep(5000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}

		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText()
				.contains("Customer Evidence");
		//System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
		Assert.assertTrue(actualResult4);
		System.out.println("Displayed EDF Evidence");
		
		boolean actualResult5 = cataloguePage.getSolutionPlay().getText()
				.contains("Solution Play");
		System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getSolutionPlay().getText());
		Assert.assertTrue(actualResult5);
		System.out.println("Displayed Solution Play ");
		
		cataloguePage.clickCatalogueOfferButton();
		Thread.sleep(5000);
		boolean actualResult6 = cataloguePage.getCatalogueOffer().getText()
				.contains("Catalogue Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
	
		cataloguePage.clickArtefactButton();
		//cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		Thread.sleep(5000);
		boolean actualResult7 = cataloguePage.getArtifactTabName().getText()
				.contains("Catalogue Artifact");
		//System.out.println("Artifact displaed as expected =" + cataloguePage.getArtifactTabName().getText());
		Assert.assertTrue(actualResult7);
		System.out.println("Displayed Artifact ");	
		
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Modern Work"));
		Thread.sleep(3000);
	}

	@Test(priority = 9)
	public void verifySecurityOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnSecurityMenuButton();
		Thread.sleep(5000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}

		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText()
				.contains("Customer Evidence");
		//System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
		Assert.assertTrue(actualResult4);
		System.out.println("Displayed EDF Evidence");
		
		boolean actualResult5 = cataloguePage.getSolutionPlay().getText()
				.contains("Solution Play");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getSolutionPlay().getText());
		Assert.assertTrue(actualResult5);
		System.out.println("Displayed Solution Play ");
		
		cataloguePage.clickArtefactButton();
		//cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		Thread.sleep(5000);
		boolean actualResult7 = cataloguePage.getArtifactTabName().getText()
				.contains("Catalogue Artifact");
		//System.out.println("Artifact displaed as expected =" + cataloguePage.getArtifactTabName().getText());
		Assert.assertTrue(actualResult7);
		System.out.println("Displayed Artifact ");	
		
		cataloguePage.clickBOMButton();
		cataloguePage.clickonSecurityselectAllBomButton();
		Assert.assertTrue(cataloguePage.isDisplayedDownloadButton());
		System.out.println("BOM is displayed and able to download ");
		Thread.sleep(2000);
		cataloguePage.clickOnDownloadSectionCloseButton();
		Thread.sleep(2000);
		
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Security"));
		Thread.sleep(3000);
	}

	// -------------------------------Industry Innovation---------------------------
	@Test(priority = 10)
	public void verifyMobilityOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnAutomotiveMobilityandTransportationMenuButton();
		Thread.sleep(3000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
		boolean actualResult3 = cataloguePage.getSoldCount().getText().contains("414");
		Assert.assertTrue(actualResult3);
		cataloguePage.clickViewMoreSalseStatButton();
		Thread.sleep(3000);
		Assert.assertTrue(cataloguePage.isDisplayedCompassOneDealsLabel());
		System.out.println("Industry stat cound and table is verified ");

		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText()
				.contains("Customer Evidence");
		//System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
		Assert.assertTrue(actualResult4);
		System.out.println("Displayed EDF Evidence");
		
		boolean actualResult6 = cataloguePage.getCatalogueOffer().getText()
				.contains("Catalogue Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");	

		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Mobility"));
		Thread.sleep(3000);

	}
	
	@Test(priority = 11)
	public void verifyCrossIndustryOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnCrossIndustryMenuButton();
		Thread.sleep(3000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}

		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText()
				.contains("Customer Evidence");
		//System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
		Assert.assertTrue(actualResult4);
		System.out.println("Displayed EDF Evidence");
		
		boolean actualResult6 = cataloguePage.getCatalogueOffer().getText()
				.contains("Catalogue Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
		
		cataloguePage.clickArtefactButton();
		//cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		Thread.sleep(5000);
		boolean actualResult7 = cataloguePage.getArtifactTabName().getText()
				.contains("Catalogue Artifact");
		//System.out.println("Artifact displaed as expected =" + cataloguePage.getArtifactTabName().getText());
		Assert.assertTrue(actualResult7);
		System.out.println("Displayed Artifact ");	
		

		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Cross-Industry"));
		Thread.sleep(3000);
	}

		@Test(priority = 12)
	public void verifyDefenseandIntelligenceOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnDefenseandIntelligenceMenuButton();
		Thread.sleep(3000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}

		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText()
				.contains("Customer Evidence");
		//System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
		Assert.assertTrue(actualResult4);
		System.out.println("Displayed EDF Evidence");
		
		boolean actualResult6 = cataloguePage.getCatalogueOffer().getText()
				.contains("Catalogue Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
		
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Defense and Intelligence"));
		Thread.sleep(3000);
	}

	@Test(priority = 13)
	public void verifyEducationOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnEducationMenuButton();
		Thread.sleep(3000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(2000);
				cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(3000);
			cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText()
				.contains("Customer Evidence");
		//System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
		Assert.assertTrue(actualResult4);
		System.out.println("Displayed EDF Evidence");
		
		cataloguePage.clickonSecurityselectAllBomButton();
		Assert.assertTrue(cataloguePage.isDisplayedDownloadButton());
		System.out.println("BOM is displayed and able to download ");
		Thread.sleep(2000);
		cataloguePage.clickOnDownloadSectionCloseButton();
		Thread.sleep(2000);
		
		cataloguePage.clickCatalogueOfferButton();
		Thread.sleep(5000);
		boolean actualResult6 = cataloguePage.getCatalogueOffer().getText()
				.contains("Catalogue Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
		
		cataloguePage.clickArtefactButton();
		//cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		Thread.sleep(5000);
		boolean actualResult7 = cataloguePage.getArtifactTabName().getText()
				.contains("Catalogue Artifact");
		//System.out.println("Artifact displaed as expected =" + cataloguePage.getArtifactTabName().getText());
		Assert.assertTrue(actualResult7);
		System.out.println("Displayed Artifact ");	
		
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Education"));
		Thread.sleep(3000);
	}

	@Test(priority = 14)
	public void verifyEnergyCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnEnergyandResourcesMenuButton();
		Thread.sleep(3000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
		
		boolean actualResult3 = cataloguePage.getSoldCount().getText().contains("300");
		Assert.assertTrue(actualResult3);
		cataloguePage.clickViewMoreSalseStatButton();
		Thread.sleep(3000);
		Assert.assertTrue(cataloguePage.isDisplayedCompassOneDealsLabel());
		System.out.println("Industry stat cound and table is verified ");

		cataloguePage.clickonSecurityselectAllBomButton();
		Assert.assertTrue(cataloguePage.isDisplayedDownloadButton());
		System.out.println("BOM is displayed and able to download ");
		Thread.sleep(2000);
		cataloguePage.clickOnDownloadSectionCloseButton();
		Thread.sleep(2000);

		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Energy"));
		Thread.sleep(3000);
	}

	@Test(priority = 15)
	public void verifyFinancialServicesOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnFinancialServicesMenuButton();
		Thread.sleep(3000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}

		boolean actualResult3 = cataloguePage.getSoldCount().getText().contains("798");
		Assert.assertTrue(actualResult3);
		cataloguePage.clickViewMoreSalseStatButton();
		Thread.sleep(3000);
		Assert.assertTrue(cataloguePage.isDisplayedCompassOneDealsLabel());
		System.out.println("Industry stat cound and table is verified ");

		boolean actualResult6 = cataloguePage.getCatalogueOffer().getText()
				.contains("Catalogue Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
		
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Financial Services"));
		Thread.sleep(3000);
	}
	
	@Test(priority = 16)
	public void verifyGovernmentOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnGovernmentMenuButton();
		Thread.sleep(5000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(2000);
				cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(2000);
			cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
		boolean actualResult3 = cataloguePage.getSoldCount().getText().contains("590");
		Assert.assertTrue(actualResult3);
		cataloguePage.clickViewMoreSalseStatButton();
		Thread.sleep(3000);
		Assert.assertTrue(cataloguePage.isDisplayedCompassOneDealsLabel());
		System.out.println("Industry stat cound and table is verified ");

		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText()
				.contains("Customer Evidence");
		//System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
		Assert.assertTrue(actualResult4);
		System.out.println("Displayed EDF Evidence");
		
		cataloguePage.clickonSecurityselectAllBomButton();
		Assert.assertTrue(cataloguePage.isDisplayedDownloadButton());
		System.out.println("BOM is displayed and able to download ");
		Thread.sleep(2000);
		cataloguePage.clickOnDownloadSectionCloseButton();
		Thread.sleep(2000);
		
		cataloguePage.clickCatalogueOfferButton();
		Thread.sleep(5000);
		boolean actualResult6 = cataloguePage.getCatalogueOffer().getText()
				.contains("Catalogue Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
		
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Government"));
		Thread.sleep(3000);
	}

	@Test(priority = 17)
	public void verifyHealthcareOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnHealthcareMenuButton();
		Thread.sleep(3000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
		boolean actualResult3 = cataloguePage.getSoldCount().getText().contains("240");
		Assert.assertTrue(actualResult3);
		cataloguePage.clickViewMoreSalseStatButton();
		Thread.sleep(3000);
		Assert.assertTrue(cataloguePage.isDisplayedCompassOneDealsLabel());
		System.out.println("Industry stat cound and table is verified ");

		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText()
				.contains("Customer Evidence");
		//System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
		Assert.assertTrue(actualResult4);
		System.out.println("Displayed EDF Evidence");
		
		cataloguePage.clickonSecurityselectAllBomButton();
		Assert.assertTrue(cataloguePage.isDisplayedDownloadButton());
		System.out.println("BOM is displayed and able to download ");
		Thread.sleep(2000);
		cataloguePage.clickOnDownloadSectionCloseButton();
		Thread.sleep(2000);
		
		cataloguePage.clickCatalogueOfferButton();
		Thread.sleep(5000);
		boolean actualResult6 = cataloguePage.getCatalogueOffer().getText()
				.contains("Catalogue Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
		
		cataloguePage.clickArtefactButton();
		//cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		Thread.sleep(5000);
		boolean actualResult7 = cataloguePage.getArtifactTabName().getText()
				.contains("Catalogue Artifact");
		//System.out.println("Artifact displaed as expected =" + cataloguePage.getArtifactTabName().getText());
		Assert.assertTrue(actualResult7);
		System.out.println("Displayed Artifact ");
		
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Healthcare"));
		Thread.sleep(3000);
	}

	@Test(priority = 18)
	public void verifyIndustrialsandManufacturingOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnIndustrialsandManufacturingMenuButton();
		Thread.sleep(3000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
		boolean actualResult3 = cataloguePage.getSoldCount().getText().contains("291");
		Assert.assertTrue(actualResult3);
		cataloguePage.clickViewMoreSalseStatButton();
		Thread.sleep(3000);
		Assert.assertTrue(cataloguePage.isDisplayedCompassOneDealsLabel());
		System.out.println("Industry stat cound and table is verified ");

		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText()
				.contains("Customer Evidence");
	//	System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
		Assert.assertTrue(actualResult4);
		System.out.println("Displayed EDF Evidence");
		
		boolean actualResult7 = cataloguePage.getArtifactTabName().getText()
				.contains("Catalogue Artifact");
		//System.out.println("Artifact displaed as expected =" + cataloguePage.getArtifactTabName().getText());
		Assert.assertTrue(actualResult7);
		System.out.println("Displayed Artifact ");
		
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Industrials and Manufacturing"));
		Thread.sleep(3000);
	}
	
	@Test(priority = 19)
	public void verifyRetailandConsumerGoodsOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnRetailandConsumerGoodsMenuButton();
		Thread.sleep(3000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
		boolean actualResult3 = cataloguePage.getSoldCount().getText().contains("296");
		Assert.assertTrue(actualResult3);
		cataloguePage.clickViewMoreSalseStatButton();
		Thread.sleep(3000);
		Assert.assertTrue(cataloguePage.isDisplayedCompassOneDealsLabel());
		System.out.println("Industry stat cound and table is verified ");

		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText()
				.contains("Customer Evidence");
		//System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
		Assert.assertTrue(actualResult4);
		System.out.println("Displayed EDF Evidence");
		
		boolean actualResult6 = cataloguePage.getCatalogueOffer().getText()
				.contains("Catalogue Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
		
		cataloguePage.clickArtefactButton();
		//cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		Thread.sleep(5000);
		boolean actualResult7 = cataloguePage.getArtifactTabName().getText()
				.contains("Catalogue Artifact");
		//System.out.println("Artifact displaed as expected =" + cataloguePage.getArtifactTabName().getText());
		Assert.assertTrue(actualResult7);
		System.out.println("Displayed Artifact ");

		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Retail and Consumer Goods"));
		Thread.sleep(3000);
	}

	@Test(priority = 20)
	public void verifySustainabilityOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnSustainabilityMenuButton();
		Thread.sleep(3000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}

		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText()
				.contains("Customer Evidence");
		//System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
		Assert.assertTrue(actualResult4);
		System.out.println("Displayed EDF Evidence");
		
		boolean actualResult6 = cataloguePage.getCatalogueOffer().getText()
				.contains("Catalogue Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
		
		cataloguePage.clickArtefactButton();
		//cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		Thread.sleep(5000);
		boolean actualResult7 = cataloguePage.getArtifactTabName().getText()
				.contains("Catalogue Artifact");
		//System.out.println("Artifact displaed as expected =" + cataloguePage.getArtifactTabName().getText());
		Assert.assertTrue(actualResult7);
		System.out.println("Displayed Artifact ");
		
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Sustainability"));
		Thread.sleep(5000);
	}

	@Test(priority = 21)
	public void verifyTelecommunicationsandMediaOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnTelecommunicationsandMediaMenuButton();
		Thread.sleep(3000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText()
				.contains("Customer Evidence");
		//System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
		Assert.assertTrue(actualResult4);
		System.out.println("Displayed EDF Evidence");
		
		cataloguePage.clickArtefactButton();
		//cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		Thread.sleep(5000);
		boolean actualResult7 = cataloguePage.getArtifactTabName().getText()
				.contains("Catalogue Artifact");
		//System.out.println("Artifact displaed as expected =" + cataloguePage.getArtifactTabName().getText());
		Assert.assertTrue(actualResult7);
		System.out.println("Displayed Artifact ");

		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Telecommunications and Media"));
	}
	
	// -------------------------------Transformative Deals Page------------------------------------
	@Test(priority = 22)
	public void verifyDigitalEnablementandOperationsOnSolutionPage() throws Throwable {
		
		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnDigitalEnablementandOperationsMenuButton();
		Thread.sleep(3000);
		// boolean isTrue ;
		boolean actualResult5 = cataloguePage.getCatalogueOffer().getText()
				.contains("Catalogue Offer");
		///System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult5);
		System.out.println("Displayed Catalogue Offer ");
	
		cataloguePage.clickArtefactButton();
		//cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		Thread.sleep(6000);
		boolean actualResult6 = cataloguePage.getArtifactTabName().getText()
				.contains("Catalogue Artifact");
	//	System.out.println("Artifact displaed as expected =" + cataloguePage.getArtifactTabName().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Artifact ");
	
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Digital Enablement and Operations"));
		System.out.println("Digital Enablement and Operations is loaded sucessfully ");
	
	}

/*
	@Test(priority = 22, enabled = false)
	public void testBrokenLinks() throws IOException, InterruptedException {
		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnBusinessAppsMenuButton();
		Thread.sleep(30000);
		List<WebElement> links = driver.findElements(By.xpath("//a[contains(@href,'.')]"));
		System.out.println("Total links on the page: " + links.size());
		HttpURLConnection.setFollowRedirects(false); // disable automatic redirects
		int maxRedirects = 5;
		for (WebElement link : links) {
			// Thread.sleep(3000);
			String url = link.getAttribute("href");
			// Thread.sleep(3000);

			if (url == null || url.isEmpty() || url.startsWith("mailto:")) {
				continue;
			}
			HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
			// Thread.sleep(3000);
			connection.setRequestMethod("GET");
			// Thread.sleep(3000);
			int responseCode = connection.getResponseCode();

			if (responseCode >= 400) {
				/*
				 * connection.connect(); InputStream errorStream = connection.getErrorStream();
				 * BufferedReader reader = new BufferedReader(new
				 * InputStreamReader(errorStream)); String line; StringBuilder errorMessage =
				 * new StringBuilder(); while ((line = reader.readLine()) != null) {
				 * errorMessage.append(line); } reader.close();
				 * System.out.println("Error message: " + errorMessage.toString());
				 */

		/*		System.out.println("Broken Link: |" + url + " | Response Code: |" + responseCode);

			} else {
				System.out.println("Working Link: |" + url + " | Response Code: |" + responseCode);

			}
			Thread.sleep(2000);
		}
	}
*/
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}