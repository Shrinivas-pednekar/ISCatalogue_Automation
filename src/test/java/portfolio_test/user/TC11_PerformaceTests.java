
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

public class TC11_PerformaceTests extends TestBase {
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
	public void VerifyCloudTransitionServicesLoadtime() throws InterruptedException {
		homePage.clickViewChangeDropdown();
		//Thread.sleep(2000);
		homePage.clickISSellerViewButton();
		Thread.sleep(2000);
		homePage.clickOnCloudTransitionServicesLink();
		long startTime = System.currentTimeMillis();
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		    System.out.println("Page Name: - " + driver.getTitle());
		    
		   
		        Assert.assertTrue(driver.getTitle().contains("Cloud Transition Services"));
		
		        long endTime = System.currentTimeMillis();
		        long loadTime = endTime - startTime;

		        System.out.println("Page loaded in " + loadTime + " milliseconds");
		        driver.close();
				driver.switchTo().window(mainTab);
		    }
	@Test(priority = 2)
	public void VerifyCloudManagementOperationsLoadtime() throws InterruptedException {
		homePage.clickViewChangeDropdown();
		//Thread.sleep(2000);
		homePage.clickISSellerViewButton();
		Thread.sleep(2000);
		homePage.clickOnCloudManagementOperationsLink();
		long startTime = System.currentTimeMillis();
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		    System.out.println("Page Name: - " + driver.getTitle());
		    
		   
		        Assert.assertTrue(driver.getTitle().contains("Cloud Management and Operations"));
		
		        long endTime = System.currentTimeMillis();
		        long loadTime = endTime - startTime;

		        System.out.println("Page loaded in " + loadTime + " milliseconds");
		        driver.close();
				driver.switchTo().window(mainTab);
		    }
	@Test(priority = 3)
	public void VerifyProductInnovationDevelopmentServicesLoadtime() throws InterruptedException {
		homePage.clickViewChangeDropdown();
		//Thread.sleep(2000);
		homePage.clickISSellerViewButton();
		Thread.sleep(2000);
		homePage.clickOnDProductInnovationDevelopmentServicesLinkLink();
		long startTime = System.currentTimeMillis();
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		    System.out.println("Page Name: - " + driver.getTitle());
		    
		   
		        Assert.assertTrue(driver.getTitle().contains("Product Innovation Development Services"));
		
		        long endTime = System.currentTimeMillis();
		        long loadTime = endTime - startTime;

		        System.out.println("Page loaded in " + loadTime + " milliseconds");
		        driver.close();
				driver.switchTo().window(mainTab);
		    }

	@Test(priority = 4)
	public void VerifyEndtoEndMachineLearningLoadtime() throws InterruptedException {
		homePage.clickViewChangeDropdown();
		//Thread.sleep(2000);
		homePage.clickISSellerViewButton();
		Thread.sleep(2000);
		homePage.clickOnDProductInnovationDevelopmentServicesLinkLink();
		
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		   // System.out.println("Page Name: - " + driver.getTitle());
		    cataloguePage.clickArtefactButton();
		    cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		    //Thread.sleep(6000);
		    long startTime = System.currentTimeMillis();
		    homePage.clickOnEndtoEndMachineLearningLinkLink();
		    System.out.println("Page Name: - " + driver.getTitle());
		        Assert.assertTrue(driver.getTitle().contains("End-to-End Machine Learning"));
		
		        long endTime = System.currentTimeMillis();
		        long loadTime = endTime - startTime;

		        System.out.println("Page loaded in " + loadTime + " milliseconds");
		        driver.close();
				driver.switchTo().window(mainTab);
		    }

	@Test(priority = 5)
	public void VerifyDataStrategyLoadtime() throws InterruptedException {
		//driver.get("https://servicesportfoliodev.azurewebsites.net/Artifact?Title=End-to-End%20Machine%20Learning&OID=1794");
		driver.get("https://catalog.ms/Artifact?Title=End-to-End%20Machine%20Learning&OID=1794");
		    cataloguePage.clickArtefactButton();
		    cataloguePage.ArtifactsTabtwaitForElementToBeVisible();
		    long startTime = System.currentTimeMillis();
		    homePage.clickOnDataStrategyLink();
		    System.out.println("Page Name: - " + driver.getTitle());
		        Assert.assertTrue(driver.getTitle().contains("Data Strategy"));
		
		        long endTime = System.currentTimeMillis();
		        long loadTime = endTime - startTime;

		        System.out.println("Page loaded in " + loadTime + " milliseconds");
		      
		    }


	@AfterTest
	public void teardown() {
		driver.quit();
	}
}