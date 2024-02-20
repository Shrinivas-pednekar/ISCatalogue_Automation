
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

public class TC08_InitiativesPage extends TestBase {
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
		// loginPage.clickOnUserButton();

	}

	@Test(priority = 1)
	public void verifyPipeGenerationFocusPlaysPageFromCampaignsMenu() throws Throwable {

		campaignsPage.clickOnInitiativesMenuButton();
		campaignsPage.clickOnPipeGenerationFocusPlaysMenuButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Pipe Generation Focus Plays​"));
		log.info("Pipe Generation Focus Plays​ page displayed");
	}

	@Test(priority = 2)
	public void verifyTopACRandDVGeneratorsPageFromCampaignsMenu() throws Throwable {

		campaignsPage.clickOnInitiativesMenuButton();
		campaignsPage.clickOnTopACRandDVGeneratorsMenuButton();
		Assert.assertTrue(driver.getTitle().contains("Top ACR and DV Generators"));
		System.out.println("New Tab URL - " + driver.getTitle());

	}

	@Test(priority = 3)
	public void verifyPDOCPageFromInitiativeMenu() throws Throwable {

		campaignsPage.clickOnInitiativesMenuButton();
		campaignsPage.clickOnPDOCMenuButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Partner Delivery Orchestration Center"));
		log.info("Partner Delivery Orchestration Center page displayed");

	}

	@Test(priority = 4)
	public void verifyAzureAIHubPageFromInitiativeMenu() throws Throwable {

		campaignsPage.clickOnInitiativesMenuButton();
		campaignsPage.clickOnAzureAIHubMenuButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Azure AI Hub - Innovation to scale"));
		log.info("Azure AI Hub - from innovation to scale page displayed");

	}
	
	@Test(priority = 5)
	public void verifyModernAnalyticsandGovernancewithFabricPageFromInitiativeMenu() throws Throwable {

		campaignsPage.clickOnInitiativesMenuButton();
		campaignsPage.clickOnModernAnalyticsandGovernancewithFabricMenuButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Modern Analytics and Governance with Fabric"));
		log.info("Modern Analytics and Governance with Fabric page displayed");

	}
	
	@Test(priority = 6)
	public void verifyGoFastwithCopilotforM365PageFromInitiativeMenu() throws Throwable {

		campaignsPage.clickOnInitiativesMenuButton();
		campaignsPage.clickOnGoFastwithCopilotforM365MenuButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Go Fast with Copilot for M365"));
		log.info("Go Fast with Copilot for M365 page displayed");

	}	

	@AfterTest
	public void teardown() {
		driver.quit();
	}
}