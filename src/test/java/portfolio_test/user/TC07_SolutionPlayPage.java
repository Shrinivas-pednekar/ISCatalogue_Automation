
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

public class TC07_SolutionPlayPage extends TestBase {
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
	
		driver.get(prop.getProperty("SolutionPlay"));
		
		//loginPage.clickOnUserButton();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	
	
	
	@Test(priority = 1)
	public void VerifyKeyMaterialsSectionOfSolutionPlay() throws InterruptedException {
	boolean actualResult1 = cataloguePage.getKeyMaterialsCheck().getText()
			.contains("Digital Security & Compliance Solution - Customer Presentation v1.2");
	//System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
	Assert.assertTrue(actualResult1);
	System.out.println("Displayed Key Materials");
	
	}
	
	@Test(priority = 2)
	public void VerifyEvidenceSectionOfSolutionPlay() throws InterruptedException {
	boolean actualResult4 = cataloguePage.getSPEvidenceCheck().getText()
			.contains("Customer Evidence");
	//System.out.println("Evidence displaed as expected =" + cataloguePage.getEDFEvidenceCheck().getText());
	Assert.assertTrue(actualResult4);
	System.out.println("Displayed Evidence in Customer Evidence");
	}
	
	@Test(priority = 3)
	public void VerifySeeAllCustomerEvidenceSearchPageFromSolutionPlayPage() throws Throwable {
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
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Customer Evidence Search"));
		System.out.println("New Tab URL - " + driver.getCurrentUrl());
		boolean actualResult2 = driver.getCurrentUrl().contains("Build%20and%20Modernize%20AI%20Apps");
		Assert.assertTrue(actualResult2);
		System.out.println("New Tab URL - " + driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(mainTab);
	}
	
	
	@Test(priority = 4)
	public void VerifyCatalogueOfferSectionOfSolutionPlay() throws InterruptedException {
		Thread.sleep(2000);
		boolean actualResult6 = cataloguePage.getCatalogueOffer().getText().contains("Catalogue Offer");
		// System.out.println("Catalogue Offer displaed as expected =" +
		// cataloguePage.getCatalogueOffer().getText());
		Assert.assertTrue(actualResult6);
		System.out.println("Displayed Catalogue Offer ");
	}
	@Test(priority = 5)
	public void VerifyBoMSectionOfSolutionPlay() throws InterruptedException {
		cataloguePage.clickOnSPBOMTABButton();
		cataloguePage.clickonBaMAIAppsSselectAllBomButton();
	Assert.assertTrue(cataloguePage.isDisplayedDownloadButton());
	System.out.println("BOM is displayed and able to download ");
	Thread.sleep(2000);
	cataloguePage.clickOnDownloadSectionCloseButton();
	Thread.sleep(2000);
	}
	@Test(priority = 6)
	public void VerifyArtifactSectionOfSolutionPlay() throws InterruptedException {
		cataloguePage.clickArtefactButton();
		// cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		Thread.sleep(5000);
		boolean actualResult8 = cataloguePage.getArtifactTabName().getText().contains("Catalogue Artifact");
		 System.out.println("Artifact displaed as expected =" + cataloguePage.getArtifactTabName().getText());
		Assert.assertTrue(actualResult8);
		System.out.println("Displayed Artifact ");
	}
	
	@Test(priority = 7)
	public void verify_SolutionPlay() {

		Assert.assertTrue(driver.getCurrentUrl().contains("solutionplay"));
		log.info("Solution Play displayed");
	}
	
	@Test(priority = 8)
	public void verifyCustomerHubPageFromSolutionPlay() throws Throwable 
	{
		resourcesPage.clickOnSPshowSearchListButton();
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
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}