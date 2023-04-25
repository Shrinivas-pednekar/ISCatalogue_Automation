
package portfolio_test.user;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;
import javax.swing.text.Utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CampaignsPage;
import pageObjects.HomePage;

import resources.TestBase;

public class TC07_BrokenLinkChecker extends TestBase {
	public WebDriver driver;
	  public static void main(String[] args) throws IOException {
	     //   System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver"); // Set the path to chromedriver
	        WebDriver driver = new EdgeDriver();
	        driver.get("https://servicesportfolio.net/Home/Index"); // Open the website to be tested

	        List<WebElement> links = driver.findElements(By.tagName("a")); // Find all links on the page
	        for (WebElement link : links) {
	            String url = link.getAttribute("href");
	            if (url == null || url.isEmpty()) { // Check if URL is empty or null
	                System.out.println("URL is either not configured for anchor tag or it is empty");
	                continue;
	            }

	            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection(); // Open the URL connection
	            connection.setRequestMethod("HEAD"); // Set the request method as HEAD
	            connection.connect(); // Connect to the URL
	            int responseCode = connection.getResponseCode(); // Get the response code

	            if (responseCode >= 400) { // Check if response code indicates a broken link
	                System.out.println(url + " is a broken link.");
	            } else {
	                System.out.println(url + " is a valid link.");
	            }
	        }
	        driver.quit(); // Close the WebDriver instance
	    }
}