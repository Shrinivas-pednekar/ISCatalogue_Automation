
package portfolio_test.user;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
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
		Thread.sleep(5000);
		
		cataloguePage.clickOnReadfulldescriptionButton();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Adoption, Change, and Services Management Description"));
		driver.close();
		driver.switchTo().window(mainTab);
		
		// boolean isTrue ;
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(2000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(2000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(5000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(5000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(3000); cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(5000);
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
		String mainTab1 = driver.getWindowHandle();
		allTabs1.remove(mainTab1);
		String newTab1 = allTabs1.iterator().next();
		driver.switchTo().window(newTab1);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		System.out.println("New Tab URL - " + driver.getCurrentUrl());
		boolean actualResult2 = driver.getCurrentUrl().contains("Adoption%2C%20Change%2C%20and%20Services%20Management");
		Assert.assertTrue(actualResult2);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Adoption, Change, and Services Management"));
		driver.close();
		driver.switchTo().window(mainTab1);
		
		homePage.clickOnAISummaryButton();
		cataloguePage.AISumLabelwaitForElementToBeVisible();
		boolean actualResult3 = cataloguePage.getCatalogAIintraininglabel().getText().contains("Catalog AI in training");
		System.out.println("Displayed AI Generated Internal Summary");
		Assert.assertTrue(actualResult3);
		
		Thread.sleep(2000);
		boolean actualResult5 = cataloguePage.getCatalogueOfferCards().getText()
				.contains("Catalog Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOfferCards().getText());
		Assert.assertTrue(actualResult5);
		System.out.println("Displayed Catalogue Offer ");

		
	
	/*	cataloguePage.clickArtefactButton();
		//cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		Thread.sleep(6000);
		boolean actualResult6 = cataloguePage.getArtifactTabName().getText()
				.contains("Catalogue Artifact");
		//System.out.println("Artifact displaed as expected =" + cataloguePage.getArtifactTabName().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Artifact ");
	*/
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
		
		cataloguePage.clickOnReadfulldescriptionButton();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("Read full description Page working as expected  - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Business Apps Description"));
		driver.close();
		driver.switchTo().window(mainTab);
		
		
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
				Thread.sleep(3000);
				cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				System.out.println("clickOnUnsubscribeButton -Else");
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
			Thread.sleep(3000);
			System.out.println("clickOnUnsubscribeButton -Catch");
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
		String mainTab1 = driver.getWindowHandle();
		allTabs1.remove(mainTab1);
		String newTab1 = allTabs1.iterator().next();
		driver.switchTo().window(newTab1);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		System.out.println("New Tab URL - " + driver.getCurrentUrl());
		boolean actualResult2 = driver.getCurrentUrl().contains("Business%20Apps");
		Assert.assertTrue(actualResult2);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Business Apps"));
		driver.close();
		driver.switchTo().window(mainTab1);
		
		homePage.clickOnAISummaryButton();
		cataloguePage.AISumLabelwaitForElementToBeVisible();
		boolean actualResult3 = cataloguePage.getCatalogAIintraininglabel().getText().contains("Catalog AI in training");
		System.out.println("Displayed AI Generated Internal Summary");
		Assert.assertTrue(actualResult3);
		
		/*boolean actualResult5 = cataloguePage.getSolutionPlay().getText()
				.contains("Solution Play");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getSolutionPlay().getText());
		Assert.assertTrue(actualResult5);
		System.out.println("Displayed Solution Play ");*/
		
		//cataloguePage.clickCatalogueOfferButton();
		//Thread.sleep(5000);
		boolean actualResult6 = cataloguePage.getCatalogueOfferCards().getText()
				.contains("Catalog Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOfferCards().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");

		
	
	/*	cataloguePage.clickArtefactButton();
		//cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		Thread.sleep(5000);
		boolean actualResult7 = cataloguePage.getArtifactTabName().getText()
				.contains("Catalogue Artifact");
		//System.out.println("Artifact displaed as expected =" + cataloguePage.getArtifactTabName().getText());
		Assert.assertTrue(actualResult7);
		System.out.println("Displayed Artifact ");	*/
			
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Business Apps"));
		Thread.sleep(3000);
	}

	

	@Test(priority = 5)
	public void verifyDigitalandApplicationInnovationOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnDigitalandApplicationInnovationMenuButton();
		
		cataloguePage.clickOnReadfulldescriptionButton();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Digital and Application Innovation Description"));
		driver.close();
		driver.switchTo().window(mainTab);
		
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
		String mainTab1 = driver.getWindowHandle();
		allTabs1.remove(mainTab1);
		String newTab1 = allTabs1.iterator().next();
		driver.switchTo().window(newTab1);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		System.out.println("New Tab URL - " + driver.getCurrentUrl());
		boolean actualResult2 = driver.getCurrentUrl().contains("Digital%20and%20Application%20Innovation");
		Assert.assertTrue(actualResult2);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Digital and Application Innovation"));
		driver.close();
		driver.switchTo().window(mainTab1);
		
		homePage.clickOnAISummaryButton();
		cataloguePage.AISumLabelwaitForElementToBeVisible();
		boolean actualResult3 = cataloguePage.getCatalogAIintraininglabel().getText().contains("Catalog AI in training");
		System.out.println("Displayed AI Generated Internal Summary");
		Assert.assertTrue(actualResult3);
		
		Thread.sleep(5000);
		boolean actualResult6 = cataloguePage.getCatalogueOfferCards().getText()
				.contains("Catalog Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
	
		//cataloguePage.clickBOMButton();
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
		
		cataloguePage.clickOnReadfulldescriptionButton();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Data and AI Description"));
		driver.close();
		driver.switchTo().window(mainTab);
		
		Thread.sleep(9000);

		try {
			if (cataloguePage.getDataAISubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnDataAISubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(7000);
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
		String mainTab1 = driver.getWindowHandle();
		allTabs1.remove(mainTab1);
		String newTab1 = allTabs1.iterator().next();
		driver.switchTo().window(newTab1);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		System.out.println("New Tab URL - " + driver.getCurrentUrl());
		boolean actualResult2 = driver.getCurrentUrl().contains("Data%20and%20AI");
		Assert.assertTrue(actualResult2);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Data and AI"));
		driver.close();
		driver.switchTo().window(mainTab1);
		
		homePage.clickOnAISummaryButton();
		cataloguePage.AISumLabelwaitForElementToBeVisible();
		boolean actualResult3 = cataloguePage.getCatalogAIintraininglabel().getText().contains("Catalog AI in training");
		System.out.println("Displayed AI Generated Internal Summary");
		Assert.assertTrue(actualResult3);
		
		//cataloguePage.clickCatalogueOfferButton();
		Thread.sleep(5000);
		boolean actualResult6 = cataloguePage.getCatalogueOfferCards().getText()
				.contains("Catalog Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
	
		//cataloguePage.clickBOMButton();
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
		
		cataloguePage.clickOnReadfulldescriptionButton();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Infrastructure Description"));
		driver.close();
		driver.switchTo().window(mainTab);
		
		Thread.sleep(8000);
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
		String mainTab1 = driver.getWindowHandle();
		allTabs1.remove(mainTab1);
		String newTab1 = allTabs1.iterator().next();
		driver.switchTo().window(newTab1);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		System.out.println("New Tab URL - " + driver.getCurrentUrl());
		boolean actualResult2 = driver.getCurrentUrl().contains("Infrastructure");
		Assert.assertTrue(actualResult2);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Infrastructure"));
		driver.close();
		driver.switchTo().window(mainTab1);
		
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
		Assert.assertTrue(driver.getTitle().contains("Infrastructure"));
		Thread.sleep(3000);
	}

	@Test(priority = 8)
	public void verifyModernWorkOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(2000);
		cataloguePage.clickOnModernWorkMenuButton();
		
		cataloguePage.clickOnReadfulldescriptionButton();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Modern Work Description"));
		driver.close();
		driver.switchTo().window(mainTab);
	
		Thread.sleep(5000);
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
		String mainTab1 = driver.getWindowHandle();
		allTabs1.remove(mainTab1);
		String newTab1 = allTabs1.iterator().next();
		driver.switchTo().window(newTab1);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		System.out.println("New Tab URL - " + driver.getCurrentUrl());
		boolean actualResult2 = driver.getCurrentUrl().contains("Modern%20Work");
		Assert.assertTrue(actualResult2);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Modern Work"));
		driver.close();
		driver.switchTo().window(mainTab1);
		
		homePage.clickOnAISummaryButton();
		cataloguePage.AISumLabelwaitForElementToBeVisible();
		boolean actualResult3 = cataloguePage.getCatalogAIintraininglabel().getText().contains("Catalog AI in training");
		System.out.println("Displayed AI Generated Internal Summary");
		Assert.assertTrue(actualResult3);
		
		Thread.sleep(5000);
		boolean actualResult6 = cataloguePage.getCatalogueOfferCards().getText()
				.contains("Catalog Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
		
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Modern Work"));
		Thread.sleep(3000);
	}

	@Test(priority = 9, enabled=false)
	public void verifySecurityOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnSecurityMenuButton();
		
		cataloguePage.clickOnReadfulldescriptionButton();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Security Description"));
		driver.close();
		driver.switchTo().window(mainTab);
		
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
		String mainTab1 = driver.getWindowHandle();
		allTabs1.remove(mainTab1);
		String newTab1 = allTabs1.iterator().next();
		driver.switchTo().window(newTab1);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		System.out.println("New Tab URL - " + driver.getCurrentUrl());
		boolean actualResult2 = driver.getCurrentUrl().contains("Security");
		Assert.assertTrue(actualResult2);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Security"));
		driver.close();
		driver.switchTo().window(mainTab1);
		
		homePage.clickOnAISummaryButton();
		cataloguePage.AISumLabelwaitForElementToBeVisible();
		boolean actualResult3 = cataloguePage.getCatalogAIintraininglabel().getText().contains("Catalog AI in training");
		System.out.println("Displayed AI Generated Internal Summary");
		Assert.assertTrue(actualResult3);
		
		Thread.sleep(5000);
		boolean actualResult6 = cataloguePage.getCatalogueOfferCards().getText()
				.contains("Catalog Offer");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
		
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


	// -------------------------------Customer Focus Page------------------------------------
	@Test(priority = 22)
	public void verifyDigitalEnablementandOperationsOnSolutionPage() throws Throwable {
		
		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnDigitalEnablementandOperationsMenuButton();
		Thread.sleep(3000);
		// boolean isTrue ;
		boolean actualResult5 = cataloguePage.getCatalogueOfferDEO().getText()
				.contains("Catalog Offer");
		///System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult5);
		System.out.println("Displayed Catalogue Offer ");
	
		/*cataloguePage.clickArtefactButton();
		//cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		Thread.sleep(6000);
		boolean actualResult6 = cataloguePage.getArtifactTabName().getText()
				.contains("Artifact");
	    System.out.println("Artifact displaed as expected =" + cataloguePage.getArtifactTabName().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Artifact ");*/
	
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Digital Enablement and Operations"));
		System.out.println("Digital Enablement and Operations is loaded sucessfully ");
	
	}
	
	@Test(priority = 23)
	public void verifyIndustrySolutionsDeliveryHomeOnSolutionPage() throws Throwable {
		
		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnIndustrySolutionsDeliveryHomeMenuButton();
		Thread.sleep(3000);
		// boolean isTrue ;
			
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Industry Solutions Delivery Home"));
		System.out.println("Industry Solutions Delivery Home is loaded sucessfully ");
	}
	
	@Test(priority = 23)
	public void verifyMicrosoftUnifiedHomeOnSolutionPage() throws Throwable {
		
		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnUnifiedMenuButton();
		Thread.sleep(3000);
		// boolean isTrue ;
			
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Microsoft Unified Home"));
		System.out.println("Microsoft Unified Home is loaded sucessfully ");
	}
	
	@Test(priority = 24)
	public void verifyCatalogueOffer() throws Throwable {
		
		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnDigitalEnablementandOperationsMenuButton();
		Thread.sleep(3000);
		// boolean isTrue ;
		boolean actualResult5 = cataloguePage.getCatalogueOfferDEO().getText()
				.contains("Catalog Offer");
		///System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult5);
		System.out.println("Displayed Catalogue Offer ");
	
	/*	cataloguePage.clickArtefactButton();
		//cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		Thread.sleep(6000);
		boolean actualResult6 = cataloguePage.getArtifactTabName().getText()
				.contains("Catalogue Artifact");
	//	System.out.println("Artifact displaed as expected =" + cataloguePage.getArtifactTabName().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Artifact ");*/
	
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