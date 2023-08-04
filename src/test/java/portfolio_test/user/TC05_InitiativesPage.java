
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
import resources.TestBase;

public class TC05_InitiativesPage extends TestBase {
	public WebDriver driver;
	InitiativesPage campaignsPage;
	HomePage homePage;
	LoginPage loginPage;

	Utilities util;
	public static Logger log = LogManager.getLogger(TestBase.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");
		util = new Utilities();
		campaignsPage = new InitiativesPage(driver);
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		driver.get(prop.getProperty("produrl"));
		loginPage.clickOnUserButton();

	}

	@Test(priority = 1)
	public void verifyTopACRandDVGeneratorsPageFromCampaignsMenu() throws Throwable {

		campaignsPage.clickOnInitiativesMenuButton();
		campaignsPage.clickOnTopACRandDVGeneratorsMenuButton();
		
	 Assert.assertTrue(driver.getTitle().contains("Top ACR and DV Generators"));
		 System.out.println("New Tab URL - " + driver.getTitle());
	}

	@Test(priority = 2)
	public void verifyDoMoreWithLessPageFromCampaignsMenu() throws Throwable {

		campaignsPage.clickOnInitiativesMenuButton();
		campaignsPage.clickOnDoMoreWithLessMenuButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Do More With Less"));
		log.info("Do More With Less page displayed");

	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}
}