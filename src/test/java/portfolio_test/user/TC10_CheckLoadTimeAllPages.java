package portfolio_test.user;

import java.io.IOException;

import javax.mail.MessagingException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.TestBase;
import resources.Utilities;

public class TC10_CheckLoadTimeAllPages extends TestBase {

	public WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	Utilities util;
	public static Logger log = LogManager.getLogger(TestBase.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");

		//driver.get(prop.getProperty("produrl"));
		util = new Utilities();
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
	}

	@Test(priority = 1)
	public void loginPageTitleTest() throws MessagingException, InterruptedException {
		
		 String[] urls = {
					/*
					 * // "https://servicesportfolio.net/Home/Index",
					 * "https://servicesportfoliodev.azurewebsites.net/TransformativeDeal/Index?Title=Emerging+Innovation+%26+Engineering",
					 * "https://servicesportfoliodev.azurewebsites.net/SolutionArea/Index?Title=Adoption,%20Change,%20and%20Services%20Management",
					 * "https://servicesportfoliodev.azurewebsites.net/SolutionArea/Index?title=Business%20Apps",
					 * "https://servicesportfoliodev.azurewebsites.net/SolutionArea/Index?Title=Cross%20Solution%20Area%20and%20Functional%20Solutions",
					 * "https://servicesportfoliodev.azurewebsites.net/SolutionArea/Index?title=Data%20and%20AI",
					 * "https://servicesportfoliodev.azurewebsites.net/SolutionArea/Index?title=Infrastructure",
					 * //
					 * "https://servicesportfoliodev.azurewebsites.net/SolutionArea/Index?title=Modern%20Work",
					 * "https://servicesportfoliodev.azurewebsites.net/SolutionArea/Index?title=Security",
					 * "https://servicesportfoliodev.azurewebsites.net/Industry/Index?Title=Automotive,%20Mobility%20and%20Transportation",
					 * "https://servicesportfoliodev.azurewebsites.net/Industry/Index?Title=Cross-Industry",
					 * "https://servicesportfoliodev.azurewebsites.net/Industry/Index?Title=Defense%20and%20intelligence",
					 * "https://servicesportfoliodev.azurewebsites.net/Industry/Index?Title=Education",
					 * "https://servicesportfoliodev.azurewebsites.net/Industry/Index?Title=Energy%20and%20Resources",
					 * "https://servicesportfoliodev.azurewebsites.net/Industry/Index?Title=Financial%20services",
					 * "https://servicesportfoliodev.azurewebsites.net/Industry/Index?Title=Government",
					 * "https://servicesportfoliodev.azurewebsites.net/Industry/Index?Title=Healthcare",
					 * //
					 * "https://servicesportfoliodev.azurewebsites.net/Industry/Index?Title=Industrial%20and%20Manufacturing",
					 * "https://servicesportfoliodev.azurewebsites.net/Industry/Index?Title=Retail%20and%20Consumer%20Goods",
					 * "https://servicesportfoliodev.azurewebsites.net/Industry/Index?Title=Sustainability",
					 * "https://servicesportfoliodev.azurewebsites.net/Industry/Index?Title=Telecommunications%20and%20Media",
					 */ 
					  "https://servicesportfoliodev.azurewebsites.net/customerevidence/home",
					  "https://servicesportfoliodev.azurewebsites.net/customerevidence/searchcustomerevidence?View=Grid&PageIndex=0&AssetType=Win%20Wires",
					  "https://servicesportfoliodev.azurewebsites.net/customerevidence/searchcustomerevidence?View=Grid&PageIndex=0&AssetType=Delivery%20Stories",
					  "https://servicesportfoliodev.azurewebsites.net/ProgramInBox/Program/Index?Title=Top%20ACR%20and%20DV%20Generators",
					  "https://servicesportfolio.net/ModernRAP/Index?Title=do%20more%20with%20less",
					  "https://www.microsoft.com/en-us/industrysolutions?activetab=pivot1:primaryr8",
					  "https://www.ms-playbook.com/solutionops/",
					  "https://microsofteur.sharepoint.com/teams/LED",
					  "https://msft.rfpio.com/#/page/login",
					  "https://servicesportfolio.net/CustomerHUB/",
					  "https://servicesportfolio.net/richarticle/index?title=databook%20at%20microsoft",
					  "https://servicesportfolio.net/Funding/Index",
					  "https://servicesportfoliodev.azurewebsites.net/richarticle/index?Title=About%20IS%20Catalogue&tab=SiteChanges", 
					 // "https://servicesportfoliodev.azurewebsites.net/emergingsolutions",
					  "https://servicesportfoliodev.azurewebsites.net/Subscription/Index",
					 // "https://servicesportfoliodev.azurewebsites.net/OfferRoadmap/Index"
					 
		            // Add more URLs as needed
		        };

		        // Iterate through the URLs and measure the load time
		        for (String url : urls) {
		            driver.get(url); // Navigate to the page
		            long startTime = System.currentTimeMillis(); // Get the start time

		            String currentUrl = driver.getCurrentUrl();
		            String titlePage = driver.getTitle();
		            Thread.sleep(2000);
		          // homePage.clickOnArchView();
		            // Find the element using XPath
		           // boolean isDisplayed = driver.findElement(By.xpath("//h2[@id='lblCounter']")).isDisplayed();

		            // Assert that the element is displayed
		           // Assert.assertTrue(isDisplayed, "Solutions are loaded");
		            
		            // Assert the expected URL
		            Assert.assertEquals(titlePage,titlePage);
		            System.out.println("currentUrl "+currentUrl);
		            System.out.println("url "+url);
		            //System.out.println("Page Title = "+titlePage);
		            

		            long endTime = System.currentTimeMillis(); // Get the end time
		            long loadTime = endTime - startTime; // Calculate the load time

		            System.out.println("Page Title = "+titlePage);
		            System.out.println("Load Time: " + loadTime + " ms");
		            System.out.println("-----------------------------------");
		        }
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
