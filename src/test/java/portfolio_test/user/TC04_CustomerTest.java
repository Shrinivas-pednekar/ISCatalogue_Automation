
package portfolio_test.user;

import java.io.IOException;
import java.util.Set;

import javax.swing.text.Utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import pageObjects.CataloguePage;
import pageObjects.CustomerEvidencePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ResourcesPage;
import resources.TestBase;

public class TC04_CustomerTest extends TestBase {
	public WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	// CataloguePage cataloguePage;
	CustomerEvidencePage customerEvidencePage;
	ResourcesPage resourcesPage;

	Utilities util;
	public static Logger log = LogManager.getLogger(TestBase.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");
		
		util = new Utilities();
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		// cataloguePage = new CataloguePage(driver);
		resourcesPage = new ResourcesPage(driver);
		customerEvidencePage = new CustomerEvidencePage(driver);
		driver.get(prop.getProperty("produrl"));
		//loginPage.clickOnUserButtonJit();
		

	}

	@Test(priority = 1)
	public void verifyCustomerEvidenceHomePageOnCustomerEvidence() throws Throwable {
	    // Click on customer menu button to open a new tab
	    customerEvidencePage.clickOncustomerMenuButton();
	    customerEvidencePage.clickOncustomerEvidenceHomeMenuButton();

	    // Get the handles of all open tabs/windows
	    Set<String> allTabs = driver.getWindowHandles();

	    // Identify the main tab (the one that was originally active)
	    String mainTab = driver.getWindowHandle();

	    // Close the main tab
	    allTabs.remove(mainTab); // Remove it from the list
	    driver.close();

	    // Switch to the new tab
	    String newTab = allTabs.iterator().next();
	    driver.switchTo().window(newTab);

	    // Now perform your verifications on the new tab
	    System.out.println("New Tab URL - " + driver.getCurrentUrl());
	    Assert.assertTrue(driver.getTitle().contains("Customer Evidence Home"));
	}

	@Test(priority = 2)
	public void verifyCustomerEvidanceSearchFunctionOnCustomerEvidence() throws Throwable {

		customerEvidencePage.enterStoryDetails("TATA");
		Thread.sleep(3000);
		customerEvidencePage.clickOncustomerEvidenceSearchButton();
		Assert.assertTrue(driver.getTitle().contains("Customer Evidence Search"));
		Thread.sleep(5000);
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult);
		
	}
	
	// -----------------------------------Solution Areas Stories--------------------------

	@Test(priority = 3)
	public void verifyBusinessAppsCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		customerEvidencePage.clickOnSolutionAreaStoriesButton();
		customerEvidencePage.clickOnBusinessAppsCustomerStoriesSearchButton(); //
		Thread.sleep(3000);
		boolean actualResult = customerEvidencePage.getBusinessAppsCustomerStoriesTitle().getText()
				.contains("Business Apps Customer Stories");
		System.out.println("Actual Result - " + actualResult);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		Assert.assertTrue(driver.getCurrentUrl().contains("Business%20Apps"));

		
	}

	@Test(priority = 4)
	public void verifyDataAICustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		//customerEvidencePage.clickOnSolutionAreaStoriesButton();
		customerEvidencePage.clickOnDataAICustomerStoriesSearchButton();
		Thread.sleep(3000);
		boolean actualResult = customerEvidencePage.getDataAICustomerStoriesTitle().getText()
				.contains("Data and AI Customer Stories");
		System.out.println("Actual Result - " + actualResult);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		Assert.assertTrue(driver.getCurrentUrl().contains("Data%20and%20AI"));

		
	}

	@Test(priority = 5)
	public void verifyDigitalandApplicationInnovationCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		//customerEvidencePage.clickOnSolutionAreaStoriesButton();
		customerEvidencePage.clickOnDigitalandApplicationInnovationCustomerStoriesSearchButton();
		Thread.sleep(3000);
		boolean actualResult = customerEvidencePage.getDigitalandApplicationInnovationCustomerStoriesTitle().getText()
				.contains("Digital and Application Innovation Customer Stories");
		System.out.println("Actual Result - " + actualResult);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		Assert.assertTrue(driver.getCurrentUrl().contains("Digital%20and%20Application"));

		
	}

	@Test(priority = 6)
	public void verifyInfrastructureCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		//customerEvidencePage.clickOnSolutionAreaStoriesButton();
		customerEvidencePage.clickOnInfrastructureCustomerStoriesSearchButton();
		Thread.sleep(3000);
		boolean actualResult = customerEvidencePage.getInfrastructureCustomerStoriesTitle().getText()
				.contains("Infrastructure Customer Stories");
		System.out.println("Actual Result - " + actualResult);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		Assert.assertTrue(driver.getCurrentUrl().contains("Infrastructure"));

		
	}

	@Test(priority = 7)
	public void verifyModernWorkCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		//customerEvidencePage.clickOnSolutionAreaStoriesButton();
		customerEvidencePage.clickModernWorkCustomerStoriesSearchButton(); //
		Thread.sleep(3000);
		boolean actualResult = customerEvidencePage.getModernWorkCustomerStoriesTitle().getText()
				.contains("Modern Work Customer Stories");
		System.out.println("Actual Result - " + actualResult);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		Assert.assertTrue(driver.getCurrentUrl().contains("Modern%20Work"));

		
	}

	@Test(priority = 8)
	public void verifySecurityCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		//customerEvidencePage.clickOnSolutionAreaStoriesButton(); //
		Thread.sleep(5000);
		customerEvidencePage.clickSecurityCustomerStoriesSearchButton(); //
		Thread.sleep(5000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Security"));
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		Assert.assertTrue(driver.getCurrentUrl().contains("Security"));

		
	}
	
	@Test(priority = 9)
	public void verifyUnifiedCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		//customerEvidencePage.clickOnSolutionAreaStoriesButton(); //
		Thread.sleep(5000);
		customerEvidencePage.clickUnifiedCustomerStoriesSearchButton(); //
		Thread.sleep(5000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Customer Evidence Search"));
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		Assert.assertTrue(driver.getCurrentUrl().contains("Unified"));

		
	}
	
//--------------------------Industies Stories-------------------------------------


	@Test(priority = 10)
	public void verifyCrossIndustryCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		customerEvidencePage.clickOnIndustriesStoriesButton();
		customerEvidencePage.clickOnCrossIndustryCustomerStoriesSearchButton();
		Thread.sleep(3000);
		boolean actualResult = customerEvidencePage.getCrossIndustryCustomerStoriesTitle().getText()
				.contains("Cross-Industry Customer Stories");
		System.out.println("Actual Result - " + actualResult);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult2 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult2);
		Assert.assertTrue(driver.getCurrentUrl().contains("Cross-Industry"));
		
	}
	
	@Test(priority = 11)
	public void verifyDefenseandIntelligenceCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		customerEvidencePage.clickOnIndustriesStoriesButton();
		customerEvidencePage.clickOnDefenseandIntelligenceCustomerStoriesSearchButton();
		Thread.sleep(3000);
		boolean actualResult = customerEvidencePage.getDefenseandIntelligenceCustomerStoriesTitle().getText()
				.contains("Defense and Intelligence Customer Stories");
		System.out.println("Actual Result - " + actualResult);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult); // Thread.sleep(5000);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		Assert.assertTrue(driver.getCurrentUrl().contains("Defense%20and%20Intelligence"));
		
	}

	@Test(priority = 12)
	public void verifyEducationCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		customerEvidencePage.clickOnIndustriesStoriesButton();
		customerEvidencePage.clickOnEducationCustomerStoriesSearchButton();
		Thread.sleep(3000);
		boolean actualResult = customerEvidencePage.getEducationCustomerStoriesTitle().getText()
				.contains("Education Customer Stories");
		System.out.println("Actual Result - " + actualResult);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		Assert.assertTrue(driver.getCurrentUrl().contains("Education"));
		
	}

	@Test(priority = 13)
	public void verifyEnergyCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		customerEvidencePage.clickOnIndustriesStoriesButton();
		customerEvidencePage.clickOnEnergyandResourcesCustomerStoriesSearchButton();
		Thread.sleep(3000);
		boolean actualResult = customerEvidencePage.getEnergyandResourcesCustomerStoriesTitle().getText()
				.contains("Energy Customer Stories");
		System.out.println("Actual Result - " + actualResult);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		Assert.assertTrue(driver.getCurrentUrl().contains("Energy"));
		
	}

	@Test(priority = 14)
	public void verifyFinancialServicesCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		customerEvidencePage.clickOnIndustriesStoriesButton();
		customerEvidencePage.clickOnFinancialServicesCustomerStoriesSearchButton();
		Thread.sleep(3000);
		boolean actualResult = customerEvidencePage.getFinancialServicesCustomerStoriesTitle().getText()
				.contains("Financial Services Customer Stories");
		System.out.println("Actual Result - " + actualResult);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		Assert.assertTrue(driver.getCurrentUrl().contains("Financial%20Services"));
		
	}

	@Test(priority = 15)
	public void verifyGovernmentCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		customerEvidencePage.clickOnIndustriesStoriesButton();
		customerEvidencePage.clickOnGovernmentCustomerStoriesSearchButton();
		Thread.sleep(3000);
		boolean actualResult = customerEvidencePage.getGovernmentCustomerStoriesTitle().getText()
				.contains("Government Customer Stories");
		System.out.println("Actual Result - " + actualResult);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		Assert.assertTrue(driver.getCurrentUrl().contains("Government"));
		
	}

	@Test(priority = 16)
	public void verifyHealthcareCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		customerEvidencePage.clickOnIndustriesStoriesButton();
		customerEvidencePage.clickOnHealthcareCustomerStoriesSearchButton();
		Thread.sleep(3000);
		boolean actualResult = customerEvidencePage.getHealthcareCustomerStoriesTitle().getText()
				.contains("Healthcare Customer Stories");
		System.out.println("Actual Result - " + actualResult);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		Assert.assertTrue(driver.getCurrentUrl().contains("Healthcare"));
		
	}
	
	@Test(priority = 17)
	public void verifyIndustrialandManufacturingCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {
			driver.navigate().back();
		driver.navigate().back();
		customerEvidencePage.clickOnIndustriesStoriesButton();
		customerEvidencePage.clickOnIndustrialandManufacturingCustomerStoriesSearchButton();
		Thread.sleep(3000);
		boolean actualResult = customerEvidencePage.getIndustrialandManufacturingCustomerStoriesTitle().getText()
				.contains("Industrials and Manufacturing Customer Stories");
		System.out.println("Actual Result - " + actualResult);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		Assert.assertTrue(driver.getCurrentUrl().contains("Industrials%20and%20Manufacturing"));
		
	}
	
	@Test(priority = 18)
	public void verifyMobilityCustomerStoriesSearchButtonOnCustomerEvidence()
			throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		customerEvidencePage.clickOnIndustriesStoriesButton();
		customerEvidencePage.clickOnAutomotiveMobilityandTransportationCustomerStoriesSearchButton();
		Thread.sleep(3000);
		boolean actualResult = customerEvidencePage.getAutomotiveMobilityandTransportationCustomerStoriesTitle()
				.getText().contains("Mobility Customer Stories");
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult2 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult2);
		Assert.assertTrue(driver.getCurrentUrl().contains("Mobility"));
	}
	
	@Test(priority = 19)
	public void verifyRetailandConsumerGoodsCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		customerEvidencePage.clickOnIndustriesStoriesButton();
		customerEvidencePage.clickOnRetailandConsumerGoodsCustomerStoriesSearchButton();
		Thread.sleep(3000);
		boolean actualResult = customerEvidencePage.getRetailandConsumerGoodsCustomerStoriesTitle().getText()
				.contains("Retail and Consumer Goods Customer Stories");
		System.out.println("Actual Result - " + actualResult);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		Assert.assertTrue(driver.getCurrentUrl().contains("Retail%20and%20Consumer%20Goods"));
		
	}

	@Test(priority = 20)
	public void verifySustainabilityCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		customerEvidencePage.clickOnIndustriesStoriesButton();
		customerEvidencePage.clickOnSustainabilityCustomerStoriesSearchButton();
		Thread.sleep(3000);
		boolean actualResult = customerEvidencePage.getSustainabilityCustomerStoriesTitle().getText()
				.contains("Sustainability Customer Stories");
		System.out.println("Actual Result - " + actualResult);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		Assert.assertTrue(driver.getCurrentUrl().contains("Sustainability"));
		
	}

	@Test(priority = 21)
	public void verifyTelecommunicationsandMediaCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		customerEvidencePage.clickOnIndustriesStoriesButton();
		customerEvidencePage.clickOnTelecommunicationsandMediaCustomerStoriesSearchButton();
		Thread.sleep(3000);
		boolean actualResult = customerEvidencePage.getTelecommunicationsandMediaCustomerStoriesTitle().getText()
				.contains("Telecommunications and Media Customer Stories");
		System.out.println("Actual Result - " + actualResult);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		Assert.assertTrue(driver.getCurrentUrl().contains("Telecommunications%20and%20Media"));
		
	}
	
//--------------------------------------Geography--------------------------------------------------------------------
	@Test(priority = 22)
	public void verifyAmericasCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		customerEvidencePage.clickOnGeographyStoriesButton(); //
		Thread.sleep(5000);
		customerEvidencePage.clickAmericasCustomerStoriesSearchButton(); //
		Thread.sleep(5000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Customer Evidence Search"));
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		Assert.assertTrue(driver.getCurrentUrl().contains("Geography=Americas"));	
	}
	
	@Test(priority = 23)
	public void verifyAPJCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		customerEvidencePage.clickOnGeographyStoriesButton(); //
		Thread.sleep(5000);
		customerEvidencePage.clickAPJCustomerStoriesSearchButton(); //
		Thread.sleep(5000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Customer Evidence Search"));
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		Assert.assertTrue(driver.getCurrentUrl().contains("Geography=APJ"));	
	}
	
	@Test(priority = 24)
	public void verifyEMEACustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		customerEvidencePage.clickOnGeographyStoriesButton(); //
		Thread.sleep(5000);
		customerEvidencePage.clickEMEACustomerStoriesSearchButton(); //
		Thread.sleep(5000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Customer Evidence Search"));
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		Assert.assertTrue(driver.getCurrentUrl().contains("Geography=EMEA"));	
	}
	
	//----------------------------------Explore Win Wires----------------------------
	@Test(priority = 25)
	public void verifyBrowseallWinWiresButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		customerEvidencePage.clickOnWinWiresCustomerStoriesSearchButton(); //
		Thread.sleep(5000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Customer Evidence Search"));

		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		customerEvidencePage.clickOnStorytypeButton();
		boolean actualResult4 = customerEvidencePage.getWinWiresCheckboxButton().isSelected();
		System.out.println("Actual Result - " + actualResult4);
		Assert.assertTrue(actualResult4);
		Assert.assertTrue(driver.getCurrentUrl().contains("Win%20Wires|Win%20Analysis"));

		
	}

	//-------------------------------Explore Delivery Stories------------------
	@Test(priority = 26)
	public void verifyBrowseallDeliveryStoriesButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		customerEvidencePage.clickOnDeliveryStoriesCustomerStoriesSearchButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Customer Evidence Search"));
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		customerEvidencePage.clickOnStorytypeButton();
		boolean actualResult4 = customerEvidencePage.getDeliveryStoriesCheckbox().isSelected();
		System.out.println("Actual Result D - " + actualResult4);
		Assert.assertTrue(actualResult4);
		Assert.assertTrue(driver.getCurrentUrl().contains("Delivery%20Stories|Customer%20Testimonials"));		
	}
	
	//-------------------------------------------------Submit a New Story------------------------------
		@Test(priority = 27)
		public void verifysubmitNewISDStoryPageOnCustomerEvidence() throws Throwable {
			driver.navigate().back();
			driver.navigate().back();
			customerEvidencePage.clickOnsubmitNewStoryButton();
			Set<String> allTabs = homePage.getWindowHandles();
			String mainTab = driver.getWindowHandle();
			allTabs.remove(mainTab);
			String newTab = allTabs.iterator().next();
			driver.switchTo().window(newTab);
		//loginPage.clickOnUserButtonJit();
			Thread.sleep(12000);
			System.out.println("New Tab URL - " + driver.getTitle());

			Assert.assertTrue(driver.getTitle().contains("IS Customer Evidence Tool - Power Apps"));
			driver.close();
			driver.switchTo().window(mainTab);
			Thread.sleep(3000);
		}
		
		@Test(priority = 28)
		public void verifysubmitNewUnifiedCustomerTestimonialStoryPageOnCustomerEvidence() throws Throwable {
			driver.navigate().back();
			driver.navigate().back();
			customerEvidencePage.clickOnsubmitNewUCTStoryButton();
			Set<String> allTabs = homePage.getWindowHandles();
			String mainTab = driver.getWindowHandle();
			allTabs.remove(mainTab);
			String newTab = allTabs.iterator().next();
			driver.switchTo().window(newTab);
			//loginPage.clickOnUserButtonJit();
			//Thread.sleep(12000);
			customerEvidencePage.UnifiedCustomerStoriesLabelwaitForElementToBeVisible();
			System.out.println("New Tab URL - " + driver.getTitle());
			Assert.assertTrue(driver.getTitle().contains("Unified Customer Stories"));
			driver.close();
			driver.switchTo().window(mainTab);
			Thread.sleep(3000);
		}

		@Test(priority = 29)
		public void verifysubmitNewUnifiedWinStoryPageOnCustomerEvidence() throws Throwable {
			driver.navigate().back();
			driver.navigate().back();
			customerEvidencePage.clickOnsubmitNewUnifiedWinStoryButton();
			Set<String> allTabs = homePage.getWindowHandles();
			String mainTab = driver.getWindowHandle();
			allTabs.remove(mainTab);
			String newTab = allTabs.iterator().next();
			driver.switchTo().window(newTab);
			//loginPage.clickOnUserButtonJit();
			//Thread.sleep(12000);
			customerEvidencePage.UnifiedWinLabelwaitForElementToBeVisible();
			System.out.println("New Tab URL - " + driver.getTitle());
			Assert.assertTrue(driver.getTitle().contains("Microsoft Unified Customer Win Submission Form"));
			driver.close();
			driver.switchTo().window(mainTab);
			Thread.sleep(3000);
		}
		
		//--------------------------From Menu------------------------------------------
	@Test(priority = 30)
	public void verifyclickOncustomerEvidenceWinWiresMenuButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		customerEvidencePage.clickOncustomerMenuButton();
		customerEvidencePage.clickOncustomerEvidenceWinWiresMenuButton();
		// Thread.sleep(5000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Customer Evidence Search"));

		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		customerEvidencePage.clickOnStorytypeButton();
		boolean actualResult4 = customerEvidencePage.getWinWiresCheckboxButton().isSelected();
		System.out.println("Actual Result - " + actualResult4);
		Assert.assertTrue(actualResult4);
		Assert.assertTrue(driver.getCurrentUrl().contains("Win%20Wires"));
		
	}

	@Test(priority = 31)
	public void verifyCustomerEvidenceDeliveryStoriesMenuButtonOnCustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		customerEvidencePage.clickOncustomerMenuButton();
		customerEvidencePage.clickOncustomerEvidenceDeliveryStoriesMenuButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Customer Evidence Search"));
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		customerEvidencePage.clickOnStorytypeButton();
		boolean actualResult4 = customerEvidencePage.getDeliveryStoriesCheckbox().isSelected();
		System.out.println("Actual Result D - " + actualResult4);
		Assert.assertTrue(actualResult4);
		Assert.assertTrue(driver.getCurrentUrl().contains("Delivery%20Stories"));
		
	}

	@Test(priority = 32)
	public void verifyCustomerHubOncustomerEvidence() throws Throwable {
		driver.navigate().back();
		driver.navigate().back();
		customerEvidencePage.clickOncustomerMenuButton();
		customerEvidencePage.clickOncustomerHubMenuButton();
		resourcesPage.clickOnHomeshowSearchListButton();
		Thread.sleep(5000);
		resourcesPage.clickOnselectABERDEENCITYCOUNCIL();
		Thread.sleep(5000);
		boolean actualResult = resourcesPage.getcustomerTPIDValue().getText().contains("2539902");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		Thread.sleep(1000);
		//Assert.assertTrue(resourcesPage.isDisplayedCustomerEvidenceInCustomerHub()); 
		//System.out.println("DisplayedCustomerEvidenceInCustomerHub");
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Customer Hub"));
		
		Thread.sleep(3000);
		
	}
	
	@Test(priority = 33)
	public void verifyEvidenceadminview() throws Throwable {
		driver.get("https://catalog.ms/Evidenceadminview");
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Industry Solutions Go Live and Win Wire Tool Submissions"));
		boolean actualResult = customerEvidencePage.getexportAllToFileButton().isDisplayed();
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		Thread.sleep(3000);
		
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}