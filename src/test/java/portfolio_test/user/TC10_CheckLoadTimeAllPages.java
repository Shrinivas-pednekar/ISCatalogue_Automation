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
					
					  // "https://servicesportfolio.net/Home/Index",
					 /* "https://catalog.ms/ProgramInBox/Program/Index?Title=Digital%20Enablement%20and%20operations",
					  "https://catalog.ms/SolutionArea/Index?Title=Adoption,%20Change,%20and%20Services%20Management",
					 "https://catalog.ms/SolutionArea/Index?title=Business%20Apps",
					  "https://catalog.ms/SolutionArea/Index?title=Digital%20and%20Application%20Innovation",
					  "https://catalog.ms/SolutionArea/Index?title=Data%20and%20AI",
					  "https://catalog.ms/SolutionArea/Index?title=Infrastructure",
					  "https://catalog.ms/SolutionArea/Index?title=Modern%20Work",
					  "https://catalog.ms/SolutionArea/Index?title=Security",
					  
					  "https://catalog.ms/Industry/Index?Title=Mobility",
					  "https://catalog.ms/Industry/Index?Title=Cross-Industry",
					  "https://catalog.ms/Industry/Index?Title=Defense%20and%20intelligence",
					  "https://catalog.ms/Industry/Index?Title=Education",
					  "https://catalog.ms/Industry/Index?Title=Energy",
					  "https://catalog.ms/Industry/Index?Title=Financial%20services",
					  "https://catalog.ms/Industry/Index?Title=Government",
					  "https://catalog.ms/Industry/Index?Title=Healthcare",
					  "https://catalog.ms/Industry/Index?Title=Industrials%20and%20Manufacturing",
					  "https://catalog.ms/Industry/Index?Title=Retail%20and%20Consumer%20Goods",
					  "https://catalog.ms/Industry/Index?Title=Sustainability",
					  "https://catalog.ms/Industry/Index?Title=Telecommunications%20and%20Media",
					  
					  "https://catalog.ms/customerevidence/home",
					  "https://catalog.ms/customerevidence/searchcustomerevidence?View=Grid&PageIndex=0&AssetType=Win%20Wires",
					  "https://catalog.ms/customerevidence/searchcustomerevidence?View=Grid&PageIndex=0&AssetType=Delivery%20Stories",
					  "https://catalog.ms/customerhub",
					  "https://catalog.ms/ProgramInBox/Program/Index?Title=Top%20ACR%20and%20DV%20Generators",
					  "https://catalog.ms/ProgramInBox/Program/Index?Title=partner%20delivery%20orchestration%20center",
					  "https://catalog.ms/ModernRAP?Title=Azure%20AI%20Hub%20-%20Innovation%20to%20scale",
					  "https://catalog.ms/richarticle/index?title=catalogue-updates",
					  "https://catalog.ms/Funding",
					  "https://catalog.ms/CatalogueOffer/Index?Title=Cloud%20Transition%20Services&OID=2016",
					  "https://catalog.ms/CatalogueOffer/Index?Title=Cloud%20Management%20and%20Operations&OID=2018",
					  "https://catalog.ms/Artifact/Index?Title=Azure%20Cloud%20Foundation&OID=1657",
					  "https://catalog.ms/Artifact/Index?Title=Custom%20Copilot%20for%20Enterprise%20Applications&OID=2170",
					  "https://catalog.ms/SolutionPlay/Index?Title=Build%20and%20Modernize%20AI%20Apps",
					  "https://catalog.ms/SolutionPlay/Index?Title=Power%20Business%20Decisions%20with%20Cloud%20Scale%20Analytics",
					  "https://catalog.ms/CustomerEvidence/CustomerStoryPage/Index?title=%23BetterTogether%C2%A0effort%20helps%20Government%20of%20Ontario%C2%A0digitally%20transform&source=Centralized%20Repository",
					  "https://catalog.ms/CustomerEvidence/CustomerStoryPage/Index?title=Carl%20Zeiss%3A%20Data%20Estate%20Modernization%20eVA3.0&source=Centralized%20Repository",
					 */"https://servicesportfoliodev.azurewebsites.net/CatalogueOffer/Index?Title=Cloud%20Transition%20Services&OID=2016",
					  "https://servicesportfoliodev.azurewebsites.net/CatalogueOffer/Index?Title=Cloud%20Management%20and%20Operations&OID=2018",
					  "https://servicesportfoliodev.azurewebsites.net/Artifact/Index?Title=Azure%20Cloud%20Foundation&OID=1657",
					  "https://servicesportfoliodev.azurewebsites.net/Artifact/Index?Title=Custom%20Copilot%20for%20Enterprise%20Applications&OID=2170",
					/*
					 * "https://msft.rfpio.com/#/page/login",
					 * "https://servicesportfolio.net/CustomerHUB/",
					 * "https://servicesportfolio.net/richarticle/index?title=databook%20at%20microsoft",
					 * "https://servicesportfolio.net/Funding/Index",
					 * "https://catalog.ms/richarticle/index?Title=About%20IS%20Catalogue&tab=SiteChanges",
					 */// "https://catalog.ms/emergingsolutions",
					 // "https://catalog.ms/Subscription/Index",
					 // "https://catalog.ms/OfferRoadmap/Index"
					 
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
