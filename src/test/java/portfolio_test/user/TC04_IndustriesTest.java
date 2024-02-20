
package portfolio_test.user;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;

import javax.swing.text.Utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
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

public class TC04_IndustriesTest extends TestBase {
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

	// -------------------------------Industry Innovation---------------------------

	
	@Test(priority = 1)
	public void verifyCrossIndustryOnCataloguePage() throws Throwable {
		Thread.sleep(2000);
		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickIndustryMenuButton();
		Thread.sleep(8000);
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

	String[] expectedTexts = {"Win Wires", "Delivery Stories", "Win Analysis","Customer Testimonial"};
		String actualText = cataloguePage.getEDFEvidenceCheck().getText();
		//System.out.println("actualText "+actualText);
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
		
		homePage.clickOnCustomerEvidenceSearchButton();
		Thread.sleep(5000);
		Set<String> allTabs1 = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs1.remove(mainTab);
		String newTab1 = allTabs1.iterator().next();
		driver.switchTo().window(newTab1);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		System.out.println("New Tab URL - " + driver.getCurrentUrl());
		boolean actualResult2 = driver.getCurrentUrl().contains("Cross-Industry");
		Assert.assertTrue(actualResult2);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Cross-Industry"));
		driver.close();
		driver.switchTo().window(mainTab);
		
		homePage.clickOnAISummaryButton();
		cataloguePage.AISumLabelwaitForElementToBeVisible();
		boolean actualResult3 = cataloguePage.getCatalogAIintraininglabel().getText().contains("Catalog AI in training");
		System.out.println("Displayed AI Generated Internal Summary");
		Assert.assertTrue(actualResult3);
		
		boolean actualResult6 = cataloguePage.getCatalogueOfferCards().getText()
				.contains("Catalog Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
		
		System.out.println("New Tab URL - " + driver.getTitle());
		//Assert.assertTrue(driver.getTitle().contains("Cross-Industry"));
		Thread.sleep(3000);
	}
	
	

		@Test(priority = 2)
	public void verifyDefenseandIntelligenceOnCataloguePage() throws Throwable {

		/*
		 * cataloguePage.clickOncataloguePagesMenuButton(); Thread.sleep(3000);
		 * cataloguePage.clickIndustryMenuButton();
		 */
		Thread.sleep(2000);
		cataloguePage.clickOnDefenseandIntelligenceMenuButton();
		Thread.sleep(10000);
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
		
		homePage.clickOnCustomerEvidenceSearchButton();
		Thread.sleep(5000);
		Set<String> allTabs1 = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs1.remove(mainTab);
		String newTab1 = allTabs1.iterator().next();
		driver.switchTo().window(newTab1);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		System.out.println("New Tab URL - " + driver.getCurrentUrl());
		boolean actualResult2 = driver.getCurrentUrl().contains("Defense%20and%20Intelligence");
		Assert.assertTrue(actualResult2);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Defense and Intelligence"));
		driver.close();
		driver.switchTo().window(mainTab);
		
		homePage.clickOnAISummaryButton();
		cataloguePage.AISumLabelwaitForElementToBeVisible();
		boolean actualResult3 = cataloguePage.getCatalogAIintraininglabel().getText().contains("Catalog AI in training");
		System.out.println("Displayed AI Generated Internal Summary");
		Assert.assertTrue(actualResult3);
		
		boolean actualResult6 = cataloguePage.getCatalogueOfferCards().getText()
				.contains("Catalog Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOfferCards().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
		
		System.out.println("New Tab URL - " + driver.getTitle());
		//Assert.assertTrue(driver.getTitle().contains("Defense and Intelligence"));
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void verifyEducationOnCataloguePage() throws Throwable {

		/*
		 * cataloguePage.clickOncataloguePagesMenuButton(); Thread.sleep(3000);
		 * cataloguePage.clickIndustryMenuButton();
		 */
		Thread.sleep(2000);
		cataloguePage.clickOnEducationMenuButton();
		Thread.sleep(10000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(6000);
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
		
		homePage.clickOnCustomerEvidenceSearchButton();
		Thread.sleep(5000);
		Set<String> allTabs1 = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs1.remove(mainTab);
		String newTab1 = allTabs1.iterator().next();
		driver.switchTo().window(newTab1);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		System.out.println("New Tab URL - " + driver.getCurrentUrl());
		boolean actualResult2 = driver.getCurrentUrl().contains("Education");
		Assert.assertTrue(actualResult2);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Education"));
		driver.close();
		driver.switchTo().window(mainTab);
		
		homePage.clickOnAISummaryButton();
		cataloguePage.AISumLabelwaitForElementToBeVisible();
		boolean actualResult3 = cataloguePage.getCatalogAIintraininglabel().getText().contains("Catalog AI in training");
		System.out.println("Displayed AI Generated Internal Summary");
		Assert.assertTrue(actualResult3);
		
		boolean actualResult6 = cataloguePage.getCatalogueOfferCards().getText()
				.contains("Catalog Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOfferCards().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalog Offer ");
		
		System.out.println("New Tab URL - " + driver.getTitle());
		//Assert.assertTrue(driver.getTitle().contains("Education"));
		Thread.sleep(3000);
	}

	@Test(priority = 4, enabled=false)
	public void verifyEnergyCataloguePage() throws Throwable {

		/*
		 * cataloguePage.clickOncataloguePagesMenuButton(); Thread.sleep(3000);
		 * cataloguePage.clickIndustryMenuButton();
		 */
		Thread.sleep(2000);
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
		
		cataloguePage.clickOnDownloadSectionCloseButton();
		Thread.sleep(2000);

		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Energy"));
		Thread.sleep(3000);
	}

	@Test(priority = 5)
	public void verifyFinancialServicesOnCataloguePage() throws Throwable {

		/*
		 * cataloguePage.clickOncataloguePagesMenuButton(); Thread.sleep(3000);
		 * cataloguePage.clickIndustryMenuButton();
		 */
		Thread.sleep(2000);
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
		
		homePage.clickOnCustomerEvidenceSearchButton();
		Thread.sleep(5000);
		Set<String> allTabs1 = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs1.remove(mainTab);
		String newTab1 = allTabs1.iterator().next();
		driver.switchTo().window(newTab1);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		System.out.println("New Tab URL - " + driver.getCurrentUrl());
		boolean actualResult2 = driver.getCurrentUrl().contains("Financial%20Services");
		Assert.assertTrue(actualResult2);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Financial Services"));
		driver.close();
		driver.switchTo().window(mainTab);
		
		homePage.clickOnAISummaryButton();
		cataloguePage.AISumLabelwaitForElementToBeVisible();
		boolean actualResult3 = cataloguePage.getCatalogAIintraininglabel().getText().contains("Catalog AI in training");
		System.out.println("Displayed AI Generated Internal Summary");
		Assert.assertTrue(actualResult3);

		boolean actualResult6 = cataloguePage.getCatalogueOfferCards().getText()
				.contains("Catalog Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOfferCards().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
		
		System.out.println("New Tab URL - " + driver.getTitle());
		//Assert.assertTrue(driver.getTitle().contains("Financial Services"));
		Thread.sleep(3000);
	}
	
	@Test(priority = 6)
	public void verifyGovernmentOnCataloguePage() throws Throwable {

		/*
		 * cataloguePage.clickOncataloguePagesMenuButton(); Thread.sleep(3000);
		 * cataloguePage.clickIndustryMenuButton();
		 */
		Thread.sleep(2000);
		cataloguePage.clickOnGovernmentMenuButton();
		
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
		
		Thread.sleep(4000);
		
		homePage.clickOnCustomerEvidenceSearchButton();
		Thread.sleep(5000);
		Set<String> allTabs1 = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs1.remove(mainTab);
		String newTab1 = allTabs1.iterator().next();
		driver.switchTo().window(newTab1);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		System.out.println("New Tab URL - " + driver.getCurrentUrl());
		boolean actualResult2 = driver.getCurrentUrl().contains("Government");
		Assert.assertTrue(actualResult2);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Government"));
		driver.close();
		driver.switchTo().window(mainTab);
		
		homePage.clickOnAISummaryButton();
		cataloguePage.AISumLabelwaitForElementToBeVisible();
		boolean actualResult3 = cataloguePage.getCatalogAIintraininglabel().getText().contains("Catalog AI in training");
		System.out.println("Displayed AI Generated Internal Summary");
		Assert.assertTrue(actualResult3);
		
		Thread.sleep(2000);
		boolean actualResult6 = cataloguePage.getCatalogueOfferCards().getText()
				.contains("Catalog Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOfferCards().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
		
		Thread.sleep(2000);
	}
	

	@Test(priority = 7)
	public void verifyHealthcareOnCataloguePage() throws Throwable {

		/*
		 * cataloguePage.clickOncataloguePagesMenuButton(); Thread.sleep(3000);
		 * cataloguePage.clickIndustryMenuButton();
		 */
		Thread.sleep(2000);
		cataloguePage.clickOnHealthcareMenuButton();
		Thread.sleep(10000);
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
		
		Thread.sleep(2000);
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
		
		Thread.sleep(3000);
		
		homePage.clickOnCustomerEvidenceSearchButton();
		Thread.sleep(5000);
		Set<String> allTabs1 = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs1.remove(mainTab);
		String newTab1 = allTabs1.iterator().next();
		driver.switchTo().window(newTab1);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		System.out.println("New Tab URL - " + driver.getCurrentUrl());
		boolean actualResult2 = driver.getCurrentUrl().contains("Healthcare");
		Assert.assertTrue(actualResult2);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Healthcare"));
		driver.close();
		driver.switchTo().window(mainTab);
		
		homePage.clickOnAISummaryButton();
		cataloguePage.AISumLabelwaitForElementToBeVisible();
		boolean actualResult3 = cataloguePage.getCatalogAIintraininglabel().getText().contains("Catalog AI in training");
		System.out.println("Displayed AI Generated Internal Summary");
		Assert.assertTrue(actualResult3);
		
		Thread.sleep(2000);
		boolean actualResult6 = cataloguePage.getCatalogueOfferCards().getText()
				.contains("Catalog Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOfferCards().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
		
		Thread.sleep(3000);
	}

	@Test(priority = 8)
	public void verifyIndustrialsandManufacturingOnCataloguePage() throws Throwable {

		/*
		 * cataloguePage.clickOncataloguePagesMenuButton(); Thread.sleep(3000);
		 * cataloguePage.clickIndustryMenuButton();
		 */
		Thread.sleep(2000);
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
	
		Thread.sleep(2000);
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
		
		Thread.sleep(3000);
		
		/*homePage.clickOnCustomerEvidenceSearchButton();
		Thread.sleep(5000);
		Set<String> allTabs1 = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs1.remove(mainTab);
		String newTab1 = allTabs1.iterator().next();
		driver.switchTo().window(newTab1);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		System.out.println("New Tab URL - " + driver.getCurrentUrl());
		boolean actualResult2 = driver.getCurrentUrl().contains("Industrials%20and%20Manufacturing");
		Assert.assertTrue(actualResult2);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Industrials and Manufacturing"));
		driver.close();
		driver.switchTo().window(mainTab);*/
		
		
		
		
			
		homePage.clickOnAISummaryButton();
		cataloguePage.AISumLabelwaitForElementToBeVisible();
		boolean actualResult3 = cataloguePage.getCatalogAIintraininglabel().getText().contains("Catalog AI in training");
		System.out.println("Displayed AI Generated Internal Summary");
		Assert.assertTrue(actualResult3);
		Thread.sleep(3000);
		
		Thread.sleep(2000);
		boolean actualResult6 = cataloguePage.getCatalogueOfferCards().getText()
				.contains("Artifact");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOfferCards().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
	}
	
	@Test(priority = 9)
	public void verifyMobilityOnCataloguePage() throws Throwable {

		/*
		 * cataloguePage.clickOncataloguePagesMenuButton(); Thread.sleep(3000);
		 * cataloguePage.clickIndustryMenuButton(); Thread.sleep(3000);
		 */
		cataloguePage.clickOnAutomotiveMobilityandTransportationMenuButton();
		
	
		Thread.sleep(4000);
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
		
		/*homePage.clickOnCustomerEvidenceSearchButton();
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
		boolean actualResult2 = driver.getCurrentUrl().contains("Mobility");
		Assert.assertTrue(actualResult2);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Mobility"));
		driver.close();
		driver.switchTo().window(mainTab);*/
		
		homePage.clickOnAISummaryButton();
		cataloguePage.AISumLabelwaitForElementToBeVisible();
		boolean actualResult3 = cataloguePage.getCatalogAIintraininglabel().getText().contains("Catalog AI in training");
		System.out.println("Displayed AI Generated Internal Summary");
		Assert.assertTrue(actualResult3);		
		
		boolean actualResult6 = cataloguePage.getCatalogueOfferCards().getText()
				.contains("Catalog Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOfferCards().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");	
		

		System.out.println("New Tab URL - " + driver.getTitle());
		//Assert.assertTrue(driver.getTitle().contains("Mobility"));
		Thread.sleep(3000);

	}
	
	@Test(priority = 10)
	public void verifyRetailandConsumerGoodsOnCataloguePage() throws Throwable {

		/*
		 * cataloguePage.clickOncataloguePagesMenuButton(); Thread.sleep(3000);
		 * cataloguePage.clickIndustryMenuButton();
		 */
		Thread.sleep(2000);
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

		Thread.sleep(4000);
		
		/*homePage.clickOnCustomerEvidenceSearchButton();
		Thread.sleep(5000);
		Set<String> allTabs1 = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs1.remove(mainTab);
		String newTab1 = allTabs1.iterator().next();
		driver.switchTo().window(newTab1);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		System.out.println("New Tab URL - " + driver.getCurrentUrl());
		boolean actualResult2 = driver.getCurrentUrl().contains("Retail%20and%20Consumer%20Goods");
		Assert.assertTrue(actualResult2);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Retail and Consumer Goods"));
		driver.close();
		driver.switchTo().window(mainTab);*/
		
		
		homePage.clickOnAISummaryButton();
		cataloguePage.AISumLabelwaitForElementToBeVisible();
		boolean actualResult3 = cataloguePage.getCatalogAIintraininglabel().getText().contains("Catalog AI in training");
		System.out.println("Displayed AI Generated Internal Summary");
		Assert.assertTrue(actualResult3);
		Thread.sleep(3000);
		
		Thread.sleep(2000);
		boolean actualResult6 = cataloguePage.getCatalogueOfferCards().getText()
				.contains("Catalog Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOfferCards().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
	}

	@Test(priority = 11)
	public void verifySustainabilityOnCataloguePage() throws Throwable {

		/*
		 * cataloguePage.clickOncataloguePagesMenuButton(); Thread.sleep(3000);
		 * cataloguePage.clickIndustryMenuButton();
		 */
		Thread.sleep(2000);
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
		
		Thread.sleep(4000);
		
		/*homePage.clickOnCustomerEvidenceSearchButton();
		Thread.sleep(5000);
		Set<String> allTabs1 = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs1.remove(mainTab);
		String newTab1 = allTabs1.iterator().next();
		driver.switchTo().window(newTab1);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		System.out.println("New Tab URL - " + driver.getCurrentUrl());
		boolean actualResult2 = driver.getCurrentUrl().contains("Sustainability");
		Assert.assertTrue(actualResult2);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Sustainability"));
		driver.close();
		driver.switchTo().window(mainTab);*/
		
		
		homePage.clickOnAISummaryButton();
		cataloguePage.AISumLabelwaitForElementToBeVisible();
		boolean actualResult3 = cataloguePage.getCatalogAIintraininglabel().getText().contains("Catalog AI in training");
		System.out.println("Displayed AI Generated Internal Summary");
		Assert.assertTrue(actualResult3);
		Thread.sleep(5000);
		
		Thread.sleep(2000);
		boolean actualResult6 = cataloguePage.getCatalogueOfferCards().getText()
				.contains("Catalog Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOfferCards().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
		
	}

	@Test(priority = 12)
	public void verifyTelecommunicationsandMediaOnCataloguePage() throws Throwable {

		/*
		 * cataloguePage.clickOncataloguePagesMenuButton(); Thread.sleep(3000);
		 * cataloguePage.clickIndustryMenuButton();
		 */
		Thread.sleep(2000);
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
	
		Thread.sleep(4000);
		
		/*homePage.clickOnCustomerEvidenceSearchButton();
		Thread.sleep(5000);
		Set<String> allTabs1 = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs1.remove(mainTab);
		String newTab1 = allTabs1.iterator().next();
		driver.switchTo().window(newTab1);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		System.out.println("New Tab URL - " + driver.getCurrentUrl());
		boolean actualResult2 = driver.getCurrentUrl().contains("Telecommunications%20and%20Media");
		Assert.assertTrue(actualResult2);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Telecommunications and Media"));
		driver.close();
		driver.switchTo().window(mainTab);*/
		
	
		
		
		homePage.clickOnAISummaryButton();
		cataloguePage.AISumLabelwaitForElementToBeVisible();
		boolean actualResult3 = cataloguePage.getCatalogAIintraininglabel().getText().contains("Catalog AI in training");
		System.out.println("Displayed AI Generated Internal Summary");
		Assert.assertTrue(actualResult3);
		
		Thread.sleep(2000);
		boolean actualResult6 = cataloguePage.getCatalogueOfferCards().getText()
				.contains("Artifact");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOfferCards().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
		
	}
	
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}