
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

import pageObjects.InitiativesPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ResourcesPage;
import resources.TestBase;

public class TC09_ResourcesPage extends TestBase {
	public WebDriver driver;
	InitiativesPage campaignsPage;
	HomePage homePage;
	ResourcesPage resourcesPage;
	LoginPage loginPage;

	Utilities util;
	public static Logger log = LogManager.getLogger(TestBase.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");
		util = new Utilities();
		resourcesPage = new ResourcesPage(driver);
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		driver.get(prop.getProperty("produrl"));
		loginPage.clickOnUserButton();
		
	}


	@Test(priority = 1)
	public void verifyAboutISCataloguePageFromResourcesMenu() throws Throwable {
		resourcesPage.clickOnResourcesMenuButton();
		resourcesPage.clickOnAboutISCatalogueMenuButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Welcome to the new IS Catalogue"));
	}
	@Test(priority = 2)

	public void verifyFundingPageFromResourcesMenu() throws Throwable {
		resourcesPage.clickOnResourcesMenuButton();
		resourcesPage.clickOnFundingMenuButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Funding Deck"));
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}