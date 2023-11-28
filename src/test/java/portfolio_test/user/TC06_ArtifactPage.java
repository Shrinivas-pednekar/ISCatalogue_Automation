
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

public class TC06_ArtifactPage extends TestBase {
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

		driver.get(prop.getProperty("Artifact"));

		 //loginPage.clickOnUserButton();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	@Test(priority = 2)
	public void VerifyLoadtime() throws InterruptedException {
		 long startTime = System.currentTimeMillis();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("End-to-End Machine Learning"));
		   long endTime = System.currentTimeMillis();
	        long loadTime = endTime - startTime;

	        System.out.println("Page loaded in " + loadTime + " milliseconds");
		System.out.println("Load time ");
	}
	
	@Test(priority = 1, enabled = false)
	public void VerifySubscribeUnsubscribeOfArtifact() throws InterruptedException {

		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(2000);
				// cataloguePage.clickOnSubscribeSliderButton();
				// Thread.sleep(2000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				Thread.sleep(3000);
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
			Thread.sleep(3000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
	}

	@Test(priority = 2)
	public void VerifySSTATSAndIMPACTOfArtifact() throws InterruptedException {
		cataloguePage.SoldCountwaitForElementToBeVisible();
		boolean actualResult3 = cataloguePage.getSoldCount().getText().contains("3");
		Assert.assertTrue(actualResult3);
		System.out.println("Stat count verified ");
	}

	@Test(priority = 3)
	public void VerifyMaturitySectionOfArtifact() throws InterruptedException {
		boolean actualResult1 = cataloguePage.getProvenMaturityCheck().getText().contains("Proven");
		// System.out.println("Evidence displaed as expected =" +
		// cataloguePage.getEDFEvidenceCheck().getText());
		Assert.assertTrue(actualResult1);
		System.out.println("Displayed Maturity");
	}

	@Test(priority = 4)
	public void VerifyKeyMaterialsSectionOfArtifact() throws InterruptedException {
		boolean actualResult1 = cataloguePage.getKeyMaterialsCheck().getText()
				.contains("2. Business Outcomes with AI - Customer Presentation");
		 System.out.println("Evidence displaed as expected =" + cataloguePage.getKeyMaterialsCheck().getText());
		Assert.assertTrue(actualResult1);
		System.out.println("Displayed Key Materials");

	}

	@Test(priority = 5)
	public void VerifyEvidenceSectionOfArtifact() throws InterruptedException {
		boolean actualResult4 = cataloguePage.getofferEvidenceCheck().getText().contains("Customer Evidence");
		// System.out.println("Evidence displaed as expected =" +
		// cataloguePage.getEDFEvidenceCheck().getText());
		Assert.assertTrue(actualResult4);
		System.out.println("Displayed Evidence in Customer Evidence");
	}

	@Test(priority = 6)
	public void VerifyENHANCEMENTSSectionOfArtifact() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();

		cataloguePage.clickonCSUButton();
		cataloguePage.clickonVBDFindOutMoreButton();
		 //loginPage.clickOnUserButton();
		softAssert.assertTrue(driver.getTitle().contains("Value Based Deliverables"),
				"Title does not contain 'Value Based Deliverables'.");
		System.out.println("Displayed Value Based Deliverables Page");
		Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().back();
	System.out.println("2 Displayed Value Based Deliverables Page");
	Thread.sleep(3000);
	
	cataloguePage.clickonCSUButton();
	System.out.println("3Displayed Value Based Deliverables Page");
	Thread.sleep(3000);
	cataloguePage.clickonPSSFindOutMoreButton();
	System.out.println("4Displayed Value Based Deliverables Page");
	Thread.sleep(3000);
//	Thread.sleep(2000);
	softAssert.assertTrue(driver.getTitle().contains("Proactive Services"),
            "Title does not contain 'Proactive Services'.");
	System.out.println("Displayed Proactive Services Page");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);

		softAssert.assertAll();

	}

	@Test(priority = 7)
	public void VerifyBoMSectionOfArtifact() throws InterruptedException {
		cataloguePage.clickonEndselectAllBomButton();
		Assert.assertTrue(cataloguePage.isDisplayedDownloadButton());
		System.out.println("BOM is displayed and able to download ");
		Thread.sleep(2000);
		cataloguePage.clickOnDownloadSectionCloseButton();
		Thread.sleep(2000);
	}

	@Test(priority = 8)
	public void VerifySolutionPlaySectionOfArtifact() throws InterruptedException {
		cataloguePage.clicktabSolutionPlayButtonButton();
		cataloguePage.getSolutionPlaywaitForElementToBeVisible();
		boolean actualResult5 = cataloguePage.getSolutionPlay().getText().contains("Solution Play");
		// System.out.println("Catalogue Offer displaed as expected =" +
		// cataloguePage.getSolutionPlay().getText());
		Assert.assertTrue(actualResult5);
		System.out.println("Displayed Solution Play");
	}

	@Test(priority = 10)
	public void VerifyCatalogueOfferSectionOfArtifact() throws InterruptedException {
		cataloguePage.clickCatalogueOfferButton();
		Thread.sleep(5000);
		boolean actualResult6 = cataloguePage.getCatalogueOffer().getText().contains("Catalogue Offer");
		// System.out.println("Catalogue Offer displaed as expected =" +
		// cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
	}

	@Test(priority = 9)
	public void VerifyArtifactSectionOfArtifact() throws InterruptedException {
		cataloguePage.clickArtefactButton();
		// cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		Thread.sleep(5000);
		boolean actualResult8 = cataloguePage.getArtifactTabName().getText().contains("Catalogue Artifact");
		 System.out.println("Artifact displaed as expected =" + cataloguePage.getArtifactTabName().getText());
		Assert.assertTrue(actualResult8);
		System.out.println("Displayed Artifact ");
	}
	@Test(priority = 10)
	public void VerifySeeAllCustomerEvidenceSearchPageFromArtifactPage() throws Throwable {
		homePage.clickOnCustomerEvidenceSearchButton();
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
		boolean actualResult2 = driver.getCurrentUrl().contains("1794");
		Assert.assertTrue(actualResult2);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("1794"));
		driver.close();
		driver.switchTo().window(mainTab);
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}
}