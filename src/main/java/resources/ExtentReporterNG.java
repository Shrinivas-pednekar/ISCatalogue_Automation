package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG
{
	static ExtentReports extent;
	Utilities util = new Utilities();
	
	
	public static ExtentReports getReportObject()
	{
		
		String path =System.getProperty("user.dir")+"\\reports\\ISCatalogue_TestExecutionReport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Porfolio Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("OS", "Windows 11");
		extent.setSystemInfo("Browser", "Edge");
		extent.setSystemInfo("Tool", "Selenium WebDriver");
		extent.setSystemInfo("Tester", "Shrinivas");
		return extent;

		
	}
	
}
