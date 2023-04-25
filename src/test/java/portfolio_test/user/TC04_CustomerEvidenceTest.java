
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
import resources.TestBase;

public class TC04_CustomerEvidenceTest extends TestBase {
	public WebDriver driver;
	// LoginPage loginPage;
	HomePage homePage;
	// CataloguePage cataloguePage;
	CustomerEvidencePage customerEvidencePage;

	Utilities util;
	public static Logger log = LogManager.getLogger(TestBase.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("produrl"));
		util = new Utilities();
		// loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		// cataloguePage = new CataloguePage(driver);
		customerEvidencePage = new CustomerEvidencePage(driver);

	}

	@Test(priority = 1)
	public void verifyCustomerEvidanceHomePageOnCustomerEvidence() throws Throwable {

		customerEvidencePage.clickOncustomerEvidenceMenuButton();
		customerEvidencePage.clickOncustomerEvidenceHomeMenuButton();
		// Thread.sleep(3000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		driver.close();
		driver.switchTo().window(mainTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Customer Evidence Home"));
		// Thread.sleep(3000);
	}

	@Test(priority = 2)
	public void verifyCarouselOnCustomerEvidence() throws Throwable {

		Assert.assertTrue(customerEvidencePage.getcarouselLearnMoreButtonOnEvidence().isDisplayed());
		;
	}

	@Test(priority = 3)
	public void verifysubmitNewStoryPageOnCustomerEvidence() throws Throwable {

		customerEvidencePage.clickOnsubmitNewStoryButton();
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		Thread.sleep(10000);
		System.out.println("New Tab URL - " + driver.getTitle());

		Assert.assertTrue(driver.getTitle().contains("IS Customer Evidence Tool - PowerApps"));
		driver.close();
		driver.switchTo().window(mainTab);
		Thread.sleep(3000);
	}

	@Test(priority = 4)
	public void verifyCustomerEvidanceSearchFunctionOnCustomerEvidence() throws Throwable {

		customerEvidencePage.enterStoryDetails("TATA");
		Thread.sleep(3000);
		customerEvidencePage.clickOncustomerEvidenceSearchButton();
		Assert.assertTrue(driver.getTitle().contains("Customer Evidence Search"));
		Thread.sleep(5000);
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult);
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 5)
	public void verifyAutomotiveMobilityandTransportationCustomerStoriesSearchButtonOnCustomerEvidence()
			throws Throwable {

		customerEvidencePage.clickOnAutomotiveMobilityandTransportationCustomerStoriesSearchButton();
		Thread.sleep(3000);
		boolean actualResult = customerEvidencePage.getAutomotiveMobilityandTransportationCustomerStoriesTitle()
				.getText().contains("Automotive, Mobility and Transportation Customer Stories");
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult2 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult2);
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 6)
	public void verifyCrossIndustryCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {

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
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 7)
	public void verifyDefenseandIntelligenceCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {

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
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 8)
	public void verifyEducationCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {

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
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 9)
	public void verifyEnergyandResourcesCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {

		customerEvidencePage.clickOnEnergyandResourcesCustomerStoriesSearchButton();
		Thread.sleep(3000);
		boolean actualResult = customerEvidencePage.getEnergyandResourcesCustomerStoriesTitle().getText()
				.contains("Energy and Resources Customer Stories");
		System.out.println("Actual Result - " + actualResult);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 10)
	public void verifyFinancialServicesCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {

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
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 11)
	public void verifyGovernmentCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {

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
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 12)
	public void verifyHealthcareCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {

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
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 13)
	public void verifyIndustrialandManufacturingCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {

		customerEvidencePage.clickOnIndustrialandManufacturingCustomerStoriesSearchButton();
		Thread.sleep(3000);
		boolean actualResult = customerEvidencePage.getIndustrialandManufacturingCustomerStoriesTitle().getText()
				.contains("Industrial and Manufacturing Customer Stories");
		System.out.println("Actual Result - " + actualResult);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(actualResult);

		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 14)
	public void verifyRetailandConsumerGoodsCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {

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
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 15)
	public void verifySustainabilityCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {

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
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 16)
	public void verifyTelecommunicationsandMediaCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {

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
		driver.navigate().back();
		driver.navigate().back();
	}

	// -----------------------------------Solution Areas
	// Stories--------------------------

	@Test(priority = 17)
	public void verifyBusinessAppsCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {

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
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 18)
	public void verifyDataAICustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {

		customerEvidencePage.clickOnSolutionAreaStoriesButton();
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
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 19)
	public void verifyDigitalandApplicationInnovationCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {

		customerEvidencePage.clickOnSolutionAreaStoriesButton();
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
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 20)
	public void verifyInfrastructureCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {

		customerEvidencePage.clickOnSolutionAreaStoriesButton();
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
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 21)
	public void verifyModernWorkCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {

		customerEvidencePage.clickOnSolutionAreaStoriesButton();
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
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 22)
	public void verifySecurityCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {

		customerEvidencePage.clickOnSolutionAreaStoriesButton(); //
		Thread.sleep(5000);
		customerEvidencePage.clickSecurityCustomerStoriesSearchButton(); //
		Thread.sleep(5000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Security"));
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 23)
	public void verifyWinWiresCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {

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
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 24)
	public void verifyDeliveryStoriesCustomerStoriesSearchButtonOnCustomerEvidence() throws Throwable {

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
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 25)
	public void verifyclickOncustomerEvidenceWinWiresMenuButtonOnCustomerEvidence() throws Throwable {

		customerEvidencePage.clickOncustomerEvidenceMenuButton();
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
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 26)
	public void verifyCustomerEvidenceDeliveryStoriesMenuButtonOnCustomerEvidence() throws Throwable {

		customerEvidencePage.clickOncustomerEvidenceMenuButton();
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
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 27)
	public void verifySubmitaStoryMenuButtonOncustomerEvidence() throws Throwable {

		customerEvidencePage.clickOncustomerEvidenceMenuButton();
		customerEvidencePage.clickOncustomerEvidenceSubmitaStoryMenuButton();
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		driver.close();
		driver.switchTo().window(mainTab);
		Thread.sleep(10000);
		System.out.println("New Tab URL - " + driver.getTitle());

		Assert.assertTrue(driver.getTitle().contains("IS Customer Evidence Tool - PowerApps"));
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority = 28)
	public void verifyclickOnAboutCustomerEvidenceMenuButtonOncustomerEvidence() throws Throwable {

		customerEvidencePage.clickOncustomerEvidenceMenuButton();
		customerEvidencePage.clickOnAboutCustomerEvidenceMenuButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Customer Evidence"));
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}