
package portfolio_test.user;

import java.io.IOException;
import java.util.Set;
import javax.swing.text.Utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.TestBase;

public class TC02_HomePage extends TestBase {
	public WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;

	Utilities util;
	public static Logger log = LogManager.getLogger(TestBase.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("produrl"));
		util = new Utilities();
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
	}

	@Test(priority = 1)
	public void verifyHomepage() {

		Assert.assertTrue(driver.getCurrentUrl().contains("Home"));
		log.info("Home page displayed");
	}

	@Test(priority = 2)
	public void verifyCatalogueNavigatorOnHomepage() throws Throwable {
		Thread.sleep(5000);
		homePage.clickOnArchView();
		Thread.sleep(5000);
		Assert.assertTrue(homePage.isDisplayedfilteredLinkButton());
		log.info("Catalogue Navigator displayed");
	}

	@Test(priority = 3)
	public void verifyCustomerEvidenceSectionOnHomepage() throws Throwable {

		homePage.clickOnISView();
		Thread.sleep(5000);
		Assert.assertTrue(homePage.isDisplayedCustomerEvidenceSearchButton());
	}

	@Test(priority = 4)
	public void verifyViewCampaignPageOnHomepage() throws Throwable {

		homePage.clickOnViewCampaignPage();
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

	@Test(priority = 5)
	public void verifyCloudTransitionServicesPageOnHomepage() throws Throwable {

		homePage.clickOnCloudTransitionServicesLink();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Cloud Transition Services"));
		driver.close();
		driver.switchTo().window(mainTab);
		Thread.sleep(5000);
	}

	@Test(priority = 6)
	public void VerifyCloudManagementOperationsPageOnHomepage() throws Throwable {
		homePage.clickOnCloudManagementOperationsLink();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Cloud Management and Operations"));
		driver.close();
		driver.switchTo().window(mainTab);
		Thread.sleep(5000);
	}

	@Test(priority = 7)
	public void VerifyProductInnovationDevelopmentServicesPageOnHomepage() throws Throwable {
		homePage.clickOnProductInnovationDevelopmentServicesLink();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Product Innovation Development Services"));
		driver.close();
		driver.switchTo().window(mainTab);
		Thread.sleep(5000);
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

	@AfterTest
	public void teardown() {
		driver.quit();
	}
}