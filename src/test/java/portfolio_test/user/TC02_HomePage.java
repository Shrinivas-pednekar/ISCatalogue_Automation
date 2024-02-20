
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
		
		//loginPage.clickOnUserButton();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}


	@Test(priority = 1)
	public void verify_Homepage() {

		Assert.assertTrue(driver.getCurrentUrl().contains("Home"));
		log.info("Home page displayed");
	}
	
	@Test(priority = 2)
	public void verify_User_View_mapping() throws Throwable {
		Thread.sleep(5000);
		//homePage.clickOnArchView();
		boolean actualResult = homePage.getCurrentRole_View().getText().contains("Sales, ATU");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		log.info("User View mapping_verified");
	}
	
	@Test(priority = 3)
	public void Verify_Business_Outcomes_with_AIPageOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		homePage.clickOnBusiness_Outcomes_with_AILink();
		System.out.println("New Tab URL - " + driver.getTitle());
		//Assert.assertTrue(driver.getTitle().contains("Business Outcomes with AI"));
		softAssert.assertTrue(driver.getTitle().contains("Business Outcomes with AI"),
                "Title does not contain 'Business Outcomes with AI'.");
		softAssert.assertAll();
		driver.navigate().back();
	}
	
	@Test(priority = 4)
	public void VerifyCloudManagementOperationsPageOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		
		//homePage.clickOnExpandtoviewallLink();
		homePage.clickOnCloudManagementOperationsLink();
		System.out.println("New Tab URL - " + driver.getTitle());
		 softAssert.assertTrue(driver.getTitle().contains("Cloud Management and Operations"),
	                "Title does not contain 'Cloud Management and Operations'.");
		//Assert.assertTrue(driver.getTitle().contains("Cloud Management and Operations"));
		softAssert.assertAll();
		driver.navigate().back();
	}
	
	@Test(priority = 5)
	public void verifyCloudTransitionServicesPageOnHomepage() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		Thread.sleep(3000);
		homePage.clickOnCloudTransitionServicesLink();
		
		System.out.println("New Tab URL - " + driver.getTitle());
		//Assert.assertTrue(driver.getTitle().contains("Cloud Transition Services"));
		softAssert.assertTrue(driver.getTitle().contains("Cloud Transition Services"),
                "Title does not contain 'Cloud Transition Services'.");
				Thread.sleep(5000);
		softAssert.assertAll();
		driver.navigate().back();
	}
	
	@Test(priority = 6)
	public void verifyCustomerEvidenceExploreOnHomepage() throws Throwable {

		//homePage.clickOnISView();
		//Thread.sleep(5000);
		Assert.assertTrue(homePage.isDisplayedCustomerEvidenceSearchButton());
		
	}
	
	@Test(priority = 7)
	public void VerifyCustomerEvidenceExplorebuttonFunctionOnHomepage() throws Throwable {
		homePage.clickOnExploreCustomerEvidenceSearchButton();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		//homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Customer Evidence Home"));
		System.out.println("New Tab URL - " + driver.getCurrentUrl());
		boolean actualResult2 = driver.getCurrentUrl().contains("customerevidence/home");
		Assert.assertTrue(actualResult2);
		driver.close();
		driver.switchTo().window(mainTab);

	}
	
	@Test(priority = 8)
	public void verify_EvidenceCardOnHomepage() throws Throwable {
		boolean actualResult4 = homePage.getEvidenceCheckonHomePage().getText()
				.contains("Win Wires");
		//System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
		Assert.assertTrue(actualResult4);
		System.out.println("Displayed Evidence Card");
		homePage.clickEvidenceCardOnHomePage();
		Assert.assertTrue(driver.getCurrentUrl().contains("customerevidence/customerstorypage/"));
		driver.navigate().back();
	}


	@Test(priority = 9)
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

	@Test(priority = 10)
	public void verifyIndustrySolutionsDeliveryHomeOnSolutionPage() throws Throwable {
		
		homePage.clickOnIndustrySolutionsDeliveryHomePageButton();
		Thread.sleep(3000);
		// boolean isTrue ;
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Industry Solutions Delivery Home"));
		System.out.println("Industry Solutions Delivery Home is loaded sucessfully ");
		driver.close();
		driver.switchTo().window(mainTab);
	}
	
	@Test(priority = 11)
	public void verifyMicrosoftUnifiedHomeOnHomePage() throws Throwable {
		
		homePage.clickOnUnifiedHomepageButton();
		Thread.sleep(3000);
		// boolean isTrue ;
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Microsoft Unified Home"));
		System.out.println("Microsoft Unified Home is loaded sucessfully ");
		driver.close();
		driver.switchTo().window(mainTab);
	}

	@Test(priority = 12)
	public void verifyPartnerHomeOnHomePage() throws Throwable {
		
		homePage.clickOnPartnerHomepageButton();
		Thread.sleep(3000);
		// boolean isTrue ;
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Partner Home"));
		System.out.println("Microsoft Unified Home is loaded sucessfully ");
		driver.close();
		driver.switchTo().window(mainTab);
	}
	
	@Test(priority = 13)
	public void verifySearchFunctionOnHomePageForArchitectRole() throws Throwable {

		homePage.enterSearchDetails("Azure");
		Thread.sleep(3000);
		homePage.pressEnterbuttonForSearch();
		Assert.assertTrue(driver.getTitle().contains("Search"));
		Thread.sleep(5000);
		System.out.println("New Tab URL - " + driver.getTitle());
		//driver.navigate().back();		
	}
	
	/*@Test(priority = 4)
	public void verifyMeet_the_new_IS_CataloguePageOnHomepage() throws Throwable {

		homePage.clickOnLearnMoreButton();
		Thread.sleep(5000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Welcome to the new IS Catalog"));
		driver.navigate().back();
	}


	
	
	
	
	
	@Test(priority = 19, enabled=true)
	public void verify_PDOC_PageOnHomepageForISSellerView() throws Throwable {
		driver.get("https://catalog.ms/ProgramInBox/Program/Index?Title=partner%20delivery%20orchestration%20center");
		Thread.sleep(2000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Partner Delivery Orchestration Center"));
		boolean actualResult5 = cataloguePage.getSolutionPlay().getText()
				.contains("Solution Play");
		//System.out.println("Catalogue Offer displaed as expected =" + cataloguePage.getSolutionPlay().getText());
		Assert.assertTrue(actualResult5);
		System.out.println("Displayed Solution Play On PDOC Page");
		driver.navigate().back();
	}
	
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