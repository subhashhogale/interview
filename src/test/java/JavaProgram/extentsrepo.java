package JavaProgram;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentsrepo {
	static WebDriver driver;
	static ExtentReports repo;
	static ExtentSparkReporter sp;
	@BeforeMethod
	public void init() {
		
		sp=new ExtentSparkReporter("./target/ExtentReport1.html");
		sp.config().setDocumentTitle("Testing Done");
		
		sp.config().setReportName("Automation");
		;
		sp.config().setTheme(Theme.STANDARD);
		
		repo=new ExtentReports();
		
		repo.attachReporter(sp);
		repo.setSystemInfo("QA", "Shailaja");
		repo.setSystemInfo("Env", "QA Env");
		
		repo.setSystemInfo("OS","Window");
		
		repo.setSystemInfo("Testing", "Smoke");
	
		driver=new ChromeDriver();
		
		repo.setSystemInfo("Browser", "Chrome " + ((ChromiumDriver) driver).getCapabilities().getBrowserVersion());
		
	}
	
	@Test
	public void firstTest() throws IOException {
		
		ExtentTest v = repo.createTest("login test1");
		driver.get("https://www.google.com/");
		v.pass("url open succefully");
		
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		String v1 = scren.captureScreenshot(driver);
		v.addScreenCaptureFromPath(v1);
		repo.flush();
		
	}

}
