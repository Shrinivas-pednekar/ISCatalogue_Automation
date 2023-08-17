
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

public class TC02_HomePage extends TestBase {
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
	
		driver.get(prop.getProperty("produrl"));
		
		loginPage.clickOnUserButton();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}


	@Test(priority = 1)
	public void verify_Homepage() {

		Assert.assertTrue(driver.getCurrentUrl().contains("Home"));
		log.info("Home page displayed");
	}
	
	@Test(priority = 2)
	public void verify_MCAPS_Seller_View() throws Throwable {
		Thread.sleep(5000);
		//homePage.clickOnArchView();
		boolean actualResult = homePage.getMCAPS_Seller_View_Title().getText().contains("Connections to IS Sellers");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		log.info("MCAPS Seller View displayed");
	}


	@Test(priority = 3)
	public void verifyCustomerHubPageFromHomePage() throws Throwable 
	{
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
		driver.navigate().back();
		
	}
	@Test(priority = 4)
	public void verifyMeet_the_new_IS_CataloguePageOnHomepage() throws Throwable {

		homePage.clickOnLearnMoreButton();
		Thread.sleep(5000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Welcome to the new IS Catalog"));
		driver.navigate().back();
	}
/*	
	@Test(priority = 5)
	public void verifyVisitISRequestformOnHomePage() throws Throwable {
		Thread.sleep(2000);
		homePage.clickOnISRequestFormButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		Thread.sleep(2000);
		Assert.assertTrue(driver.getTitle().contains("Power Apps"));
		driver.navigate().back();
		driver.navigate().back();
	}*/
		@Test(priority = 6)
	public void verify_IS_Seller_View() throws Throwable {
		Thread.sleep(5000);
		homePage.clickViewChangeDropdown();
		homePage.clickISSellerViewButton();
		boolean actualResult = homePage.getIS_Seller_View_Title().getText().contains("Everything you need to convert customer solutions into cloud revenue");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		log.info("IS Seller View displayed");
	}
	
		
	@Test(priority = 7)
	public void verifyCloudTransitionServicesPageOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		homePage.clickOnCloudTransitionServicesLink();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		//Assert.assertTrue(driver.getTitle().contains("Cloud Transition Services"));
		softAssert.assertTrue(driver.getTitle().contains("Cloud Transition Services"),
                "Title does not contain 'Cloud Transition Services'.");
		driver.close();
		driver.switchTo().window(mainTab);
		Thread.sleep(5000);
		softAssert.assertAll();
	}
	@Test(priority = 8)
	public void VerifyCloudManagementOperationsPageOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		
		homePage.clickOnExpandtoviewallLink();
		homePage.clickOnCloudManagementOperationsLink();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		 softAssert.assertTrue(driver.getTitle().contains("Cloud Management and Operations"),
	                "Title does not contain 'Cloud Management and Operations'.");
		//Assert.assertTrue(driver.getTitle().contains("Cloud Management and Operations"));
		driver.close();
		driver.switchTo().window(mainTab);
		Thread.sleep(5000);
		softAssert.assertAll();
	}
	@Test(priority = 9)
	public void VerifyProductInnovationDevelopmentServicesPageOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		homePage.clickOnDProductInnovationDevelopmentServicesLinkLink();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		//Assert.assertTrue(driver.getTitle().contains("Product Innovation Development Services"));
		softAssert.assertTrue(driver.getTitle().contains("Product Innovation Development Services"),
                "Title does not contain 'Product Innovation Development Services'.");
		driver.close();
		driver.switchTo().window(mainTab);
		Thread.sleep(5000);
		softAssert.assertAll();
	}
	
	@Test(priority = 10)
	public void VerifyIdentity_and_Access_ServicesPageOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		homePage.clickOnIdentity_and_Access_ServicesLink();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		//Assert.assertTrue(driver.getTitle().contains("Identity and Access Services"));
		softAssert.assertTrue(driver.getTitle().contains("Identity and Access Services"),
                "Title does not contain 'Identity and Access Services'.");
		driver.close();
		driver.switchTo().window(mainTab);
		Thread.sleep(5000);
		softAssert.assertAll();
	}
	@Test(priority = 11)
	public void VerifyDigital_Security_and_CompliancePageOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		homePage.clickOnDigital_Security_and_ComplianceLink();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Digital Security and Compliance"));
		softAssert.assertTrue(driver.getTitle().contains("Digital Security and Compliance"),
                "Title does not contain 'Digital Security and Compliance'.");
		driver.close();
		driver.switchTo().window(mainTab);
		Thread.sleep(5000);
		softAssert.assertAll();
	}
	@Test(priority = 12)
	public void Verify_Data_Strategy_Platform_Analytics_PageOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		homePage.clickOnData_Strategy_Platform_Analytics_PageOnHomepageLinkLink();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		//Assert.assertTrue(driver.getTitle().contains("Data Strategy Platform & Analytics"));
		 softAssert.assertTrue(driver.getTitle().contains("Data Strategy Platform & Analytics"),
	                "Title does not contain 'Data Strategy Platform & Analytics'.");
		driver.close();
		driver.switchTo().window(mainTab);
		Thread.sleep(5000);
		softAssert.assertAll();
	}
	 @Test(priority = 13)
	 public void VerifySecurity_OperationsPageOnHomepage() throws Throwable {
		 SoftAssert softAssert = new SoftAssert();
		 homePage.clickOnSecurity_OperationsLink();
			Thread.sleep(5000);
			Set<String> allTabs = homePage.getWindowHandles();
			String mainTab = driver.getWindowHandle();
			allTabs.remove(mainTab);
			String newTab = allTabs.iterator().next();
			driver.switchTo().window(newTab);
			System.out.println("New Tab URL - " + driver.getTitle());
			//Assert.assertTrue(driver.getTitle().contains("Security Operations"));
			softAssert.assertTrue(driver.getTitle().contains("Security Operations"),
	                "Title does not contain 'Security Operations'.");
			driver.close();
			driver.switchTo().window(mainTab);
			Thread.sleep(5000);
			softAssert.assertAll();
	    }
	@Test(priority = 14)
	public void VerifyEnd_to_End_AI_and_Machine_LearningPageOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		homePage.clickOnEnd_to_End_AI_and_Machine_LearningLink();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		//Assert.assertTrue(driver.getTitle().contains("End-to-End AI and Machine Learning"));
		softAssert.assertTrue(driver.getTitle().contains("End-to-End AI and Machine Learning"),
                "Title does not contain 'End-to-End AI and Machine Learning'.");
		driver.close();
		driver.switchTo().window(mainTab);
		Thread.sleep(5000);
		softAssert.assertAll();
	}
	
	@Test(priority = 16)
	public void verifyCustomerEvidenceSectionOnHomepage() throws Throwable {

		//homePage.clickOnISView();
		Thread.sleep(5000);
		Assert.assertTrue(homePage.isDisplayedCustomerEvidenceSearchButton());
	}
	
	/*@Test(priority = 17)
	public void VerifySeeallcustomerevidenceSearchPageFromISSellerViewHomepage() throws Throwable {
		homePage.clickOnCustomerEvidenceSearchButton();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Customer Evidence Search"));
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		driver.close();
		driver.switchTo().window(mainTab);

	}
	*/
	@Test(priority = 18)
	public void verifyMeet_the_new_IS_CataloguePageOnHomepageForISSellerView() throws Throwable {

		homePage.clickOnLearnMoreButton();
		Thread.sleep(5000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Welcome to the new IS Catalog"));
		driver.navigate().back();
	}
	
	@Test(priority = 19)
	public void verify_Architect_View() throws Throwable {
		Thread.sleep(5000);
		homePage.clickViewChangeDropdown();
		homePage.clickArchitectViewButton();
		Thread.sleep(5000);
		boolean actualResult = homePage.get_Architect_View_Title().getText().contains("Search for anything in the catalogue");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		log.info("Architect View displayed");
		
	}
	
	@Test(priority = 20)
	public void verifySearchFunctionOnHomePageForArchitectRole() throws Throwable {

		homePage.enterSearchDetails("Azure");
		Thread.sleep(3000);
		homePage.pressEnterbuttonForSearch();
		Assert.assertTrue(driver.getTitle().contains("Search"));
		Thread.sleep(5000);
		System.out.println("New Tab URL - " + driver.getTitle());
		driver.navigate().back();
		homePage.clickViewChangeDropdown();
		homePage.clickArchitectViewButton();
		
		
	}
	
	@Test(priority = 21)
	public void verifyPickupwhereyouleftSectionfOnHomepage() throws Throwable {
		Thread.sleep(4000);
		boolean actualResult = homePage.get_pick_uo_where_you_left_Title().getText().contains("Pick up where you left off");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		log.info("Pick up where you left off section displayed");
		
	}
	
	@Test(priority = 22)
	public void verifyTreadingOfferSectionfOnHomepage() throws Throwable {

		boolean actualResult = homePage.get_TreadingOffer_Title().getText().contains("Trending offers");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		log.info("Trending offers section displayed");
		
	}
	
	@Test(priority = 23)
	public void verifyViewAllOffersLinkOnHomepage() throws Throwable {
		homePage.clickOnVerifyAllOffersLink();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getCurrentUrl().contains("Catalogue"));
		driver.close();
		driver.switchTo().window(mainTab);
		Thread.sleep(5000);
	}
	
	@Test(priority = 24)
	public void verifyCustomerEvidenceSectionForArchitectViewOnHomepage() throws Throwable {

		Thread.sleep(5000);
		Assert.assertTrue(homePage.isDisplayedCustomerEvidenceSearchButton());
	}
/*	@Test(priority = 25)// keep in comment
	public void VerifyCustomerEvidenceSearchPageFromArchitectViewHomepage() throws Throwable {
		homePage.clickOnCustomerEvidenceSearchButton();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Customer Evidence Search"));
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		driver.close();
		driver.switchTo().window(mainTab);
	}
	*/
		@Test(priority = 26)
	public void verifyMobilityPageArchitectViewOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		homePage.clickOnAutomotiveMobilityandTransportationtButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		System.out.println("Mobility is loaded sucessfully ");
		  softAssert.assertTrue(driver.getTitle().contains("Mobility"),
	                "Title does not contain 'Mobility'.");
	        
	        driver.navigate().back();
	        Thread.sleep(3000);
	        softAssert.assertAll();
	}

	@Test(priority = 27)
	public void verifyCrossIndustryPageArchitectViewOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		homePage.clickViewChangeDropdown();
		homePage.clickArchitectViewButton();
		Thread.sleep(3000);
		homePage.clickOnCrossIndustryButton();
		Thread.sleep(3000);
		System.out.println("New Tab URL - " + driver.getTitle());
		  softAssert.assertTrue(driver.getTitle().contains("Cross-Industry"),
	                "Title does not contain 'Cross-Industry'.");
	        
	        driver.navigate().back();
	        Thread.sleep(3000);
	        softAssert.assertAll();
	        
	}

	@Test(priority = 28)
	public void verifyDefenseandIntelligencePageArchitectViewOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		homePage.clickViewChangeDropdown();
		homePage.clickArchitectViewButton();
		Thread.sleep(3000);
		homePage.clickOnDefenseandIntelligenceButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		 softAssert.assertTrue(driver.getTitle().contains("Defense and Intelligence"),
	                "Title does not contain 'Defense and Intelligence'.");
	        
	        driver.navigate().back();
	        Thread.sleep(3000);
	        softAssert.assertAll();
		
		
	}

	@Test(priority = 29)
	public void verifyEducationPageArchitectViewOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		 homePage.clickViewChangeDropdown();
	        homePage.clickArchitectViewButton();
	        Thread.sleep(3000);
	        homePage.clickOnEducationButton();
	        
	        System.out.println("New Tab URL - " + driver.getTitle());
	        
	        // Soft Assert: Verify the title contains "Education"
	        softAssert.assertTrue(driver.getTitle().contains("Education"),
	                "Title does not contain 'Education'.");
	        
	        driver.navigate().back();
	        Thread.sleep(3000);
	        
	        softAssert.assertAll();
	}

	@Test(priority = 30)
	public void verifyEnergyPageArchitectViewOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		homePage.clickViewChangeDropdown();
		homePage.clickArchitectViewButton();
		Thread.sleep(3000);
		homePage.clickOnEnergyandResourcesButton();
		Thread.sleep(3000);
		System.out.println("New Tab URL - " + driver.getTitle());
		 softAssert.assertTrue(driver.getTitle().contains("Energy"),
	                "Title does not contain 'Energy'.");
	        
	        driver.navigate().back();
	        Thread.sleep(3000);
	        softAssert.assertAll();
	}

	@Test(priority = 31)
	public void verifyFinancialServicesPageArchitectViewOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		homePage.clickViewChangeDropdown();
		homePage.clickArchitectViewButton();
		Thread.sleep(3000);
		homePage.clickOnFinancialServicesButton();
		Thread.sleep(3000);
		System.out.println("New Tab URL - " + driver.getTitle());
		softAssert.assertTrue(driver.getTitle().contains("Financial Services"),"Title does not contain 'Financial Services'.");
		driver.navigate().back();
		Thread.sleep(3000);
		softAssert.assertAll();
	}

	@Test(priority = 32)
	public void verifyGovernmentPageArchitectViewOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		homePage.clickViewChangeDropdown();
		homePage.clickArchitectViewButton();
		Thread.sleep(3000);
		homePage.clickOnGovernmentButton();
		Thread.sleep(3000);
		System.out.println("New Tab URL - " + driver.getTitle());
		softAssert.assertTrue(driver.getTitle().contains("Government"),"Title does not contain 'Government'.");
		driver.navigate().back();
		Thread.sleep(3000);
		softAssert.assertAll();
	}

	@Test(priority = 33)
	public void verifyHealthcarePageArchitectViewOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		homePage.clickViewChangeDropdown();
		homePage.clickArchitectViewButton();
		Thread.sleep(3000);
		homePage.clickOnHealthcareButton();
		Thread.sleep(3000);
		System.out.println("New Tab URL - " + driver.getTitle());
		softAssert.assertTrue(driver.getTitle().contains("Healthcare"),"Title does not contain 'Healthcare'.");
		driver.navigate().back();
		Thread.sleep(3000);
		softAssert.assertAll();
	}

	@Test(priority = 34)
	public void verifyIndustrialsandManufacturingPageArchitectViewOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		homePage.clickViewChangeDropdown();
		homePage.clickArchitectViewButton();
		Thread.sleep(3000);
		homePage.clickOnIndustrialsandManufacturingButton();
		Thread.sleep(3000);
		System.out.println("New Tab URL - " + driver.getTitle());
		softAssert.assertTrue(driver.getTitle().contains("Industrials and Manufacturing"),"Title does not contain 'Industrials and Manufacturing'.");
		driver.navigate().back();
		Thread.sleep(3000);softAssert.assertAll();
	}

	@Test(priority = 35)
	public void verifyRetailandConsumerGoodsPageArchitectViewOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		homePage.clickViewChangeDropdown();
		homePage.clickArchitectViewButton();
		Thread.sleep(3000);
		homePage.clickOnRetailandConsumerGoodsButton();
		Thread.sleep(3000);
		System.out.println("New Tab URL - " + driver.getTitle());
		softAssert.assertTrue(driver.getTitle().contains("Retail and Consumer Goods"),"Title does not contain 'Retail and Consumer Goods'.");
		driver.navigate().back();
		Thread.sleep(3000);softAssert.assertAll();
	}

	@Test(priority = 36)
	public void verifySustainabilityPageArchitectViewOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		homePage.clickViewChangeDropdown();
		homePage.clickArchitectViewButton();
		Thread.sleep(3000);
		homePage.clickOnSustainabilityButton();
		Thread.sleep(3000);
		System.out.println("New Tab URL - " + driver.getTitle());
		softAssert.assertTrue(driver.getTitle().contains("Sustainability"),"Title does not contain 'Sustainability'.");
		driver.navigate().back();
		Thread.sleep(3000);softAssert.assertAll();
	}

	@Test(priority = 37)
	public void verifyTelecommunicationsandMediaPageArchitectViewOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		homePage.clickViewChangeDropdown();
		homePage.clickArchitectViewButton();
		Thread.sleep(3000);
		homePage.clickOnTelecommunicationsandMediaButton();
		Thread.sleep(3000);
		System.out.println("New Tab URL - " + driver.getTitle());
		softAssert.assertTrue(driver.getTitle().contains("Telecommunications and Media"),"Title does not contain 'Telecommunications and Media'.");
		driver.navigate().back();
		Thread.sleep(3000);softAssert.assertAll();
	}
	
	

	

/*



	@Test(priority = 8)
	public void VerifyViewalltopoffersPageOnHomepage() throws Throwable {
		homePage.clickOnViewalltopoffersLink();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Top ACR and DV Generators"));
		driver.close();
		driver.switchTo().window(mainTab);
		Thread.sleep(5000);
	}

	@Test(priority = 9)
	public void VerifyCustomerEvidenceSearchPageFromHomepage() throws Throwable {
		homePage.clickOnCustomerEvidenceSearchButton();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Customer Evidence Search"));
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		driver.close();
		driver.switchTo().window(mainTab);

	}

	@Test(priority = 10)
	public void VerifyPrivacyPageFromHomepage() throws Throwable {
		homePage.clickOnPrivacyButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Data Privacy Notice – Microsoft privacy"));
	}
	
	@Test(priority = 11)
	public void VerifyEurekaPageFromHomepage() throws Throwable {
		driver.navigate().back();
		homePage.clickOnEurekaButton();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		//loginPage.clickOnUserButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Eureka - Home"));
		driver.close();
		driver.switchTo().window(mainTab);

	}
	
	
	@Test(priority = 2, enabled = false)
	public void testBrokenLinks() throws IOException, InterruptedException {
		List<WebElement> links = driver.findElements(By.xpath("//a[contains(@href,'.')]"));
		System.out.println("Total links on the page: " + links.size());
		HttpURLConnection.setFollowRedirects(false); // disable automatic redirects
		int maxRedirects = 5;
		for (WebElement link : links) {
			//Thread.sleep(3000);
			String url = link.getAttribute("href");
			//Thread.sleep(3000);

			if (url == null || url.isEmpty()) {
				continue;
			}
			HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
			//Thread.sleep(3000);
			connection.setRequestMethod("GET");
			//Thread.sleep(3000);
			int responseCode = connection.getResponseCode();
			
			if (responseCode >= 400) {
				
			System.out.println("Broken Link: |" + url + " | Response Code: |" + responseCode);

			} else {
				System.out.println("Working Link: |" + url + " | Response Code: |" + responseCode);

			}
		}
	}
*/
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}