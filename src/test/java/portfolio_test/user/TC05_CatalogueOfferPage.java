
package portfolio_test.user;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import javax.swing.text.Utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ResourcesPage;
import pageObjects.SolutionPage;
import resources.TestBase;

public class TC05_CatalogueOfferPage extends TestBase {
	public WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	ResourcesPage resourcesPage;
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
		resourcesPage = new ResourcesPage(driver);
		cataloguePage = new SolutionPage(driver);
	
		driver.get(prop.getProperty("CatalogueOffer"));
		
		//loginPage.clickOnUserButton();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}

	@Test(priority = 1)
	public void verifyReadfulldescriptionOnCatalogueOfferPage() throws Throwable {

		cataloguePage.clickOnReadfulldescriptionButton();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Cloud Transition Services Description"));
		driver.close();
		driver.switchTo().window(mainTab);
	}
	
	@Test(priority = 2)
	public void VerifySubscribeUnsubscribeOfCatalogueOffer() throws InterruptedException {
		Thread.sleep(7000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(2000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(5000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(3000); 
				cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(5000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(3000); 
			cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(5000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
	}
	
	@Test(priority = 3)
	public void VerifySSTATSAndIMPACTOfCatalogueOffer() throws InterruptedException {
		cataloguePage.SoldCountwaitForElementToBeVisible();
		boolean actualResult3 = cataloguePage.getSoldCount().getText().contains("248");
		Assert.assertTrue(actualResult3);
		
		cataloguePage.clickViewMoreSalseStatButton();
		cataloguePage.CompassOneDealsLabelwaitForElementToBeVisible();
		Assert.assertTrue(cataloguePage.isDisplayedCompassOneDealsLabel());
		System.out.println("Stat count and table is verified ");
	}
	
	@Test(priority = 4)
	public void VerifyMaturitySectionOfCatalogueOffer() throws InterruptedException {
	boolean actualResult1 = cataloguePage.getMaturityCheck().getText()
			.contains("Mainstream");
	//System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
	Assert.assertTrue(actualResult1);
	System.out.println("Displayed Maturity");
	}
	
	@Test(priority = 5)
	public void VerifyKeyMaterialsSectionOfCatalogueOffer() throws InterruptedException {
	boolean actualResult1 = cataloguePage.getKeyMaterialsCheck().getText()
			.contains("CTS - Customer Presentation - BDM");
	//System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
	Assert.assertTrue(actualResult1);
	System.out.println("Displayed Key Materials");
	
	}
	
	@Test(priority = 6)
	public void VerifyEvidenceSectionOfCatalogueOffer() throws InterruptedException {
		String[] expectedTexts = {"Win Wires", "Delivery Stories", "Win Analysis","Customer Testimonial"};
		String actualText = cataloguePage.getEDFEvidenceCheck().getText();
		// Initialize a flag to track if any of the expected texts is found
		boolean foundExpectedText = false;
		// Iterate over each expected text and check if the actual text contains it
		for (String expectedText : expectedTexts) {
		    if (actualText.contains(expectedText)) {
		        foundExpectedText = true;
		        break; // Exit the loop if any expected text is found
		    }
		}
		// Assertion
		Assert.assertTrue(foundExpectedText);
		System.out.println("Displayed Customer Evidence");
	}
	
	@Test(priority = 7)
	public void VerifyENHANCEMENTSSectionOfCatalogueOffer() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		cataloguePage.clickonDECatlogOfferButton();
		
		//Assert.assertTrue(driver.getTitle().contains("Complex Architecture and Design Services"));
				softAssert.assertTrue(driver.getTitle().contains("Complex Architecture and Design Services"),
		                "Title does not contain 'Complex Architecture and Design Services'.");
						Thread.sleep(2000);
				System.out.println("Displayed Deal Enchancement");
	Thread.sleep(2000);
	//driver.navigate().back();
	driver.navigate().back();
	Thread.sleep(2000);
	//loginPage.clickOnUserButton();
		
	softAssert.assertAll();
	
	}
	@Test(priority = 8)
	public void VerifyBoMSectionOfCatalogueOffer() throws InterruptedException {
		Thread.sleep(5000);
		cataloguePage.clickonCloudTSselectAllBomButton();
	Assert.assertTrue(cataloguePage.isDisplayedDownloadButton());
	System.out.println("BOM is displayed and able to download ");
	Thread.sleep(2000);
	cataloguePage.clickOnDownloadSectionCloseButton();
	System.out.println("clickOnDownloadSectionCloseButton ");
	Thread.sleep(2000);
	}
	
	@Test(priority = 9, enabled=true)
	public void VerifyServicesSectionOfCatalogueOffer() throws InterruptedException {
		cataloguePage.clicktabServicesButtonButton();
		cataloguePage.gettabServiceswaitForElementToBeVisible();
	boolean actualResult5 = cataloguePage.gettabServices().getText()
			.contains("Default Service");
	//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getSolutionPlay().getText());
	Assert.assertTrue(actualResult5);
	System.out.println("Displayed Service");
	}
		
	@Test(priority = 10)
	public void VerifySeeAllCustomerEvidenceSearchPageFromCatalogueOfferPage() throws Throwable {
		homePage.clickOnCustomerEvidenceSearchButton();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		System.out.println("New Tab URL - " + driver.getCurrentUrl());
		boolean actualResult2 = driver.getCurrentUrl().contains("2016");
		Assert.assertTrue(actualResult2);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("2016"));
		driver.close();
		driver.switchTo().window(mainTab);
	}
	@Test(priority = 11)
	public void VerifyAI_Summary_view_OnCatalogueOfferPage() throws Throwable {
		//Thread.sleep(5000);
		homePage.clickOnAISummaryButton();
		//Thread.sleep(5000);
		cataloguePage.ExportButtonwaitForElementToBeVisible();
		boolean actualResult3 = cataloguePage.getexportsummery().getText().contains("AI Generated Internal Summary");
		System.out.println("Displayed AI Generated Internal Summary");
		Assert.assertTrue(actualResult3);
	}
	
	@Test(priority = 12)
	public void VerifyISDFlagandOffernCatalogueOfferPage() throws Throwable {
		boolean actualResult1 = cataloguePage.getDelivaryOrgCheck().getText()
				.contains("ISD");
		Assert.assertTrue(actualResult1);
		System.out.println("Displayed Delivary Organizarion");
		
		//Thread.sleep(5000);
		homePage.clickOnISDOfferButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Industry Solutions Delivery Home"));
		System.out.println("Industry Solutions Delivery Home is loaded sucessfully ");
	}
	
	@Test(priority = 13)
	public void VerifyCatalogAssistentRequestFormButtonCatalogueOfferPage() throws Throwable {
		driver.navigate().back();
		//Thread.sleep(5000);
		homePage.clickOnCatalogAssistanceRequestFormButton();
		cataloguePage.CatalogAssistanceRequestFormLabelwaitForElementToBeVisible();
		System.out.println("New Tab URL - " + driver.getTitle());
		boolean actualResult3 = cataloguePage.getCatalogAssistanceRequestFormLabel().getText().contains("MCAPS Catalog - Assistance Requests");
		System.out.println("MCAPS Catalog - Assistance Requests is loaded sucessfully ");
		Assert.assertTrue(actualResult3);
		
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}